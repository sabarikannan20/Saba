
//import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;

//@RunWith(Parameterized.class)
public class ThisDemo {

public static int arg1=10;
public static int arg2=20;

public ThisDemo(int arg1, int arg2) {
this.arg1 = arg1;
this.arg2 = arg2;
}

public static int actual;

//@Parameters
/*public static Collection<Object[]> data() {
Object[][] data = new Object[][] { { 1, 2 }, { 2147483647, 1 }, { 5, 2 }, { 1, 2 }, { 7, 2 },
{ 5, 3 }, { 121, 4 } };
return Arrays.asList(data);
}*/
public static void main(String args[])
{
Calc c = new Calc();
ThisDemo t=new ThisDemo(10,5);
int arg=10;
//@Test
System.out.println(c.hashCode());
System.out.println(t.hashCode());
System.out.println(arg.hashCode());
actual = c.sum(arg1,arg2);
System.out.println(actual);
//assertEquals("Test Result", arg1 + arg2, actual);
}
}
