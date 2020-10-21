package lab2q3;
public class BookStore extends Book {
	
	Book books[] = { new Book("Java", "Schildt", "123456", 10),
			new Book("C", "Dennis", "123355", 7),
			new Book("DS", "Narasimha Karumanchi", "34354657", 9),
			new Book("OS", "Abraham", "5677889", 5),
			new Book("WebTech", "Uttam K. Roy", "345667", 12),
			new Book("Java-The Complete Reference ", "Herbert Schildt", "007045356", 4) };

	public void sell(String bookTitle, int noOfCopies) {
		boolean b = false;
		for (int i = 0; i < books.length; i++) {
			if ((books[i].getBookTitle() == bookTitle) && noOfCopies <= books[i].getNumOfCopies()) {
				b = true;
				int copies = books[i].getNumOfCopies() - noOfCopies;
				books[i].setNumOfCopies(copies);
			}
		}
		if (b == false)
			System.out.println("Book not found..");
	}

	public void order(String isbn, int noOfCopies) {
		boolean b = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getISBN() == isbn) {
				b = true;
				int copies = books[i].getNumOfCopies() + noOfCopies;
				books[i].setNumOfCopies(copies);
			}
		}
		if (b == false) {
			System.out.println("New Book is added....");
		}
	}

	public void display() {
		for (int i = 0; i < books.length; i++) {
			books[i].display();
		}
	}

}
