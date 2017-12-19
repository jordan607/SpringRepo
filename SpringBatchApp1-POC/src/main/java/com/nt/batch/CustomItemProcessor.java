package com.nt.batch;
import org.springframework.batch.item.ItemProcessor;


public class CustomItemProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String bookNameWithoutAuthor) throws Exception {
		System.out.println("ItemProcessor:process(-)");
		String bookNameWithAuthor = "Book Name - "+bookNameWithoutAuthor+" | Author Name - ";
		
		if("Core Java".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Sriniwas";
		}else if("Design Patterns".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "raja ";
		}else if("Advance Java".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "ravi ";
		}else if("Spring FrameWork".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "karan";
		}else if("Hibernate Framework".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "rani";
		}
		return bookNameWithAuthor;
	}

}
