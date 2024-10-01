package hw2;

public class Main {

	public static void main(String[] args) {
	    // 建立圖書館
		Library library = new Library();
		
		// 新書籍
		Book book1 = new Book("Java Programming", "John", "123456", 2021, 3);
		Book book2 = new Book("Python Programming", "Mary", "234567", 2021, 2);
		Book book3 = new Book("C Programming", "Tom", "345678", 2021, 1);
		Book book4 = new Book("C++ Programming", "Jack", "456789", 2021, 2);
		library.addBook(book1);
		library.addBook(book2);
		
		// 新讀者
		Reader reader1 = new Reader("Tom", "A123456789", "2021-09-01", "0912345678");
		Reader reader2 = new Reader("Mary", "B123456789", "2021-09-02", "0923456789");
		library.addReader(reader1);
		library.addReader(reader2);
		
		
		// 借書
		library.borrowBook(book1, reader1, "2021-09-01");
		library.borrowBook(book2, reader1, "2021-09-01");
		library.borrowBook(book3, reader1, "2021-09-01");
		library.borrowBook(book4, reader1, "2021-09-01");
		
		// 還書
		library.returnBook(book1, reader1, "2021-09-02");
		
		System.out.println("=========");
		
		// 顯示借閱紀錄
		library.showBorrowHistory(reader1);
	}

}
