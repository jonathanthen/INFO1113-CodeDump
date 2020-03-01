import java.lang.Iterable;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Book implements Iterable<Book.Page> {

    public static class Page {
        public final String contents;

        public Page(String p) {
            contents = p;
        }
    }

    public class BookReader implements Iterator<Page> {
        private int index;
        public BookReader() {
            index = 0;
        }
        public boolean hasNext() {
            return index < pages.size();
        }
        public Page next() {
            Page p = pages.get(index);
            index++;
            return p;
        }
    }
    private List<Page> pages;
    public Book() {
        pages = new ArrayList<Page>();
    }
    public void add(String contents) {
        pages.add(new Page(contents));
    }
    public Iterator<Book.Page> iterator() {
        return new BookReader();
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.add("Line 1");
        b.add("Line 2");
        for (Book.Page p : b) {
            System.out.println(p.contents);
        }
        Book.BookReader reader = b. new BookReader();
        while (reader.hasNext()) {
            Book.Page p = reader.next();
            System.out.println(p.contents);
        }
    }
}