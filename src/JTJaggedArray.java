public class JTJaggedArray {

    public static void main(String[] args) {

        int a=5, b=6, c=7, d=8;
        //int x[] = {5,6,7,8};
        //int y[] = {6,7};
        //int z[] = {9,8,7};


        /*int p[][]= {             //JAGGED ARRAY
                {5,6,7,8},
                {6,7},
                {9,8,7}
        };*/

        int k[][] = new int[3][]; // 2 DIMENSIONAL JAGGED ARRAY 2.0

        k[0] = new int[4];        // COLUMN SIZE DEFINED OF JAGGED ARRAY
        k[1] = new int[2];
        k[2] = new int[3];





        for(int i[] : k) {    // ENHANCED FOR LOOP FOR 2D ARRAY
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
