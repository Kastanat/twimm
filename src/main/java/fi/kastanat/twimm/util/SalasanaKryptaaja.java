package fi.kastanat.twimm.util;

import org.springframework.security.crypto.password.StandardPasswordEncoder;



public class SalasanaKryptaaja {
	
	@SuppressWarnings("resource")
	public String kryptaaSalasana(String salasana) {
		StandardPasswordEncoder spe = new StandardPasswordEncoder();
		String kryptattuna = spe.encode(salasana);
		System.out.println("Salasanasi on kryptattuna (random suola mukana): " +kryptattuna);
		
		return kryptattuna;
		

	}

}
