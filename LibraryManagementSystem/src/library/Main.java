package library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		
		library.addBook(new Book("1","Java Programming","James Gosling"));
		library.addBook(new Book("2","Data Structures","Author 2"));
		
		while(true) {
			System.out.println("\n1. View Books");
			System.out.println("2. Borrow Book");
			System.out.println("3. Return Book");
			System.out.println("4. Exit");
			System.out.println("Choose an option");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				library.viewBooks();
				break;
			case 2:
				System.out.println("Enter Book ID to borrow: ");
				String borrowId = scanner.nextLine();
				library.borrowBook(borrowId);
				break;
			case 3:
				System.out.println("Enter Book ID to return: ");
				String returnId = scanner.nextLine();
				library.returnBook(returnId);
				break;
			case 4:
				System.out.println("Exiting.....");
				scanner.close();
				return;
			default:
			System.out.println("Invalid choice. Try again");
				
			}
		}

	}

}
