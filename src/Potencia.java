public class Potencia {

    public static double calcularPotencia(double x, int n) {
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }
        return resultado;
    }

    public static void main(String[] args) {
        double x = 2.5;
        int n = 3;
        double resultado = calcularPotencia(x, n);
        System.out.println("O resultado de " + x + " elevado a " + n + " é " + resultado);
    }
}
