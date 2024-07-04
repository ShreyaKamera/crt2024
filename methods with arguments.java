import java.util.*;
class Student
{
    int admno;
    String name;
    void get(int x,String y)
    {
        admno=x;
        name=y;
    }
    void show()
    {
        System.out.println(admno+" "+name);
    }
    public static void main(String args[]) 
    {
    Student s1=new Student();
    s1.get(101,"sss");
    s1.show();
    Student s2=new Student();
    s2.get(104,"kkk");
    s2.show();
    
    
    }
}
