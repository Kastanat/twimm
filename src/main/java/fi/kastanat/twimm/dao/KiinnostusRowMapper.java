package fi.kastanat.twimm.dao;


	
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

	import fi.kastanat.twimm.bean.Kiinnostus;
	import fi.kastanat.twimm.bean.KiinnostusImpl;

	public class KiinnostusRowMapper implements RowMapper<Kiinnostus> {

		public Kiinnostus mapRow(ResultSet rs, int rowNum) throws SQLException {
			Kiinnostus k = new KiinnostusImpl();
			k.setKiinnostus(rs.getString("kiinnostus"));
			k.setId(rs.getInt("id"));
			
			return k;
		}

	}



