public class divisionBy0Exception extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("division by zero is impossible");
    }
    
}
