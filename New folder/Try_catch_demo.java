class Try_catch_demo
{
    public static void main(String[] args) {
        int arr[]=new int[]{5,4,3,2,1};

        try{
            for(int i=0;i<7;i++)
            {
                System.out.println(arr[i]);
            }
            //int a=0;
            //int b=10/a;
            //System.out.println(b);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Print main");
    }
}