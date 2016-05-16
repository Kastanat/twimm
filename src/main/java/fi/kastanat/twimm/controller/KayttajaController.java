package fi.kastanat.twimm.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.kastanat.twimm.bean.Kayttaja;
import fi.kastanat.twimm.bean.KayttajaImpl;
import fi.kastanat.twimm.bean.KayttajanKiinnostukset;
import fi.kastanat.twimm.bean.Kiinnostus;
import fi.kastanat.twimm.dao.KayttajaDAO;



@Controller
@RequestMapping (value="/kayttajat")
public class KayttajaController {

	@Inject
	private KayttajaDAO dao;
	
	@Autowired
	private KayttajanKiinnostukset kiinnostuksetScope;
	
	public KayttajaDAO getDao() {
		return dao;
	}

	public void setDao(KayttajaDAO dao) {
		this.dao = dao;
	}
	
	//FORMIN TEKEMINEN
	@RequestMapping(value="lomake", method=RequestMethod.GET)
	public String getCreateForm(Model model) {
		Kayttaja tyhjaKayttaja = new KayttajaImpl();
		tyhjaKayttaja.setEtunimi("oletusetunimi");
		
		model.addAttribute("kayttaja", tyhjaKayttaja);
		return "form";
	}
	//HENKILÖN TIETOJEN NÄYTTÄMINEN
	/*@RequestMapping(value="{id}", method=RequestMethod.GET)
	public String getView(@PathVariable Integer id, Model model) {
		Kayttaja kayttaja = dao.etsi(id);
		List<Kiinnostus> kaytKiinnostukset = dao.etsiKiinnostukset(id);
		kayttaja.setKiinnostukset(kaytKiinnostukset);
		model.addAttribute("kayttaja", kayttaja);
		
	
		
		return "henk/profiilisivu";
	}
*/
	//FORMIN TIETOJEN VASTAANOTTO
	@RequestMapping(value="lomake", method=RequestMethod.POST)
	public String create( @ModelAttribute(value="kayttaja") KayttajaImpl kayttajaImpl) {
		kayttajaImpl.setEnabled(1);
		kayttajaImpl.setRoleId(1);
		dao.talleta(kayttajaImpl);
		//id:iden pitäisi olla nyt session scopatussa kayttaja beanissa.
		for (int i = 0; i < kiinnostuksetScope.getKiinnostukset().size(); i++) {
			dao.tallennaKayttajanKiinnostukset(kayttajaImpl.getId(), kiinnostuksetScope.getKiinnostukset().get(i));
		}
		
		System.out.println(kiinnostuksetScope.getKiinnostukset().toString());
		return "ohjaus";
	}
		
	@RequestMapping(value="talletakiinnostukset", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public KayttajanKiinnostukset talletaKiinnostukset(@RequestBody KayttajanKiinnostukset kiinnostukset) {
		System.out.println("kiinnostus: "+ kiinnostukset.getKaikkiIdt());
		List<String> lista = new ArrayList<String>();
		ArrayList<Integer> kiinLista = new ArrayList<Integer>();
		lista = Arrays.asList(kiinnostukset.getKaikkiIdt().split(","));
		System.out.println(lista.toString());
		
		for (int i = 0; i < lista.size(); i++) {
			int id = Integer.parseInt(lista.get(i));
			kiinLista.add(id);
		}
		
		//Todo: täytä sessio scopauttuun kayttaja beaniin tiedot
		kiinnostuksetScope.setKiinnostukset(kiinLista);
		
		
		System.out.println("integer id lista: " + kiinLista.toString());
		
		System.out.println(lista.toString());
		return kiinnostuksetScope;        
	}
		




}
