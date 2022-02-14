package SpringDemo;

import java.util.Objects;

public class Book
    {
        private Integer isbn;
        private String title;
        private String price;

        public Book() {
        }

        public Book(Integer isbn, String title, String price) {
            this.isbn = isbn;
            this.title = title;
            this.price = price;
        }

        public Book(String isbn, String title) {
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

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(price, book.price);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isbn, title, price);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "isbn=" + isbn +
                    ", title='" + title + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }
    }

