import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double double2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the operation: ");
        String operation = scanner.nextLine();

        switch(operation){
            case "sum":
                System.out.printf("%f + %f = %f",double1,double2,double1+double2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f",double1, double2, double1+double2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f",double1, double2, double1*double2);
                break;
            case "div":
                if(double2==0){
                    System.out.println("Cannot divide by 0");
                }else{
                    System.out.printf("%f / %f = %f",double1, double2, double1/double2);
                }
                break;
            default:
                System.out.println("This operation is not supported");
        }
    }
}
