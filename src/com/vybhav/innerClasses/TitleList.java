package com.vybhav.innerClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TitleList {

	private List<String> titleList = new ArrayList<>();

	public void addTitle(String title) {
		titleList.add(title);
	}

	public void removeTitle(String title) {
		titleList.remove(title);
	}

	public Iterator<String> titleIterator() {
		class TitleIterator implements Iterator<String> {

			int count = 0;

			@Override
			public boolean hasNext() {
				return titleList.size() > count;
			}

			@Override
			public String next() {
				return titleList.get(count++);
			}
		}
		return new TitleIterator();
	}
}
