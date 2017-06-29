abstract class demo
{
    abstract void display();
}
public class Anonmyms
{
    public static void main(String[] args) {
        demo d=new demo()
        {
            void display()
            {
                System.out.println("Type anything....");
            }
        };
        d.display();
    }
}
