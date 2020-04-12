public class BitNumber {
    public int num1;
    public int num2;

    public BitNumber(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return this.num1+this.num2;
    }
    public int multiply() {
        return this.num1*this.num2;
    }
    public void doublefun() {
        this.num1 = this.num1 + this.num1;
        this.num2 = this.num2 + this.num2;
    }

    public int getNumber1() {
        return this.num1;
    }

    public int getNumber2() {
        return this.num2;
    }
    public static void main(String[] args) {
        BitNumber number = new BitNumber(2, 3);
        System.out.println(number.add());
        System.out.println(number.multiply());
        number.doublefun();
        System.out.println(number.getNumber1());
        System.out.println(number.getNumber2());
    }
}