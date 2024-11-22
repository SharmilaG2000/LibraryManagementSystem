package library;

import java.util.ArrayList;
import java.util.List;



public class Library {
	
	private List<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void viewBooks() {
		System.out.println("Books in Library:");
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	public void borrowBook(String id) {
		for(Book book : books) {
			if(book.getId().equals(id) && !book.isBorrowed()) {
				book.borrowBook();
				System.out.println("Book borrowed successfully!");
				return;
			}
		}
		
		System.out.println("Invalid book ID or book not borrowed.");
	}
	
	public void returnBook(String id) {
		for(Book book : books) {
			if(book.getId().equals(id) && book.isBorrowed()) {
				book.returnBook();
				System.out.println("Book returned succesfully!");
				return;
			}
		}
		
		System.out.println("Invalid book ID or book not borrowed.");
	}

}
