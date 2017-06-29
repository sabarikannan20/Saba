public class StaticDemo
{
        class StaticDemo1
        {
            void mgs()
            {
                System.out.println("sorry sabari");
            }
        }
        public static void main(String[] args) {
            StaticDemo st=new StaticDemo();
             StaticDemo.StaticDemo1 st1=st.new StaticDemo1();

            st1.mgs();
    }
}