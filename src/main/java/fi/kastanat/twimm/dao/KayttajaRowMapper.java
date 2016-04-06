package fi.kastanat.twimm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.kastanat.twimm.bean.Kayttaja;
import fi.kastanat.twimm.bean.KayttajaImpl;

public class KayttajaRowMapper implements RowMapper<Kayttaja> {
	
	public Kayttaja mapRow(ResultSet rs, int rowNum) throws SQLException {
		Kayttaja k = new KayttajaImpl();
		k.setEtunimi(rs.getString("etunimi"));
		k.setSukunimi(rs.getString("sukunimi"));
		k.setSahkoposti(rs.getString("sahkoposti"));
		k.setKuvaus(rs.getString("kuvaus"));
		k.setId(rs.getInt("id"));
		
		return k;
	}

}
