import java.util.Scanner;
public class DesigningMenuClass {
    private int number1;
    private int number2;

    public DesigningMenuClass(int number1,int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add() {
        return this.number1 + this.number2;
    }
    public int multiply() {
        return this.number1 * this.number2;
    }
    public int divide() {
        return this.number1 / this.number2;
    }
    public int subtract() {
        return this.number1 - this.number2;
    }

    public static void main(String[] args ) {
        DesigningMenuClass number = new DesigningMenuClass(2,4);
        while(true) {
            System.out.println("chose any one ");
            System.out.println("1.Addation");
            System.out.println("2.Multiply");
            System.out.println("3.divide");
            System.out.println("4.subtract");
            System.out.println("5.exit");
            Scanner myObj = new Scanner(System.in);
            int num = myObj.nextInt();
            switch(num) {
                case 1:
                System.out.println("Sum of number is="+number.add());
                break;
                case 2:
                System.out.println("multiplication is = "+number.multiply());
                break;
                case 3:
                System.out.println("division of the numbr ="+number.divide());
                break;
                case 4:
                System.out.println("subtraction of the number="+number.subtract());
                break;
                default:
                break;
            }
        }
    }
}