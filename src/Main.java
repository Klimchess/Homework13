import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author ivanovIvan = new Author("Ivan", "Ivanov");
        Book firstBook = new Book("First", ivanovIvan, 2022);
        System.out.println(firstBook.getBookName() + " " + firstBook.getPublishDate() + " "
                + firstBook.getAuthor().getName() + " " + firstBook.getAuthor().getSurname());
        Book secondBook = new Book("Second", new Author("Alexander", "Sidorov"),2020);
        System.out.println(secondBook.getBookName() + " " + secondBook.getPublishDate() + " "
                + secondBook.getAuthor().getName() + " " + secondBook.getAuthor().getSurname());
        firstBook.setPublishDate(2008);
        System.out.println(firstBook.getPublishDate());
    }

}