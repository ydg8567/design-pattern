package create_instance_pattern.prototype_pattern;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@AllArgsConstructor
class Book{
    private String author;
    private String title;
}

@Getter
@Setter
@ToString
class BookShelf implements Cloneable{
    private ArrayList<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShelf another = new BookShelf();

        for(Book book : shelf) {
            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }

        return another;
    }
}

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook(new Book("orange", "Tomas"));
        bookShelf.addBook(new Book("apple", "James"));
        bookShelf.addBook(new Book("grape", "Edward"));


        BookShelf another = (BookShelf)bookShelf.clone();

        System.out.println(bookShelf);
        System.out.println(another);

        bookShelf.getShelf().get(0).setAuthor("Mango");
        bookShelf.getShelf().get(0).setTitle("Jane");

        System.out.println(bookShelf);
        System.out.println(another);
    }
}
