package com.aelias.rest;

import com.aelias.vo.VO;

public class SeviceMock {
	
	
	public VO serviceGet(String name) {
		VO obj = new VO();
		obj.setName(name);
		obj.setMessage("success");
		obj.setCode(200);
		System.out.println(name);
		return name.equals("")?new VO():obj;
	}
	
	public VO servicePost(VO ob) {
		ob.setCode(200);
		ob.setMessage("succes");
		return ob != null?ob:new VO();
	}
	
	

}
