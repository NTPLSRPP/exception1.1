package exception1;


public class LAB7 {
    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try{
            doThis();
        }
        catch(Exception e){
            System.out.println("Main method receive exception : " + e.getMessage());
        }
    }
    
    public static void doThis() throws Exception{
        System.out.println("Method doThis() call Method doThat()");
        doThat();
    }
    
    public static void doThat() throws Exception{
//        System.out.println(1/0);
        throw new MyException("Hello My Exception");
    }
    
}
