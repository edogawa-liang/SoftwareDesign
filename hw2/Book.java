package hw2;

public class Book {
    private String title; //宣告
    private String author;
    private String isbn;
    private int publishYear;
    private int availableNum;
    
	public Book(String title, String author, String isbn, int publishYear, int availableNum) {
		this.title = title; //初始化
		this.author = author;
		this.isbn = isbn;
		this.publishYear = publishYear;
		this.availableNum = availableNum;
	}
	// 確認是否庫存
	public boolean isAvailable() {
		return availableNum > 0;
	}
	// 確認庫存多少
	public int getAvailableNum() {
		return availableNum;
	}
	// 借書 書本庫存-1
	public void decreaseBook() {
		availableNum--;
	}
	// 還書 書本庫存+1
	public void increaseBook() {
		availableNum++;
	}
	// 顯示書名
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
	    return title + ", Author: " + author + ", ISBN: " + isbn;
	}
}
