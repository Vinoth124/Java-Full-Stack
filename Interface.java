//Interface-Blueprint of class

//abstract-extends
//interface-implements

//interface will be taken default it is based on data encapsulation that's why adding "public" in class

interface smartphone
{
    void camera();
    void touchpad();
    void chargertype();
}
class man implements smartphone
{
    public void camera()
    {
        System.out.println("Yes");
    }
    public void touchpad()
    {
        System.out.println("Yes");
    }
    public void chargertype()
    {
        System.out.println("Yes");
    }

}
public class Main 
{
    public static void main(String[] args)
    {
        man m1=new man();
        m1.camera();
        m1.touchpad();
        m1.chargertype();
    }
}
