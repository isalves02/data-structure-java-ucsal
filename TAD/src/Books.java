interface IBooks {
    void addTitle(String title);
    void addPublisher(String author);
    void addPublishYear(int publishYear);
    String title();
    String publisher();
    int publishYear();
}

public class Books implements IBooks {
    String title;
    String publisher;
    int publishYear;

    @Override
    public String publisher() {
        return publisher;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public int publishYear() {
        return publishYear;
    }

    @Override
    public void addTitle(String title) {
        this.title = title;
    }

    @Override
    public void addPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void addPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public static void main(String[] args) { }
}