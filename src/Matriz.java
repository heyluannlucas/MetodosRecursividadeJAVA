import java.util.Scanner;

public class Matriz {

    // Método para ler uma matriz NxN informada pelo usuário
    public static double[][] lerMatriz(int n) {
        double[][] matriz = new double[n][n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        return matriz;
    }

    // Método para imprimir uma matriz na tela
    public static void imprimirMatriz(double[][] matriz) {
        System.out.println("Matriz:");
        for (double[] linha : matriz) {
            for (double elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular o determinante de uma matriz NxN
    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;
        if (n == 1) {
            return matriz[0][0];
        } else if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else {
            double determinante = 0;
            for (int j = 0; j < n; j++) {
                double[][] submatriz = new double[n-1][n-1];
                for (int i = 1; i < n; i++) {
                    for (int k = 0; k < n; k++) {
                        if (k < j) {
                            submatriz[i-1][k] = matriz[i][k];
                        } else if (k > j) {
                            submatriz[i-1][k-1] = matriz[i][k];
                        }
                    }
                }
                determinante += matriz[0][j] * Math.pow(-1, j) * calcularDeterminante(submatriz);
            }
            return determinante;
        }
    }

    // Método para verificar se a matriz é simétrica
    public static boolean verificarSimetria(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // executa o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz (n):");
        int n = scanner.nextInt();
        double[][] matriz = lerMatriz(n);
        imprimirMatriz(matriz);
        double determinante = calcularDeterminante(matriz);
        System.out.println("O determinante da matriz é: " + determinante);
        if (verificarSimetria(matriz)) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}
