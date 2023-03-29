package exception1;


public class LAB2 {

    public static void main(String[] args) {

        int[] list = new int[10];
        try {
            System.out.println("list[10] is " + list[10]);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}
