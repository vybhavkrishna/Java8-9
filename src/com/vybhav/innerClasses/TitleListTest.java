package com.vybhav.innerClasses;

import java.util.Iterator;

public class TitleListTest {

	public static void main(String[] args) {
		TitleList t = new TitleList();
		t.addTitle("beginning java");
		t.addTitle("effective java");
		Iterator<String> iter = t.titleIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
