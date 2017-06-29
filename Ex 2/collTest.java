import java.util.ArrayList;

class collTest
{
    public static void main(String args[])
    {
        Student s1=new Student(1,"saba","CSE");
        Student s2=new Student(2,"San","CSE");
        Student s3=new Student(3,"Sana","CSE");
        System.out.println(s1);
        List<Student> stu=new ArrayList<Student>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        
    }

}