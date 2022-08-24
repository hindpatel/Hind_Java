public class JTPalindromeNum {
    public static void main(String[] args) {

        int n=101,r,s=0;
        int t = n;

        while(n>0) {
            r = (n % 10);
            n = (n / 10);
            s = (s * 10) + r;
        }

        if (t==s)
            System.out.print("Its a Palindrome.");
        else
            System.out.print("Its Not.");
    }
}
