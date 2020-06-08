package java8.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import core.Book;

public class CollectionsRemoveDuplicate {
	
	
	public static void main(String[] args) {
		
		Book book1 = new Book("Book1",100);
		Book book2 = new Book("Book2",200);
		Book book3 = new Book("Book3",300);
		Book book4 = new Book("Book4",400);
		List<Book> dupBooks = Arrays.asList(book1, book2, book1, book3, book2, book4, book2, book4);
		
		Collection<Book> noDups = new HashSet<>(dupBooks);
		
		noDups.stream().forEach(book->System.out.println(book.getTitle()));
		
		
	}

}
