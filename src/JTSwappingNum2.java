public class JTSwappingNum2 {

    public static void main(String[] args) {

        int a = 6;
        int b = 5;

        a = b+a-(b=a);
        System.out.println(a  + " & " + b);
    }
}
