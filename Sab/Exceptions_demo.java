class Exceptions_demo
{
    void excp()
    {
        int num=50/0;
    }
    void check()
    {
        excp();
    }
    void handle()
    {
        try 
        {
          check();  
        } catch (Exception e) {
            e.printStackTrace();}
            System.out.println("Exception is handled");
    }
    public static void main(String[] args) {
        Exceptions_demo ex=new Exceptions_demo();
        ex.handle();
        System.out.println("Success");
    }
}