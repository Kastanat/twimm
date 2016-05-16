package fi.kastanat.twimm.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.kastanat.twimm.bean.Kayttaja;
import fi.kastanat.twimm.bean.Kiinnostus;
import fi.kastanat.twimm.dao.KayttajaDAO;

@Controller
@RequestMapping(value = "/secure")
public class SecureController {
	
	@Inject
	private KayttajaDAO dao;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String paasivu(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Kayttaja kayttaja = dao.etsiSahkopostilla(authentication.getName());
		List<Kiinnostus> kaytKiinnostukset = dao.etsiKiinnostukset(kayttaja.getId());
		kayttaja.setKiinnostukset(kaytKiinnostukset);
		List <Kayttaja> kayttajat = dao.haeKaikki();
		for (int i = 0; i < kayttajat.size(); i++) {
			Kayttaja kayt = kayttajat.get(i);
			List<Kiinnostus> kiinnostukset = dao.etsiKiinnostukset(kayt.getId());
			kayt.setKiinnostukset(kiinnostukset);
		}
		
		model.addAttribute("kayttaja", kayttaja);
		model.addAttribute("kayttajat", kayttajat);
		
		return "henk/profiilisivu";
	}

}
