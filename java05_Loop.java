public class java05_Loop
{
    public static void main(String[] args)
    {
        //  Loop - while, do while, for
        int i = 1;
        while(i<=4)
        {
            System.out.println("Hello World "+ i);
            int k = 1;
            while(k<=3)
            {
                System.out.println("Hello "+ k);
                k++;
            }
            i++;
        }
        System.out.println("Bye World "+ i);
    }
}
