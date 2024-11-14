public class EBook extends Book{
    private String format;

    public String getFormat(){
        return format;
    }
    public void setFormat(String format){
        this.format = format;
    }
    EBook(String bookName, String authorName,int pageCount, String format){
        super(bookName, authorName, pageCount);
        this.format = format;
    }
}

