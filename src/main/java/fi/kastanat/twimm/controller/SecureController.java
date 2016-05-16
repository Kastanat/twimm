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
		model.addAttribute("kayttaja", kayttaja);
		
		return "henk/profiilisivu";
	}

}
