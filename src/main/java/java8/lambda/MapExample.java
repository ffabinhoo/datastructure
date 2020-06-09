package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import core.Book;

public class MapExample {
	
	public static void main(String[] args) {
		Book book1 = new Book("Book1",100);
		Book book2 = new Book("Book2",200);
		Book book3 = new Book("Book3",300);
		Book book4 = new Book("Book4",400);
		
		List<Book> books = Arrays.asList(book1, book2, book3, book4);
		
		List<Integer> ret = books.stream().map(book-> book.getPages()+1)
		.collect(Collectors.toList());
		//.forEach(val->System.out.println(val));
		
		ret.forEach(val->System.out.println(val));
		
	}
	
	

}
