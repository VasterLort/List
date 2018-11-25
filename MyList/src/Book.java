
public class Book {
	private String nameBook;
	private String nameAuthor;
	private String surnameAuthor;
	private int year;
	
	public Book(String nameBook, String nameAuthor, String surnameAuthor, int year) {
		this.nameBook = nameBook;
		this.nameAuthor = nameAuthor;
		this.surnameAuthor = surnameAuthor;
		this.year = year;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public String getSurnameAuthor() {
		return surnameAuthor;
	}

	public void setSurnameAuthor(String surnameAuthor) {
		this.surnameAuthor = surnameAuthor;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
