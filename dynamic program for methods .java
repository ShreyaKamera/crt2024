class Student
{
    int admno;
    String name;
    void get()
    {
        admno=111;
        name="sss";
    }
    void show()
    {
        System.out.println(admno+" "+name);
    }
    public static void main(String[] args) 
    {
    Student s1=new Student();
    s1.get();
    s1.show();
    Student s2=new Student();
    s2.get();
    s2.show();
    
    
    }
}
