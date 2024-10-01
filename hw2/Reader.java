package hw2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reader {
    private String name;
    private String readerID;
    private String registrationDate;
    private String contactNumber;
    private List<BorrowRecord> borrowHistory;

    public Reader(String name, String readerID, String registrationDate, String contactNumber) {
        this.name = name;
        this.readerID = readerID;
        this.registrationDate = registrationDate;
        this.contactNumber = contactNumber;
        this.borrowHistory = new ArrayList<>();
    }
  
    // 新增讀者的借閱紀錄
	public void addBorrowRecord(BorrowRecord record) {
		borrowHistory.add(record);
	}
    
	// 顯示讀者的借閱紀錄
    public List<BorrowRecord> getborrowHistory() {
		return borrowHistory;
	}
    
    // 檢查是否借超過三本書
    public boolean canBorrowMoreBooks() {
        int booksBorrowed = 0;
        for (BorrowRecord record : borrowHistory) {
            if (record.getReturnDate() == null) {
                booksBorrowed++;
            }
        }
        return booksBorrowed < 3;
    }
    
 
    // 顯示讀者姓名（為了顯示借閱紀錄）
    public String getName() {
        return name;
    }
}
