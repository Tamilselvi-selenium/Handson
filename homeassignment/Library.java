package week1.day2.homeassignment;

public class Library {

	public String addBook(String bookTitle) {
		return bookTitle;
		
	}
	public void issueBook() {
		System.out.println("Book issued Successfully");
	}
	public static void main(String[] args) {
		Library lb = new Library();
		System.out.println(lb.addBook("Book added successfully"));
		lb.issueBook();
	}

}
