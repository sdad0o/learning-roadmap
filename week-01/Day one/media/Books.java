public class Book extends Media {
    private int pages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + pages + " pages";
    }
}
