interface anonymous
{
    public void check();
}
public class ExampleAnonymous
{
       void help()
        {
            System.out.println("i am going to check ");
        }
    public static void main(String[] args) 
    {
        ExampleAnonymous ex=new ExampleAnonymous();
     
        anonymous anon=new anonymous()
        {
            public void check()
            {
                System.out.println("May i get the Expected output");
            }
        };
        ex.help();
        anon.check();
    }
}