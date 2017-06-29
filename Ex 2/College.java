class College
{
    String colname;
    List<department> dept;

    College(String colname, List<department> dept)
    {
        this.colname=colname;
        this.dept=dept;

    }
    public int GetTotStudent()
    {
        no_of_students=0;
        List<Student> stu;
        for(Department d:dept)
        {
            stu=d.getStudent();
        }
for(Student s:stu)
{
    no_of_students++;
}    

return no_of_students;
    }
}