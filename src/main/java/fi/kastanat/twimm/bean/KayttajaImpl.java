package fi.kastanat.twimm.bean;

import java.util.List;

public class KayttajaImpl implements Kayttaja{
	
	private int id;
	private String etunimi;
	private String sukunimi;
	private String sahkoposti;
	private String kuvaus;
	private List<Kiinnostus> kiinnostukset;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEtunimi() {
		return etunimi;
	}
	
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	
	public String getSukunimi() {
		return sukunimi;
	}
	
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	
	public String getSahkoposti() {
		return sahkoposti;
	}
	
	public void setSahkoposti(String sahkoposti) {
		this.sahkoposti = sahkoposti;
	}
	
	public String getKuvaus() {
		return kuvaus;
	}
	
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public List<Kiinnostus> getKiinnostukset() {
		return kiinnostukset;
	}

	public void setKiinnostukset(List<Kiinnostus> kiinnostukset) {
		this.kiinnostukset = kiinnostukset;
	}

	@Override
	public String toString() {
		return "KayttajaImpl [id=" + id + ", etunimi=" + etunimi
				+ ", sukunimi=" + sukunimi + ", sahkoposti=" + sahkoposti
				+ ", kuvaus=" + kuvaus + "]";
	}

}
