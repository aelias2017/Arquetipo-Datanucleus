package com.aelias.dao;

import java.util.Random;

import org.springframework.stereotype.Repository;

import com.aelias.exeption.NewException;

@Repository
public class TestDAOImp implements TestDAO{

	@Override
	public String getMensaje() throws NewException {
		Random ram = new Random();
		int var = ram.nextInt();
		if(var % 2 == 0) {
			return" mensaje de succes";
		}else {
			throw new NewException("mensaje de succes");
		}
		
	}

}
