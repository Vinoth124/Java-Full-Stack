//polymorphism
//compile time polymorphism
//method overloading

class bank
{
   void application(String name,int account, int p1)
    {
        System.out.println(name);
        System.out.println(account);
        System.out.println(p1);
    }
    void application(String name,int account, int p1,int p2)
    {
        System.out.println(name);
        System.out.println(account);
        System.out.println(p1);
        System.out.println(p2);
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        bank b1=new bank();
        b1.application("vinoth",124,95674);
        b1.application("vinoth",124,95674,234567);
    }
}
    
