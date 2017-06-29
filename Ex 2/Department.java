import java.util.ArrayList;

class Department
{
    String name;
    List<Student> stu;
    Department(String name,List<Student> stu)
    {
        this.name=name;
        this.stu=stu;

    }
    public List<Student> getStudent()
    {
        return stu;
    }
}
