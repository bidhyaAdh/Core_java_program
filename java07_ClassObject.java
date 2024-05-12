
class Calculator
{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

public class java07_ClassObject {
    public static void main(String[] args) {
        int num1 = 4;     // num1 and num2 are called primitive Values
        int num2 = 5;

        Calculator calc =  new Calculator();  //object is created
        int result = calc.add(4,5);
        //int result = num1 + num2;

        System.out.println(result);
    }
}

//object - properties and behaviours
