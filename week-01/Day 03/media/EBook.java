public class EBook extends Media implements Printable {
    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("EBook: " + title + " by " + author);
    }

    @Override
    public void print() {
        System.out.println("Printing EBook: " + title);
    }
}