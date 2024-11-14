import java.time.LocalDate;
import java.util.ArrayList;

public class User{
    private String userName;
    private LocalDate dateOfBirth;
    private final ArrayList<Book> books = new ArrayList<>();

    User(String userName, String dateOfBirth){
        this.userName = userName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName(){
        return userName;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now(); //2024-11-09
        //System.out.printf("User is %d years %d months %d days old",currentDate.getYear()-dateOfBirth.getYear(), currentDate.getMonthValue()-dateOfBirth.getMonthValue(), currentDate.getDayOfMonth()-dateOfBirth.getDayOfMonth());
        int age = currentDate.getYear()-dateOfBirth.getYear();
        if(currentDate.getMonthValue()-dateOfBirth.getMonthValue() < 0){
            age--;
        }else if(currentDate.getMonthValue()-dateOfBirth.getMonthValue() == 0){
            if(currentDate.getDayOfMonth()-dateOfBirth.getDayOfMonth() < 0){
                age--;
            }
        }
        return age;
    }

    public void borrow(Book book){
        books.add(book);
    }

}