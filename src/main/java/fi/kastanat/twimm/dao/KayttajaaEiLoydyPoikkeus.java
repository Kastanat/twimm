package fi.kastanat.twimm.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class KayttajaaEiLoydyPoikkeus extends RuntimeException{
	
	public KayttajaaEiLoydyPoikkeus(Exception cause) {
		super(cause);
	}

}
