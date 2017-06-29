public class Phone
{
    String model,os;
    int no_of_sim,btry_cty;
    double screen_size;
  /* Phone(String mod,String ope,int bat,int bat_ct,double size)
    {
        model=mod;
        os=ope;
        no_of_sim=bat;
        btry_cty=bat_ct;
        screen_size=size;
    }
    public String toString()
    {
        return "model:"+model+" OS:"+os+" No Od SIM:"+no_of_sim+" Battery Volume:"+btry_cty+" Screen size"+screen_size;
    }*/
    void call(String m)
    {
        System.out.println("calling...."+m);
    }
    void msg()
    {
        System.out.println("U hve received a new msg");
    }
   /* public static void main(String[] args) 
    {
        Phone p=new Phone("Moto","Android",2,3500,5.5);
        System.out.println(p);
        p.call("semapone");
        p.msg();   
    }
}
public class Mobile extends Phone
{
    public static void main(String[] args) 
    {
    Mobile m=new Mobile();
    m.main(null);
    m.call("this is inheritance");
    }*/
}