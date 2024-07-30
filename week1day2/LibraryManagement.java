package week1day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library nw=new Library();
		System.out.println(nw.addBook("Book added Successfully"));
		nw.issueBook();
	}

}
