public class Reduce {
    public static void main(String[] args) {
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
            else if (num % 2 != 0){
                num = num - 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
