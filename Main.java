import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog library = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning){
            System.out.println("-----------------------\n|Library Catalog Menu:|\n-----------------------");
            System.out.println("|1. Add a book              |");
            System.out.println("|2. Search books by title   |");
            System.out.println("|3. Search books by author  |");
            System.out.println("|4. Display available books |");
            System.out.println("|5. Check out a book        |");
            System.out.println("|6. Return a book           |");
            System.out.println("|7. Exit                    |");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the book genre: ");
                    String genre = scanner.nextLine();
                    LMS newBook = new LMS(title, author, genre);
                    library.addBook(newBook);
                    System.  out.println("Book added successfully!");
                    break;
                case "2":
                    System.out.print("Enter the title to search for: ");
                    String searchTitle = scanner.nextLine();
                    library.searchByTitle(searchTitle);
                    break;
                case "3":
                    System.out.print("Enter the author to search for: ");
                    String searchAuthor = scanner.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;
                case "4":
                    library.displayAvailableBooks();
                    break;
                case "5":
                    System.out.print("Enter the title of the book to check out: ");
                    boolean isBookCheckedOut = library.checkoutBook(scanner.nextLine());
                    if (isBookCheckedOut) {
                        System.out.println("Book checked out successfully!");
                    } else {
                        System.out.println("Book not found or already checked out.");
                    }
                    break;
                case "6":
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    System.out.println("Book returned successfully!");
                    break;
                case "7":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;	
            }


            System.out.println();
        }

        System.out.println("Thank you for using YLMS!");
        
        scanner.close();
    }
}

