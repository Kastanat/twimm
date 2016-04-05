package fi.kastanat.twimm.bean;

public class  KiinnostusImpl implements Kiinnostus{
	private int id;
	private String kiinnostus;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKiinnostus() {
		return kiinnostus;
	}
	public void setKiinnostus(String kiinnostus) {
		this.kiinnostus = kiinnostus;
	}
	@Override
	public String toString() {
		return "KiinnostusImpl [id=" + id + ", kiinnostus=" + kiinnostus + "]";
	}

}