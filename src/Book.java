import java.util.Objects;

public class Book {private final String bookName;
    private final Author author;
    private int publishDate;
    public Book(String bookName, Author author, int publishDate) {
        this.bookName = bookName;
        this.author = author;
        this.publishDate = publishDate;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(int publishDate) {this.publishDate = publishDate;}
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishDate == book.publishDate && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return Objects.hash(bookName, author, publishDate);
    }
    public String toString() {
        return "Book{" + "bookName='" + bookName + '\'' + ", author=" + author + ", " +
                "publishDate=" + publishDate + '}';
    }
}

