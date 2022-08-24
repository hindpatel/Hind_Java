public class JTMultiDimenArray {

    public static void main(String[] args) {

        int a[] = new int[5];
        int b[][] = new int[4][4];
        int c[][][] = new int[4][4][4];
        //c[0][0][0] = 7;                       //ASSIGNED VALUE 7 TO THE ARRAY C

        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    c[i][j][k] = i + j + k;
                    //System.out.print(c[i][j][k] + " ");
                }
            }//System.out.println();
        }

        for(int i[][] : c)
        {
            for(int j[] : i)
            {
                for(int k : j)
                {
                    System.out.print(k + " ");
                }
            } System.out.println();
        }
    }
}
