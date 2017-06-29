public class Ret_finallydemo
{
    public static int test()
        {
            
            try{
                int a=10;
                return a;
            }//catch(Exception e){}
            finally{
               // System.out.println("is this print??");
               int a=11;
               return a;
            }
        }
    public static void main(String[] args) {
            System.out.println(Ret_finallydemo.test());
        }
}