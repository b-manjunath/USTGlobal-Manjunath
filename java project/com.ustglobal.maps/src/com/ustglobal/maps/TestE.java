package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String,Integer> lh = new TreeMap<String,Integer>();
		lh.put("bangaluru",560068);
		lh.put("patna",134567);
		lh.put("hariyana",898900);
		//lh.put(null,878787);
		for(Map.Entry<String,Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is:"+key);
			System.out.println("value is:"+value);
			System.out.println("======================");
		}
	}
}
