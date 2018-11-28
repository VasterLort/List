package by.it_academy.list.main;
import java.util.LinkedList;

import by.it_academy.list.book.Book;

public class Main{

	public static void main(String[] args) {
		LinkedList<Book> b = new LinkedList<Book>();
		Book b2 = new Book("s", "d", "d", 12);
		Book b3 = new Book("s", "d", "d", 13);
		b.addLast(b2);
		b.addLast(b3);
		System.out.println(b.size());
		System.out.println(b.isEmpty());	
		System.out.println(b.contains(b2));
	}
}
