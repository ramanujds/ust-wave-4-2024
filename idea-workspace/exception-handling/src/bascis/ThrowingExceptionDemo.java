package bascis;

public class ThrowingExceptionDemo {

    static int divide(int a, int b) throws Exception{
        if(b<=0){
            throw new Exception("The value of b cannot be zero or less");
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println(result);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
