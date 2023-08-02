public class Punto_10 {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1, c;

        System.out.println("Serie Fibonacci de los primeros " + n + " números:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
