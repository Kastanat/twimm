package fi.kastanat.twimm.bean;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session")
public class KayttajanKiinnostukset {
	
	private ArrayList<Integer> kiinnostukset;
	private String kaikkiIdt;
	
	public ArrayList<Integer> getKiinnostukset() {
		return kiinnostukset;
	}
	public void setKiinnostukset(ArrayList<Integer> kiinnostukset) {
		this.kiinnostukset = kiinnostukset;
	}
	public String getKaikkiIdt() {
		return kaikkiIdt;
	}
	public void setKaikkiIdt(String kaikkiIdt) {
		this.kaikkiIdt = kaikkiIdt;
	}
}
