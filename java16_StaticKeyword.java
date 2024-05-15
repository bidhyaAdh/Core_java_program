class Mobile
{
    String brand;
    String name;
    int price;

    public void show()
    {
        System.out.println(brand + " : " + price + " , " + name);
    }
}

public class java16_StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "iphone";
        obj1.price = 15000;
        obj1.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "MI";
        obj2.price = 1500;
        obj2.name = "smartphone";

        obj1.show();
        obj2.show();

    }
}
