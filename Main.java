package dividebyzero;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (ArithmeticException e) {
            System.out.println("捕获到了ArithmeticException异常：除数不能为零。");
        }
    }

}
