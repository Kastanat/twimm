package fi.kastanat.twimm.bean;

import java.util.ArrayList;
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

}