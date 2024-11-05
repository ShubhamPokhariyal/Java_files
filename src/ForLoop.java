public class ForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }


        int[] numbers = {1,2,3,4,5,6};
        int sum = 0;
        for(int index = 0;index<numbers.length; index++){
            sum += numbers[index];
        }
        System.out.println(sum);


        int number = 5;
        for(int mul = 1; mul <= 10 ; mul++){
            System.out.printf("%d X %d = %d\n",number,mul,number*mul);
        }

        for(number = 1;number < 10; number++){
            for(int mul = 1; mul<=10;mul++){
                System.out.printf("%d X %d = %d\n",number,mul,number*mul);
            }
        }
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
