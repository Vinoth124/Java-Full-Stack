//Inheritance
//Multilevel Inheritance

class grandfather
{
    void grandfather()
    {
        System.out.println("grandfather's house");
        System.out.println("grandfather's car");
    }
}
class father extends grandfather
{
    void father()
    {
        System.out.println("father's bike");
        System.out.println("father's land");
    }
}
class son extends father
{
    void son()
    {
        System.out.println("son's mobile");
    }
}

public class Main
{
    public static void main(String[] args)
    {
      father f1=new father();
      son s1=new son();
      f1.grandfather();
      s1.father();
    }
}
