import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Media> library = new ArrayList<>();

        library.add(new Book("1984", "George Orwell"));
        library.add(new EBook("Java Guide", "Mosh Hamedani"));

        for (Media media : library) {
            media.display();  // Polymorphic call
            if (media instanceof Printable) {
                ((Printable) media).print();  // Interface call
            }
        }
    }
}