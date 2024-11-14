public class AudioBook extends Book {
    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    private int runTime;

    AudioBook(String bookName, String authorName, int runTime){
        super(bookName,authorName,0);
        this.runTime = runTime;
    }
}
