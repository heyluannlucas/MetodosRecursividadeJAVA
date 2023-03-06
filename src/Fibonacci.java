import java.util.Scanner;

public class Fibonacci {

    // Método recursivo para calcular a sequência de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int fib_n = fibonacci(n-1) + fibonacci(n-2);
            return fib_n;
        }
    }

    // executa o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de n:");
        int n = scanner.nextInt();
        System.out.println("A sequência de Fibonacci para n = " + n + " é:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
