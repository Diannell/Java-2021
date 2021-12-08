class Test{
    String s = "Hello world";
    String s2;
    public Test(){
        s2 = "Hello world";
    }
    void print(){
        System.out.println(s);
        System.out.println(s2);
    }
}

public class CW6 {
    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }
}
