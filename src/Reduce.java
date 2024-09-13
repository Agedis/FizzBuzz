public class Reduce {

    public static void main(String[] args) {
        int n = 100; int count = 0;

        while (n != 0) {
            boolean divisible_by_2 = n % 2 == 0;
            boolean odd = n % 2 == 1;
            if (divisible_by_2) {
                n = n / 2;
            }
            else if (odd) {
                n -= 1;
            }
            count++;
        }
        System.out.println(count);
    }

}
