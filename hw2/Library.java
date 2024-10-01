package hw2;
import java.util.ArrayList;
import java.util.List;

//圖書館有藏書與讀者清單
public class Library {
	private List<Book> books;
	private List<Reader> readers;
	
	public Library() {
		this.books = new ArrayList<>();
		this.readers = new ArrayList<>();
	}
	
	// 新增書
	public void addBook(Book book) {
		books.add(book);
	}
	// 新增讀者
	public void addReader(Reader reader) {
		readers.add(reader);
	}
	// 借書動作		
	public void borrowBook(Book book, Reader reader, String borrowDate) {
		if (book.isAvailable()) {
			if (!reader.canBorrowMoreBooks()) {
                System.out.println(reader.getName() + " has borrowed 3 books already.");
                }
			else {
				book.decreaseBook();
				BorrowRecord record = new BorrowRecord(book, reader, borrowDate);
				reader.addBorrowRecord(record);
				System.out.println(reader.getName() + " borrowed the book: " + book.getTitle() + " on " + borrowDate);	
			}
		} else {
			System.out.println("This book is not available now.");
		}
	}
	// 還書動作
	public void returnBook(Book book, Reader reader, String returnDate) {
	    boolean bookFound = false;
	    for (BorrowRecord record : reader.getborrowHistory()) {
	        // 找到與書籍匹配且尚未歸還的借閱記錄
	        if (record.getBook().equals(book) && record.getReturnDate() == null) {
	            record.returnBook(returnDate);  // 更新還書日期
	            System.out.println(reader.getName() + " returned the book: " + book.getTitle() + " on " + returnDate);
	            bookFound = true;
	            break;  // 找到對應紀錄後立即跳出迴圈，避免多次還書
	        }
	    }
	}
	
	// 顯示讀者的借閱紀錄
	public void showBorrowHistory(Reader reader) {
		List<BorrowRecord> records = reader.getborrowHistory();
		for (BorrowRecord record : records) {
			System.out.println(record); // 輸出已覆寫的 toString() 方法
		}
	}
}





