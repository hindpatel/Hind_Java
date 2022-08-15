public class JTLBreakState {

    public static void main(String[] args) {

        //break switch loop

        hind: //use colon ":" to label an identifier
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                if(i==3)
                    break hind; //labelled break statement
                    //break; // unlabelled Break Statement
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
