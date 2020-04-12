public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        break;
                    } else {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                System.out.println(i);
            }
        }
    }
}