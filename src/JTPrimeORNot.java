public class JTPrimeORNot {

    public static void main(String[] args) {

/*        int n = 4;
        boolean b = isPrime(n);
        if(b)
            System.out.println("Its a Prime number.");
        else
            System.out.println("Its not a Prime number.");
    }
    public static boolean isPrime(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
                return false;
        }
        return true; */

        int num = 17;
        boolean isPrime = true;

        //for(int i=2; i<num; i++)
        //for(int i=2; i<num/2; i++)
        for(int i=2; i<Math.sqrt(num); i++)
        {
            if(num%i==0) //% calculates the remainder, in this case checks if the remainder is 0.
            {
                isPrime = false;
                //break;
            }
        }
        if(isPrime)
        {
            System.out.println(num + " is a Prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}