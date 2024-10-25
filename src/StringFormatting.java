public class StringFormatting {
    public static void main(String[] args){
        String name = "Shubham Pokhariyal";
        String country = "India";
        double cgpa = 8.1;
        int age = 22;
//        System.out.println("My name is "+name+" . I am from "+country+" . I am "+age+" years old.");
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. My cpga is %f.",name, country, age, cgpa);
        System.out.println(formattedString);
    }
}
