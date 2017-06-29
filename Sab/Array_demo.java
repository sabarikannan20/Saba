class Array_demo
{
    public static void main(String args[])
    {
        double[] array={1.5,2.4,3.3,4.2,5.1};
        double tot=0;  
        for(int i=0;i<array.length;i++) 
        {
            System.out.println(array[i]);
            tot+=array[i];
        }
        System.out.println(tot);
    }

}