public class JTArmstrongNum {

    public static void main(String[] args) {

        /*

        153 -> 1 5 3
                1*1*1+5*5*5+3*3*3
                1 + 125 +127
                153
        370 -> 3 7 0
                3*3*3+7*7*7+0*0*0
                27/343
                370
         */
        int n=155,r,s=0;
        int temp=n;

        while(n>0){
            r = (n%10);
            n = (n/10);
            s = s + (r*r*r);
        }

        if (temp==s)
            System.out.print("Armstrong Number it is.");
        else
            System.out.print("It is not.");
    }
}
