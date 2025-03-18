interface IBook {
    void addTitle(String title);
    void addPublisher(String author);
    void addPublishYear(int publishYear);
    String title();
    String publisher();
    int publishYear();
}

class Book implements IBook {
    private String title;
    private String publisher;
    private int publishYear;

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
    public void addPubligsher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void addPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}

public class Books {
    public static void main(String[] args) { 
        Book book = new Book();
    }
}