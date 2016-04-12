package fi.kastanat.twimm.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.kastanat.twimm.bean.Kayttaja;
import fi.kastanat.twimm.bean.KayttajaImpl;
import fi.kastanat.twimm.dao.KayttajaDAO;

@Controller
@RequestMapping (value="/kayttajat")
public class KayttajaController {

	
	//FORMIN TEKEMINEN
	@RequestMapping(value="lomake", method=RequestMethod.GET)
	public String getCreateForm(Model model) {
		Kayttaja tyhjaKayttaja = new KayttajaImpl();
		tyhjaKayttaja.setEtunimi("oletusetunimi");
		
		model.addAttribute("kayttaja", tyhjaKayttaja);
		return "form";
	}
	//HENKILÖN TIETOJEN NÄYTTÄMINEN
	@RequestMapping(value="profiilisivu", method=RequestMethod.GET)
	public String getView() {
		
		
		return "henk/profiilisivu";
	}
}
