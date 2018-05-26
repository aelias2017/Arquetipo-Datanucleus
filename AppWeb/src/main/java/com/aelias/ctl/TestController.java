package com.aelias.ctl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aelias.exeption.NewException;
import com.aelias.serv.TestServ;

@Controller
public class TestController {
	@Autowired
	private TestServ tserv;
	
	@RequestMapping(value= {"/saludo"},method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> saludo(@RequestParam("nombre") String nombre) {
		try {
			nombre = tserv.getMensaje()+" "+nombre;
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NewException nex) {
			return new ResponseEntity<String>(nex.getMessage(),HttpStatus.BAD_REQUEST);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_GATEWAY);
		}
	
		
	}

}
