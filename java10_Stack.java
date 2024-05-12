
class Calculat
{
    int num = 5;
    public int add(int n1, int n2){
        System.out.println(num);
        return n1 + n2;
    }
}
public class java10_Stack
{
    public static void main(String[] args)
    {
        int data = 10;

        Calculat cal = new Calculat();
        Calculat cal1 = new Calculat();
        int r1=cal.add(data,5);
        //System.out.println(r1);

        System.out.println( cal.num);
        System.out.println(cal1.num);
    }
}
// there is the link between the stack and the heap because of the address


