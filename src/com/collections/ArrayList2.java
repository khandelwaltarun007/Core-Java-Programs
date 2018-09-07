package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next() == 50) {
				itr.remove();
			}
			
		}
		
		list.removeIf(i->i%3==0);
		System.out.println(list);
	}

}
