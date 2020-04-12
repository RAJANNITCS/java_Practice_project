import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal b1;
    private BigDecimal b2;

    public SimpleInterestCalculator(String b1,String b2)
    {
        this.b1 = new BigDecimal(b1);
        this.b2 = new BigDecimal(b2);
    }
    private BigDecimal calculateTotalValue(int i) {
        return b1.add(b1.multiply(b2).multiply(new BigDecimal(i)));
    }
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("45000.00","7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }

    
}