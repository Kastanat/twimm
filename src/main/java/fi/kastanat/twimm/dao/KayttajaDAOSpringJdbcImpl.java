package fi.kastanat.twimm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import fi.kastanat.twimm.bean.Kayttaja;
import fi.kastanat.twimm.bean.KayttajanKiinnostukset;
import fi.kastanat.twimm.bean.Kiinnostus;

@Repository
public class KayttajaDAOSpringJdbcImpl implements KayttajaDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Tallettaa parametrina annetun henkilˆn tietokantaan. Tietokannan
	 * generoima id asetetaan parametrina annettuun olioon.
	 */
	public void talleta(Kayttaja k) {
		final String sql = "insert into kayttaja(etunimi, sukunimi, sahkoposti, kuvaus, salasana_encrypted, enabled, role_id) values(?,?,?,?,?,?,?)";

		// anonyymi sis‰luokka tarvitsee vakioina v‰litett‰v‰t arvot,
		// jotta roskien keruu onnistuu t‰m‰n metodin suorituksen p‰‰ttyess‰.
		final String etunimi = k.getEtunimi();
		final String sukunimi = k.getSukunimi();
		final String sahkoposti = k.getSahkoposti();
		final String kuvaus = k.getKuvaus();
		final String salasanaEncrypted = k.getSalasana();
		final int enabled = k.getEnabled();
		final int roleId = k.getRoleId();

		// jdbc pist‰‰ generoidun id:n t‰nne talteen
		KeyHolder idHolder = new GeneratedKeyHolder();

		// suoritetaan p‰ivitys itse m‰‰ritellyll‰ PreparedStatementCreatorilla
		// ja KeyHolderilla
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql,
						new String[] { "id" });
				ps.setString(1, etunimi);
				ps.setString(2, sukunimi);
				ps.setString(3, sahkoposti);
				ps.setString(4, kuvaus);
				ps.setString(5, salasanaEncrypted);
				ps.setInt(6, enabled);
				ps.setInt(7, roleId);
				return ps;
			}
		}, idHolder);

		// tallennetaan id takaisin beaniin, koska
		// kutsujalla pit‰isi olla viittaus samaiseen olioon
		k.setId(idHolder.getKey().intValue());

	}

	public Kayttaja etsi(int id) {
		String sql = "select id, etunimi, sukunimi, sahkoposti, kuvaus from kayttaja where id = ?";
		Object[] parametrit = new Object[] { id };
		RowMapper<Kayttaja> mapper = new KayttajaRowMapper();

		Kayttaja k;
		try {
			k = jdbcTemplate.queryForObject(sql, parametrit, mapper);
		} catch (IncorrectResultSizeDataAccessException e) {
			throw new KayttajaaEiLoydyPoikkeus(e);
		}
		return k;

	}
	
	public Kayttaja etsiSahkopostilla(String sahkoposti) {
		String sql = "select id, etunimi, sukunimi, sahkoposti, kuvaus from kayttaja where sahkoposti = ?";
		Object[] parametrit = new Object[] { sahkoposti };
		RowMapper<Kayttaja> mapper = new KayttajaRowMapper();

		Kayttaja k;
		try {
			k = jdbcTemplate.queryForObject(sql, parametrit, mapper);
		} catch (IncorrectResultSizeDataAccessException e) {
			throw new KayttajaaEiLoydyPoikkeus(e);
		}
		return k;

	}

	public List<Kayttaja> haeKaikki() {

		String sql = "select id, etunimi, sukunimi, sahkoposti, kuvaus from kayttaja";
		RowMapper<Kayttaja> mapper = new KayttajaRowMapper();
		List<Kayttaja> kayttajat = jdbcTemplate.query(sql, mapper);

		return kayttajat;
	}
	
	public void tallennaKayttajanKiinnostukset(int kaytId, int kiinId) {
		
		final String sql = "insert into kayttajanKiinnostus(kayttaja_id, kiinnostus_id) values(?,?)";

		// anonyymi sis‰luokka tarvitsee vakioina v‰litett‰v‰t arvot,
		// jotta roskien keruu onnistuu t‰m‰n metodin suorituksen p‰‰ttyess‰.
		final int kayttajaId = kaytId;
		final int kiinnostusId = kiinId;

		// jdbc pist‰‰ generoidun id:n t‰nne talteen
		//KeyHolder idHolder = new GeneratedKeyHolder();

		// suoritetaan p‰ivitys itse m‰‰ritellyll‰ PreparedStatementCreatorilla
		// ja KeyHolderilla
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, kayttajaId);
				ps.setInt(2, kiinnostusId);
				return ps;
			}
		}
		);

		// tallennetaan id takaisin beaniin, koska
		// kutsujalla pit‰isi olla viittaus samaiseen olioon
		//k.setId(idHolder.getKey().intValue());
		
	}
	
	public List<Kiinnostus> etsiKiinnostukset(int id) {
		String sql = "select kk.kiinnostus_id, k.nimi from kiinnostus k natural join kayttajanKiinnostus kk join kayttaja a on a.id=kk.kayttaja_id where a.id = ?";
		RowMapper<Kiinnostus> mapper = new KiinnostusRowMapper();
		Object[] parametrit = new Object[] { id };
		List<Kiinnostus> k = jdbcTemplate.query(sql, parametrit, mapper);

		return k;

	}
}
