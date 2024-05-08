class Arithmetic_operators
{
    public static void main(String args[])
    {
        int num = 6;
        int num1 = 7;
        int num2 = 5;
        
        int result1 = num1 + num2;//addition
        int result2 = num1 - num2;// subraction
        int result3 = num1 * num2;//multipication
        int result4 = num1 / num2;//divide
        int result5 = num1 % num2;// modulus which gives reminder

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        num++;    //post-increment
        ++num;    //pre-increment
         
        int result = num++;// fetch the value and then increment
        int result6 = ++num;// increment and then fetch the value

        System.out.println(result);
        System.out.println(result6);

        num1 *= 8;
        System.out.println(num1);

    }
}    