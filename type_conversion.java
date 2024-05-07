class type_conversion
{
    public static void main(String args[])
    {
       //byte b = 127; 
       int a = 257;
       byte k =(byte) a;  //when you specify something it is Explicit

       float f = 5.6f;
       int t =(int) f;

        System.out.println(k);
        System.out.println(t);
        
        //type promotion

        byte c = 10;
        byte d = 30;

        int result = c*d;
        System.out.println(result);
    }
}    