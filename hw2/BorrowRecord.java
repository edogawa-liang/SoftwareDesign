package hw2;
import java.util.Date;

public class BorrowRecord {
    private Book book;
    private Reader reader;
    private String borrowDate;
    private String returnDate;

    public BorrowRecord(Book book, Reader reader, String borrowDate) {
        this.book = book;
        this.reader = reader;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }
    
    // 還書
    public void returnBook(String returnDate) {
		this.returnDate = returnDate;
		book.increaseBook();
	}  
    
    // 得到還書日期
    public String getReturnDate() {
        return returnDate;
    }
    
    public Book getBook() {
        return book;
    }
    
    // 當一個物件被用作字串（例如使用 System.out.println(object)）時，Java 會自動調用該物件的 toString() 方法
    @Override
    public String toString() {
        return "Borrow by: " + reader.getName() + ", Book: " + book.toString() + ", Borrow Date: " + borrowDate + 
               ", Return Date: " + (returnDate != null ? returnDate : "Not Returned");
    }
}
