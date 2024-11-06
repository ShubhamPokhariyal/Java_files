import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.remove(1);
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(3));
        System.out.println(numbers);
        numbers.set(0, 2);
        System.out.println(numbers);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
        System.out.println(numbers.contains(5));
        System.out.println(numbers.isEmpty());

        numbers.forEach(number ->{
            System.out.println(number*2);
        });

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number),number*2);
        });
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers.isEmpty());
    }
}
