package fi.kastanat.twimm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import fi.kastanat.twimm.bean.Kiinnostus;
import fi.kastanat.twimm.dao.KiinnostusRowMapper;

@Repository
public class KiinnostusDAOSpringJdbmpl implements KiinnostusDAO{
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Kiinnostus> haeKaikki() {

		String sql = "select kiinnostus_id, nimi from kiinnostus";
		RowMapper<Kiinnostus> mapper = new KiinnostusRowMapper();
		List<Kiinnostus> kiinnostukset = jdbcTemplate.query(sql, mapper);

		return kiinnostukset;

}
	
	

	public void talleta(Kiinnostus kiinnostus) {
		// TODO Auto-generated method stub
		
	}

	public Kiinnostus etsi(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Kiinnostus haeKaikki(Integer id) {
		// TODO Auto-generated method stub
		return null; 
	}}