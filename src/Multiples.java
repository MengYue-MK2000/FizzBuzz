public class Multiples {
    public static void main(String[] args) {
        doMultiples(1000);
    }

    private static void doMultiples(int max) {
        int i = 0;
        int count = 0;
        while (i < max) { i++;
            boolean M3 = i % 3 == 0;
            boolean M5 = i % 5 == 0;
            if (M3 || M5) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
