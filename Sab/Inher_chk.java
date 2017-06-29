class One{
    int val=10;
}
class Two extends One{
    int val=20;
}
public class Inher_chk{
    public static void main(String[] args) {
        One one=new One();
        one=new Two();
        System.out.println(one.val);
        System.out.println(one.val);
    }
    
}