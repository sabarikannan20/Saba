import java.util.*;

class arr_tst
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextLine());
            System.out.println(al);
        }
    }
}