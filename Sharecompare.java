package com.siri.facebook;

import java.util.Comparator;

public class Sharecompare implements Comparator<Fbuser>{

	public int compare(Fbuser o1,Fbuser o2) {
		return o1.getSharecount().compareTo(o2.getSharecount());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
