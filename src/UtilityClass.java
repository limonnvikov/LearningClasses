public class UtilityClass {
    public static void main(String[] args) {
        int max = Math.max(5, 4);
        int min = Math.min(5, 4);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        int factorial = LearningClasses.MathUtils.factorial(4);
        System.out.println("Factorial: " + factorial);
    }
    public final class Math {

        private Math() {
            throw new UnsupportedOperationException("Утилита не должна создавать экземпляры");
        }

        public static int max(int a, int b) {
            return a > b ? a : b;
        }

        public static int min(int a, int b) {
            return a < b ? a : b;
        }

        public static int factorial(int n) {
            if (n < 0) throw new IllegalArgumentException("Число не должно быть отрицательным");
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
