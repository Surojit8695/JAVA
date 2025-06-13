public class Sb {
    public static void main(String[] args) {
        String s1 = "hello";
        StringBuilder s2 = new StringBuilder("Hello");
        StringBuilder s3 = new StringBuilder("Hello"); // mutable

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s2.append("World");
        System.out.println(s2);

        s1.concat("World");
        System.out.println(s1);

        s3.append("Java");
        System.out.println(s3);
    }
}