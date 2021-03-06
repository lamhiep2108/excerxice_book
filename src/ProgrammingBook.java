public class ProgrammingBook extends Book {
    private String language;
    private String frameWork;

    public ProgrammingBook(String language, String frameWork) {
        this.language = language;
        this.frameWork = frameWork;
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String frameWork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "book code='"+getBookCode()+
                ", book name='"+getName()+
                ", price='"+getPrice()+
                ", author='"+getAuthor()+
                ", language='" + language + '\'' +
                ", frameWork='" + frameWork + '\'' +
                '}';
    }
}

