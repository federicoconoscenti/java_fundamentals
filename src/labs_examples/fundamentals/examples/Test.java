package labs_examples.fundamentals.examples;

public class Test {

    public static void main(String[] args) {


        TestStatic boh = new TestStatic(10);
        TestStatic boh2 = new TestStatic(10);

        int b = boh.getVar();

        System.out.println(b);
        System.out.println(TestStatic.test);
        TestStatic.test++;
        System.out.println(boh.toString());
        System.out.println(boh2.toString());
        System.out.println(TestStatic.getTest());



    }

}
