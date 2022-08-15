public class JTPatternwLoop {

    public static void main(String[] args) {

        int i, j, k;
/*
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        for(i = 1; i <= 4; i++){
            for(j = 1; j <= 4; j++)
            {
                if (i==2 && j==2 || i==3 && j==3 || i==2 && j==3 || i==3 && j==2)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();

        for(i = 1; i <= 4; i++)
        {
            for(j = 1; j <= 4; j++)
            {
                if (i==1 || i==4 || j==1 || j==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(); */

        /*1234
          2341
          3412
          4123
         */

        for (i = 1; i <= 4; i++)
        {
            for (j = 1; j <= 4; j++)
            {
                k = (i + (j - 1));
                if (k>4)
                    k = (k-4);
                System.out.printf("%d ",k);
            }
            System.out.println();
        }
    }
}