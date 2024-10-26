import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("hello %s. How old are you?",name);
        //int age = scanner.nextInt();
        //clean the buffer
        //scanner.nextLine();
        //typecast to int workaround
        int age = Integer.parseInt(scanner.nextLine());
        //double gpa = Double.parseDouble(scanner.nextLine());
        System.out.printf("%d is an excellent age for programming. What is your programming language?",age);
        String language = scanner.nextLine();
        System.out.printf("%s is a good language choice.",language);

        scanner.close();
    }
}
