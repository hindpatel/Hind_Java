public class JTVarags {

    public static void main(String[] args) {

        Display obj = new Display();
        obj.show(5,6,7,8);
    }
}

class Display
{
    public void show(int ... a)                        //Varargs - Variable Arguments
    {
        for(int i : a) {
            System.out.println(i);
        }
    }
    public void show(int a)
    {
        System.out.println(a + " in show a");
    }
/*    public void show(int a, int b, int c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }*/
}