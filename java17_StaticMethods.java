class Mobil
{
    String brand;
    static String name;
    int price;

    public void show()
    {
        System.out.println(brand + " : " + price + " , " + name);
    }

    public static void show1(Mobil obj)
    {
        System.out.println(obj.brand + " : " +obj.price + " , " + name);
    }
}

public class java17_StaticMethods {
    public static void main(String[] args) {

        Mobil obj1 = new Mobil();
        obj1.brand = "iphone";
        obj1.price = 15000;
        obj1.name = "smartphone";

        Mobil obj2 = new Mobil();
        obj2.brand = "MI";
        obj2.price = 1500;
        obj2.name = "smartphone";

        obj1.show();
        obj2.show();


// to load a class or call a static block:-  class.forName(className:"Mobil");


        Mobil.show1(obj1);


    }
}
