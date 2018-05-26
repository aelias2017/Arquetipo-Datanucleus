package com.aelias.dao;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class PMF {
	private static final PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	
	  public PMF(){}
	  
	  public static PersistenceManagerFactory getPmf(){
		  return getOptional();
	  }
	  
	  public static PersistenceManagerFactory getOptional() {
	    	return pmf;
	    }

}
