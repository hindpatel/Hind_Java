import java.util.Scanner;

public class JTFibonacciSeries {

    public static void main(String[] args) {

        int a = 0, b = 1, c = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.print("1 1 ");

        while (a <= n)
        {
            a=b+c;
            if(a>=n)
                break;
            System.out.print (a + " ");
            b=c;
            c=a;
        }
    }
}