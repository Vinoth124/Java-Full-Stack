//Data Abstraction 

abstract class office
{
    void reason()
    {
        System.out.println("Leave");
    }
    void days()
    {
        System.out.println("1 day");
    }
    abstract void why();
}
class friend2 extends office
{
     void reason1()
    {
        System.out.println("Leave");
    }
    void days1()
    {
        System.out.println("2 days");
    }
    void why()
    {
        System.out.println("Movie");
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        friend2 f2=new friend2();
        f2.reason();
        f2.days();
        f2.why();
    }
}
