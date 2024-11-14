import java.util.Scanner;


public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = sc.nextLine();
        System.out.println("Enter Date of Birth in YYYY-MM-DD format");
        String dateOfBirth = sc.nextLine();
        User youngerUser = new User(userName, dateOfBirth);
        int age = youngerUser.getAge();
        System.out.println(age);


        System.out.println("Enter book name");
        String bookName = sc.nextLine();
        System.out.println("Enter author name");
        String authorName = sc.nextLine();
        System.out.println("Enter page count");
        int pageCount = sc.nextInt();sc.nextLine();
        Book book = new Book(bookName,authorName,pageCount);

        AudioBook audioBook = new AudioBook("Dracula","Bram Stoker", 30000);

        youngerUser.borrow(book);
        System.out.printf("%s has borrowed these books: %s\n", youngerUser.getUserName(), youngerUser.getBooks().toString());

        System.out.println(audioBook);

        EBook ebook = new EBook("Carry ","pg wodehouse", 290, "pdf");
        System.out.println(ebook);
    }
}

