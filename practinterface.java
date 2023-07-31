package oopsmock;


interface grandfather
{
    void test1();
}
interface grandmother
{
    void test2();
}
class father implements grandfather,grandmother
{
    public void test1()
    {
        System.out.println("hi test 1");
    }
    public void test2()
    {
        System.out.println("hii test 2");
    }
}

public class practinterface {
    public static void main(String[] args) {
        grandfather ref =new father();
        ref.test1();
        grandmother ref2 =new father();
        ref2.test2();
    }
}
