class Human{
   private String name = "Bidhya";
    private int age = 21;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

public class java18_Encapusulation {
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Bidhya");

        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
