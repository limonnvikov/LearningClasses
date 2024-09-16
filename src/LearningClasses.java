public class LearningClasses {
public static void main(String[] args) {
    MathUtils.max(5, 4);
    MathUtils.min(5, 4);
    System.out.println(MathUtils.max(5, 4));
    System.out.println(MathUtils.min(5, 4));
}
    public final class MathUtils {

        // Приватный конструктор предотвращает создание экземпляров класса
        private MathUtils() {
            throw new UnsupportedOperationException("Utility class should not be instantiated");
        }

        // Статический метод для нахождения максимального из двух чисел
        public static int max(int a, int b) {
            return a > b ? a : b;
        }

        // Статический метод для нахождения минимума из двух чисел
        public static int min(int a, int b) {
            return a < b ? a : b;
        }

        // Статический метод для вычисления факториала числа
        public static int factorial(int n) {
            if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}