package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ABC2 {
	public static void main(String[] args) {
		String[] arr1 = new String[] { "alpim_part_record", "part_record_manual", "res_identifier_record",
				"part_revision_record_manual", "part_revision_record", "product_part_record", "alternate_code_record",
				 "alpim_part_record", "part_record_manual", "res_identifier_record",
				"part_revision_record_manual", "part_revision_record", "product_part_record", "alternate_code_record",
				};

		String[] arr2 = new String[] { "alpim_part_record", "part_record_manual", "res_identifier_record",
				"part_revision_record_manual", "part_revision_record", "product_part_record", "alternate_code_record",
				"logistics_information_record" };
		List<String> list = new ArrayList<>();
		for(int i =0; i<arr2.length;i++) {
			String abc = arr2[i];
			for(int j=0;j<arr1.length;j++) {
				if(abc.equals(arr1[j])) {
					list.add(arr1[j]);
				}
			}
		}
		for(String str : list) {
			System.out.println(str);
		}
	}
}
