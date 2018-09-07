package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class ABC3 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1,"alpim_part_record");
		map.put(2,"part_record_manual");
		map.put(3,"res_identifier_record");
		map.put(4,"part_revision_record_manual");
		map.put(5,"part_revision_record");
		map.put(6,"product_part_record");
		map.put(7,"alternate_code_record");
		map.put(8,"logistics_information_record");
		Map<String,String> map1 = new HashMap<String, String>();
		Map<String,String> map2 = new HashMap<String, String>();
		map1.put("alpim_part_record","apr");
		map1.put("part_record_manual","prm");
		map1.put("alternate_code_record","acr");
		map1.put("logistics_information_record","lir");
		map1.put("res_identifier_record","rir");
		map1.put("product_part_record","ppr");
		map1.put("part_revision_record_manual","prrm");
		map1.put("part_revision_record","prr");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			String selected = entry.getValue();
			for(Map.Entry<String, String> entry1 : map1.entrySet()) {
				if(entry1.getKey().equals(selected)) {
					map2.put(entry1.getKey(), entry1.getValue());
				}
			}
		}
		for(Map.Entry<String, String> entry2 : map2.entrySet()) {
			System.out.println(entry2.getKey()+" : "+entry2.getValue());
		}
		
		
	}
}
