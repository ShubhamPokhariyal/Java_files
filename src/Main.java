class Main{
    public static void main(String[] args){
        //variables
        int age;
        age = 22;
        System.out.println("I am "+age+" years old");

        //data types
        byte byt = 10;
        short shor = 101;
        int in = 10001;

        float floa = 1.123123f;
        double doubl = 1.123123123123;
        System.out.println(floa);
        System.out.println(doubl);

        char copyright ='\u00A9';
        System.out.println(copyright);

        //type conversion - implicit
        int number1 = 5;
        double number2 = number1;
        System.out.println(number2);

        //type conversion - explicit
        double number3 = 5.7;
        int number4 = (int)number3;
        System.out.println(number4);


        System.out.println(1==1);
    }
}