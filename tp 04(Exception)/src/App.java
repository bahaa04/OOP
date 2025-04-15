public class App {
    public static void main(String[] args) {
        try {
            methodA();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception catched: " + e.getMessage());
        }
    }

    public static void methodA() throws ArithmeticException {
        System.out.println("MethodA()");
        methodB();
        System.out.println("End methodA()");
    }

    public static void methodB() throws ArithmeticException {
        System.out.println("MethodB()");
        methodC();
        System.out.println("End methodB()");
    }

    public static void methodC() throws ArithmeticException {
        System.out.println("MethodC()");
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }
}