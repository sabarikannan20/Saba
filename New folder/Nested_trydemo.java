import java.io.FileNotFoundException;
import java.io.IOException;

class Nested_trydemo
{
    public static void main(String[] args) {
        try{
            try{
                int arr[]=new int[5];
                arr[6]=5;
            }catch(ArrayIndexOutOfBoundsException i)
            {
                i.printStackTrace();
            }finally
            {
                System.out.println("First sample");
            }
                try {
                    System.out.println("first");
                    int num1=0;
                    int num2=10/num1;
                    } catch (ArithmeticException e) {
                        e.printStackTrace();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            finally{
                System.out.println("Second sample");
            }
            System.out.println("Print main");
        }
}