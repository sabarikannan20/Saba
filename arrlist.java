import java.util.*;
class arrlist
{
    static ArrayList<arrlis> books=new ArrayList<arrlis>();
    public static void main(String args[])
    {
        create();
    }
    static void create()    
    {
        arrlis al1=new arrlis(101,4,"let us c","yash");
        arrlis al2=new arrlis(102,5,"let us c++","bala");
        arrlis al3=new arrlis(103,2,"OS","willey");
        books.add(al1);
        books.add(al2);
        books.add(al3);
        System.out.println("Books created");
        for (ArrayList b : books) {
            System.out.println(b);
        }
    }
}