public class DivideByZero {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int result=a+b;
        try{

        }catch (ArithmeticException e){
            System.out.println("divide by zero exception is handeled" + e.getMessage() );

        }
        System.out.println("****************\n");
        System.out.println("after exception code");
    }
}
