//Using 2 interface in single class

interface officerules
{
    void dresscode();
    void workinghours();
    void manager();
}
interface homerules
{
    void freetime();
    void playtime();
    void sleep();
}

class man1 implements officerules,homerules
{
    public void dresscode()
    {
        System.out.println("Yes");
    }
    
    public void workinghours()
    {
        System.out.println("Yes");
    }
    public void manager()
    {
        System.out.println("Yes");
    }
    public void freetime()
     {
        System.out.println("No");
     }
    public void playtime()
    {
        System.out.println("No");
    }
    public void sleep()
    {
        System.out.println("No");
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        man1 m1=new man1();
        m1.dresscode();
        m1.sleep();
    }
}
