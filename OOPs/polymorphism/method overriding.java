//polymorphism
//run time polymorphism
//method overriding

class sivakumar
{
    void actor()
    {
        System.out.println("Sivakumar is acting");
    }
}
class suriya extends sivakumar 
{
    void actor()
    {
        System.out.println("Suriya is acting");
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        sivakumar s1,s2;
        s1=new sivakumar();
        s2=new suriya();
        s1.actor();
        s2.actor();
    }
}
