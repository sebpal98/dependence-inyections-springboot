package edu.uptc.swii.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uptc.swii.di.di_attribute.Book;
import edu.uptc.swii.di.di_attribute.Editorial;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		Editorial editorial = new Editorial(1, "Editorial UPTC");
		Book book = new Book(1, "meta modelo", editorial);
		System.out.println(book.toString());
	}

}
