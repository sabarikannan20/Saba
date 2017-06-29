class MyException extends Exception
{
   public MyException(String str)
    {
    super(str);
    }
}
class Throw
{
    public static void main(String[] args) {
        
        try{
            int a=10;
            int b=11;
            test(a,b);
        }
        catch(MyException e)
        {
            System.out.println("enappa nadakkuthu"+e);
        }
        finally{
            System.out.println("i am in tension");
        }
    }
    static void test(int a,int b)throws MyException
    {
    if(a<b)
    throw new MyException("hello this Exception");
    else
    {
        System.out.println("no i am not a Exception");  
    }
}


}