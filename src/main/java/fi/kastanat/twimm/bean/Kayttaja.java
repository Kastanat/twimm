package fi.kastanat.twimm.bean;

import java.util.List;

public interface Kayttaja {

	public abstract int getId();

	public abstract void setId(int i);

	public abstract String getEtunimi();

	public abstract void setEtunimi(String etunimi);
	
	public abstract String getSukunimi();

	public abstract void setSukunimi(String sukunimi);
	
	public abstract String getSahkoposti();

	public abstract void setSahkoposti(String sahkoposti);
	
	public abstract String getKuvaus();

	public abstract void setKuvaus(String kuvaus);
	
	public abstract List<Kiinnostus> getKiinnostukset();
	
	public abstract void setKiinnostukset(List<Kiinnostus> kiinnostukset);
	
	public abstract String getSalasana();

	public abstract void setSalasana(String salasana);

	public abstract int getEnabled();

	public abstract void setEnabled(int enabled);
	
	public abstract int getRoleId();
	
	public abstract void setRoleId(int roleId);
	
}