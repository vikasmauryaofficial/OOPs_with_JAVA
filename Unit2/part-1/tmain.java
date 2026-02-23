public class tmain {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    
}
 