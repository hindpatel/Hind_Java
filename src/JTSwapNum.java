public class JTSwapNum {

    public static void main(String[] args) {

        int a = 5; // 101
        int b = 4; // 100
        //int temp;

        /*temp=a;
        a=b;
        b=temp;

       a=a+b; // a=5+4 = 9 -> 1001
        b=a-b; // b=9-4 = 5
        a=a-b; // a=9-5 = 4 */

        // ^ -> XOR  1 1 -> 0 (SAME VALUE = 0 ANSWER; DIFFERENT VALUES = 1 ANSWER)

        a=a^b; // 1 0 1(a) XOR(^) 1 0 0(b) -----> 0 0 1(new a)
        b=a^b; // 1 0 0(b) XOR(^) 0 0 1(a) -----> 1 0 1(new b) ----> 5
        a=a^b; // 0 0 1(a) XOR(^) 1 0 1(b) -----> 1 0 0(new a) ----> 4

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
