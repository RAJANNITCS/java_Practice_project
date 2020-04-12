import java.lang.Integer;
import java.lang.Short;

public class WrapperClasses {
    public static void main(String[] args) {
        Short s1 = Short.valueOf("123");
        System.out.println(s1);
        short s2 = Short.parseShort("123");
        System.out.println(s2);
        short s3 = s1.shortValue();
        System.out.println(s3);

        Integer i1 = Integer.valueOf("1234666");
        System.out.println(i1);
        int i2 = i1.intValue();
        System.out.println(i2);
        int i3 = Integer.parseInt("01010101",2);
        System.out.println(i3);

        Byte b1 = Byte.valueOf("95");
        System.out.println(b1);
        byte b2 = b1.byteValue();
        System.out.println(b2);
        byte b3 = Byte.parseByte("95");
        System.out.println(b3);

        Float f1 = Float.valueOf("3.4f");
        System.out.println(f1);
        float f2 = f1.floatValue();
        System.out.println(f2);
        float f3 = Float.parseFloat("3.4f");
        System.out.println(f3);

        Double d1 = Double.valueOf("3.4444");
        System.out.println(d1);
        double d2 = d1.doubleValue();
        System.out.println(d2);
        double d3 = Double.parseDouble("3.444");
        System.out.println(d3);

        Character ch1 = Character.valueOf('A');
        System.out.println(ch1);
        char ch2 = ch1.charValue();
        System.out.println(ch2);
        
    }
}