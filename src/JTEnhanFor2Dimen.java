public class JTEnhanFor2Dimen {

    public static void main(String[] args) {

           /*
        a[] = 1 2 3 4
        b[] = 8 9 4 5
        c[] = 1 5 9 6

         d [] [] = 1 2 3 4   8 9 4 5   1 5 9 6
         */

        int a=5, b=6, c=7, d=8;
        int x[] = {5,6,7,8};
        int y[] = {6,7,8,9};
        int z[] = {9,8,7,6};

        //int p[][] = new int[3][4];

        /*p[0][0] = 5;
        p[0][1] = 6;*/

        int p[][]= {
                {5,6,7,8},
                {6,7,8,9},
                {9,8,7,6}
        };

        for(int i[] : p) {    // ENHANCED FOR LOOP FOR 2D ARRAY
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
