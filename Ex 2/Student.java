class Student
{
    int stu_id;
    String stu_name,dept_name;
    Student(int id,String name,String dept)
    {
        this.stu_id=id;
        this.stu_name=name;
        this.dept_name=dept;
    }
    public String toString()
    {
        return "id \t"+stu_id+" name \t"+stu_name+" dept \t"+dept_name;
    }
}
