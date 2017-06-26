interface MyInterface{
    default void display1()
    {
        System.out.println("DISPLAY- using default");
    }
    public static void display2()
    {
        System.out.println("DISPLAY- using static");
    }
}
public class AdvanceInterface implements MyInterface
{
    public static void main(String[] args)
    {
    MyInterface inter = new AdvanceInterface();
    inter.display1();
    MyInterface.display2();
    }
}