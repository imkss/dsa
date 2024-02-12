package __OOP.ExecptionHandeling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try{
//           divide(a, b);
        throw new Exception("Just for Mimicking");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("General Exception");
        } finally {
            System.out.println("finally:: Run Anyways!!");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0) {
//            throw new ArithmeticException("Can not divide with 0");
        }
        return a /b;
    }
}
