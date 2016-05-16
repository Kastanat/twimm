package fi.kastanat.twimm.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.kastanat.twimm.bean.Kiinnostus;
import fi.kastanat.twimm.dao.KiinnostusDAO;




@Controller
@RequestMapping (value="/")

public class KiinnostusController {
	
	
	@Inject
	private KiinnostusDAO dao;
	
	public KiinnostusDAO getDao() {
		return dao;
	}

	public void setDao(KiinnostusDAO dao) {
		this.dao = dao;
	
	
}
	
	//kiinnostuksien näyttäminen
		@RequestMapping(value="", method=RequestMethod.GET)
		public String haeKaikki( Model model) {
			
			List<Kiinnostus> kiinnostukset = dao.haeKaikki();
			 
			System.out.println("kiinnostus: "+kiinnostukset);
			model.addAttribute("kiinnostukset", kiinnostukset);
			return "tinderi";
		}
		
}
