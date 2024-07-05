class Test
{
    void show()
    {
        System.out.println("Show method");
    }
    Test()
    {
        System.out.println("Constructor");
    }
    public static void main(String args[])
    {
        Test t1=new Test();
        Test t2=new Test();
        t1.show();
    }
}
    
