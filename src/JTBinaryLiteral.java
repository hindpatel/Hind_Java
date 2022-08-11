public class JTBinaryLiteral {

    public static void main(String[] args) {

        //int i = 0B101; //int i = 5;   "0B" or "0b" added before number for binary literal
        int i = 0B100_000_000_000; // "_" can be added to differentiate long numbers

        System.out.println(i);

    }
}
