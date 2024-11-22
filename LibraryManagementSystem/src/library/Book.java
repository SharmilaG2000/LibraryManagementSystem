package library;

public class Book {
	
	String id,title, author;
	boolean isBorrowed;
	
	public Book(String id, String title,String author) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void borrowBook() {
		this.isBorrowed = true;
	}
	
	public void returnBook() {
		this.isBorrowed = false;
	}
	
	public String toString() {
		return "ID: "+ id + ", Title: " + title + ", Author: " + author + ", Status: "+ (isBorrowed? "Borrowed" : "Avaiable");
	}

}
