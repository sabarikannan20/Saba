class varArgs_demo
{
    public static int i=0;
    public static  void main(String args[])
    {
        //int[] a={10,20,30};
        area(10,20,52);
    }
        static void area(int... a)
        {
            //for(;i<3;i++)
            try
            {
            System.out.println(a[i]);
            i++;
            main(null);
             }
             catch(ArrayIndexOutOfBoundsException e){
                 System.out.println("Array index is out of bound"+e);
             }
             finally
             {
                 System.out.println("EXCEPTION IS HANDLED"+i);
             }
        }
}