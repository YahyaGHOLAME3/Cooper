import java.util.ArrayList;
class LibraryCatalog {
    private ArrayList<LMS> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(LMS book) {
        books.add(book);
    }

    public void searchByTitle(String title) {
        System.out.println("Books with the title '" + title + "':");
        for (LMS book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.println("Books by author '" + author + "':");
        for (LMS book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        boolean noAvailableBooks = true;
        for (LMS book : books) {
            if (book.isAvailable() && !book.isCheckedOut()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
                noAvailableBooks = false;
            }
        }
        if (noAvailableBooks) {
            System.out.println("No books available.");
        }
    }

    public void returnBook(String title) {
        for (LMS book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    book.setCheckedOut(false);
                    System.out.println("Returned: " + book.getTitle());
                    return; // Exit the method after processing the book
                } else {
                    System.out.println("Book is already available.");
                    return; // Exit the method if the book is already available
                }
            }
        }
        System.out.println("Book not found in the catalog.");
    }


    public boolean checkoutBook(String Title){
    	for(LMS book : books){
    		if(book.getTitle().equalsIgnoreCase(Title)){
    			if(!book.isCheckedOut()){
    				book.setCheckedOut(true);
    				return true; //book checked out successfully !
    			}else {
    				return false; //book already checked out !!!
    			}
    		}
    		
    	}
    	return false; //book not added or not found in the catalog !
    }
}