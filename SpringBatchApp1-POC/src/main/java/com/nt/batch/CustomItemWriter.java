package com.nt.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;


public class CustomItemWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> bookNameWithAuthorList) throws Exception {
		System.out.println("ItemWriter: write(-)");
		System.out.println(bookNameWithAuthorList);
	}

}
