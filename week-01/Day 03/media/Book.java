public class Book extends Media implements Printable {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }

    @Override
    public void print() {
        System.out.println("Printing Book: " + title);
    }