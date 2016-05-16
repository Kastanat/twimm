package fi.kastanat.twimm.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

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
		List <Kayttaja> kaikkiKayttajat = dao.haeKaikki();
		List <Kayttaja> top5Kayttajat = new ArrayList<Kayttaja>();
		
		for (int i = 0; i < kaikkiKayttajat.size(); i++) {
			Kayttaja kayt = kaikkiKayttajat.get(i);
			List<Kiinnostus> kaikkiKiinnostukset = dao.etsiKiinnostukset(kayt.getId());
			
			kayt.setKiinnostukset(kaikkiKiinnostukset);
			
		}
		
		long seed = System.nanoTime();
		Collections.shuffle(kaikkiKayttajat, new Random(seed));
		
		for (int i = 0; i < 5; i++) {
			top5Kayttajat.add(kaikkiKayttajat.get(i));
		}
		
		model.addAttribute("kayttaja", kayttaja);
		model.addAttribute("kayttajat", top5Kayttajat);
		
		return "henk/profiilisivu";
	}

}
