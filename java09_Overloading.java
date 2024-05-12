
class Calculato
{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
         return n1 + n2 + n3;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
}

public class java09_Overloading {
    public static void main(String[] args) {
        Calculato calc = new Calculato();
        int r1 = calc.add(3,2,1);
        System.out.println(r1);
    }
}
