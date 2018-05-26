package com.aelias.serv;

import org.springframework.beans.factory.annotation.Autowired;

import com.aelias.dao.TestDAO;
import com.aelias.exeption.NewException;

public class TestServImp implements TestServ {
	@Autowired
	private TestDAO tdao ;

	@Override
	public String getMensaje() throws NewException {
		
		return tdao.getMensaje();
	}

}
