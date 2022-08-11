public class JTBitwiseOpr {

    // Bitwise Operator -> And&  OR|
    public static void main(String[] args) {
    /*
        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1
                    // 0 1 0 0 1   -> 9 is the value.
        int c = a & b; */

        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1
                    // 1 1 1 1 1    -> 31 is the value
        int c = a | b;

        System.out.println(c);
    }
}
