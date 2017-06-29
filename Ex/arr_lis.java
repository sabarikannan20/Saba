import java.util.ArrayList;

class arr_lis
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}