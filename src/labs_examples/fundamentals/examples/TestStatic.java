package labs_examples.fundamentals.examples;

public class TestStatic {
    static int test = 10;

    private int var;

    public TestStatic(int var) {
        this.var = var;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    public static int getTest() {
        return test;
    }

    public static void setTest(int test) {
        TestStatic.test = test;
    }

    @Override
    public String toString() {
        return "TestStatic{" +
                "var=" + var +
                "test=" + test +
                '}';
    }
}
