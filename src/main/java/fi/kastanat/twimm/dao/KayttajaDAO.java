package fi.kastanat.twimm.dao;

import java.util.List;

import fi.kastanat.twimm.bean.Kayttaja;

public interface KayttajaDAO {
	
	public abstract void talleta(Kayttaja kayttaja);

	public abstract Kayttaja etsi(int id);

	public abstract List<Kayttaja> haeKaikki();

}

