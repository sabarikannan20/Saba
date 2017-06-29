public class consEmp_demo
{
    public static void main(String args[])
    {
        Employee emp1=new Employee("Sabari");
        Employee emp2=new Employee("Saba");

        emp1.age(21);
        emp1.desig("Probation");
        emp1.sal(10000.00);
        emp1.display();

        
        emp2.age(21);
        emp2.desig("Probation");
        emp2.sal(10000.00);
        emp2.display();
    }
}