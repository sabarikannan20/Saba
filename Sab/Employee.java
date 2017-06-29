public class Employee
{
    String empName;
    int empAge;
    String designation;
    Double salary;
    public Employee(String name)
    {
        empName=name;
    }
    public void age(int age)
    {
        empAge=age;
    }
    public void desig(String edes)
    {
        designation=edes;
    }
    public void sal(double esalary)
    {
        salary=esalary;
    }
    public void display()
    {
        System.out.println("Name : "+empName);
        System.out.println("age : "+empAge);
        System.out.println("designation : "+designation);
        System.out.println("Salary : "+salary);
    }
}