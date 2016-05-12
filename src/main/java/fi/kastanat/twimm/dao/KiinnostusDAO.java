package fi.kastanat.twimm.dao;

import java.util.List;

import fi.kastanat.twimm.bean.Kiinnostus;

public interface KiinnostusDAO {

	public abstract void talleta(Kiinnostus kiinnostus);

	public abstract Kiinnostus etsi(int id);

	public abstract List<Kiinnostus> haeKaikki();

}