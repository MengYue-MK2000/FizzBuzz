public class Reduce {
    public static void main(String[] args) {
        /* assume int num >= 0 */
        int num = 100;
        doReduce(num);
    }

    private static void doReduce(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count += 1;
            }
            else {
                num = num - 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
