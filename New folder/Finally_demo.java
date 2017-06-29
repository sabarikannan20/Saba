class Finally_demo
{
    int num=5;
    public static void main(String[] args) {
        Finally_demo f=new Finally_demo();
        //f.test();
        System.out.println(f.test());
    }
    public int test()
    {
        try{
            return num;
        }finally{
            System.out.println("Finally executes");
        }
    }
}