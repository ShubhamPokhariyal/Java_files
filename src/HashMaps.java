import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Maths",95);
        scores.put("Physics",93);
        System.out.println(scores);

        scores.putIfAbsent("English",91);
        System.out.println(scores);

        scores.replace("English",92);
        System.out.println(scores);

        System.out.println(scores.get("Maths"));
        System.out.println(scores.get("Lang"));

        System.out.println(scores.size());

        System.out.println(scores.containsKey("Maths"));
        System.out.println(scores.containsKey("Lang"));


        scores.forEach((key, value)->{
            System.out.println(key+"-"+value);
        });

        scores.forEach((key,value)->{
            scores.replace(key,value-10);
        });
        System.out.println(scores);

        scores.clear();
    }
}
