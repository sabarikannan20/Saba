import java.util.*;
class num
{
    public static void main(String ars[])
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println(num1+" is greater");
        }
        else
        {
            System.out.println(num2+" is greater");
        }
    }
}