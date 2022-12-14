import java.util.Random;

public class JTArrayRandom {

    public static void main(String[] args) {

        Random r = new Random();
        int a[] = new int[50];

        for(int i=0; i<a.length; i++)
        {
            a[i]=r.nextInt(50);
        }
        try
        {
            System.out.println(a[52]);
        }
        //catch(Exception e)
        catch(ArrayIndexOutOfBoundsException e)               // EXCEPTION HANDLING
        {
            System.out.println("Maximum index is 49.");
        }
        for(int i : a)
            System.out.println(i);
    }
}
