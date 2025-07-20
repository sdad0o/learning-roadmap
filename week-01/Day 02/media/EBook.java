public class EBook extends Media {
    private String fileFormat;
    private double fileSize;

    public EBook(String title, String author, int year, String fileFormat, double fileSize) {
        super(title, author, year);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + fileFormat + ", " + fileSize + "MB]";
    }
}
