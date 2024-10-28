import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
//        char vowels[] = new char[5];
//        vowels[0] = 'a';
//        vowels[1] = 'e';
//        vowels[2] = 'i';
//        vowels[3] = 'o';
//        vowels[4] = 'u';

        char[] vowels = {'a','i','e','o','u'};

        System.out.println(Arrays.toString(vowels));

        //length
        System.out.println(vowels.length);

        //sort
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        //sorting in sub array
        int startingIndex = 1;   //inclusive
        int endingIndex = 4; //exclusive
        Arrays.sort(vowels,startingIndex,endingIndex);
        System.out.println(Arrays.toString(vowels));

        //binary search
        char key = 'a';
        int index = Arrays.binarySearch(vowels,key);
        System.out.println(index);

        //search in sub array
        index = Arrays.binarySearch(vowels,startingIndex,endingIndex, key);
        System.out.println(index);

        //fill
        Arrays.fill(vowels,'y');
        System.out.println(Arrays.toString(vowels));

        //fill in sub array
        Arrays.fill(vowels,startingIndex,endingIndex,'x');
        System.out.println(Arrays.toString(vowels));

        //copy of
        char[] vowel_copy = Arrays.copyOf(vowels,vowels.length);
        vowels[0] = 'x';
        System.out.println(Arrays.toString(vowel_copy));

        //copy of range
        char[] vowel_another_copy = Arrays.copyOfRange(vowels,startingIndex,endingIndex);
        System.out.println(Arrays.toString(vowel_another_copy));

        //equals
        System.out.println(Arrays.equals(vowels,vowel_copy));
    }
}
