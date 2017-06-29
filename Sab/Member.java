class Member
{
    void be()
    {
        class Member1
        {
            void be1()
            {
                System.out.println("hello");
            }
        }
           Member1 mem=new Member1();
            mem.be1();
    }
    public static void main(String[] args) {
        Member me=new Member();
        me.be();
    }
}