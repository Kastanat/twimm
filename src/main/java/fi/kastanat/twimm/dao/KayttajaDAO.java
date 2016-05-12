package fi.kastanat.twimm.dao;

import java.util.List;

import fi.kastanat.twimm.bean.Kayttaja;
import fi.kastanat.twimm.bean.Kiinnostus;

public interface KayttajaDAO {
	
	public abstract void talleta(Kayttaja kayttaja);

	public abstract Kayttaja etsi(int id);

	public abstract List<Kayttaja> haeKaikki();
	
	public abstract void tallennaKayttajanKiinnostukset(int kaytId, int kiinId);
	
	public abstract List<Kiinnostus> etsiKiinnostukset(int id);

}

