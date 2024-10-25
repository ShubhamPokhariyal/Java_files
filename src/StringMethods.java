public class StringMethods {
    public static void main(String[] args){
        String string = "This is a test string";
        String string2 = "This IS a test string";
        //length
        System.out.println(string.length());
        //is empty?
        System.out.println(string.isEmpty());
        //to uppercase
        System.out.println(string.toUpperCase());
        //to lowercase
        System.out.println(string.toLowerCase());
        //equals?
        System.out.println(string.equals(string2));
        //equals? ignore case
        System.out.println(string.equalsIgnoreCase(string2));
        //replace
        System.out.println(string.replace("test","TEST"));
        //find
        System.out.println(string.contains("string"));
    }
}
