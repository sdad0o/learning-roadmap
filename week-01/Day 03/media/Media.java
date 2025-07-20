public abstract class Media {
    protected String title;
    protected String author;

    public Media(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display(); // abstract method
}