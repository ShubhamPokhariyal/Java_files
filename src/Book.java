public class Book {

    private String bookName;
    private String authorName;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    private int pageCount;
    Book(String bookName, String authorName,int pageCount){
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageCount = pageCount;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public String toString(){
        return String.format("%s by %s",bookName,authorName);
    }
}
