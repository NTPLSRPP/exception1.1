package exception1;


public class LAB4 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            System.out.println(2 / 0);
            System.out.println("Statement 3");
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
        }
        catch (ArithmeticException ex) {
            throw new StringIndexOutOfBoundsException();
        }
        finally {
            System.out.println("Statement 4");
        }   
        System.out.println("Statement 5");
    }
}
