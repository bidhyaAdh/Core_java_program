
class Computer{
    public void playMusic()
    {
        System.out.println("Computer is playing music");
    }
    public String getMePen(int cost)
    {
        if (cost >= 10)
        {
            return "Pen";
        }
        else
        {
            return "Nothing";
        }

    }
}
public class java08_Methods {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.playMusic();
        String str = com.getMePen(10);
        System.out.println(str);
    }
}
