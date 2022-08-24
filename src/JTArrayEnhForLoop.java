public class JTArrayEnhForLoop {

    public static void main(String[] args) {

        int a[] = new int[5];
        /* 2 6 8 4 1 ----> Values
        // 0 1 2 3 4 ---> Index number

        a[0] = 2;
        a[1] = 6;
        a[2] = 8;
        a[3] = 4;
        a[4] = 1; */

        // 1 2 3 4 5 ----> Values
        // 0 1 2 3 4 ---> Index number

        /*a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5; */

     /*   for(int i=0; i<a.length; i++)
        {
            a[i]=(i+1);
        }

        for(int i=0; i<a.length; i++)
            System.out.println(a[i]); */

        for(int i=0; i<a.length; i++)                   // ENHANCED FOR  LOOP
        {
            a[i]=(i+1);
        }

        for(int i : a)
            System.out.println(i);

    }
}
