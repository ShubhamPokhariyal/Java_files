public class StringDefinition {
    public static void main(String[] args){
        String name = "check 123";
        String name1 = new String("check 1344");

        String literalString1 = "abc";
        String literalString2 = "abc";
        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1==literalString2);
        System.out.println(objectString1==objectString2);
    }
}
