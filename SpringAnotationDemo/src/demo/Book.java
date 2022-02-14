package demo;

import java.util.Objects;

public class Book
{
	 private Integer isbn;
	    private String title;
	    
	    private void initilized() 
	    {
	    	System.out.println("Creating Method here"); 	
		}
	    
	    private void delete() 
	    {
	    	System.out.println("distrioing the  Method"); 	
		}
	       
		public Integer getIsbn() {
			return isbn;
		}
		public void setIsbn(Integer isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public int hashCode() {
			return Objects.hash(isbn, title);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(isbn, other.isbn) && Objects.equals(title, other.title);
		}
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", getIsbn()=" + getIsbn() + ", getTitle()=" + getTitle()
					+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
					+ "]";
		}
		public Book(Integer isbn, String title) {
			super();
			this.isbn = isbn;
			this.title = title;
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}

}
