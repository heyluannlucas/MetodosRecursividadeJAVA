public class EquacaoSegundoGrau {

    // Método que calcula a enésima potência de uma variável real x.
    public static double calcularPotencia(double x, int n) {
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }
        return resultado;
    }

    // Método que calcula o delta de uma equação do segundo grau.
    public static double Delta(double a, double b, double c) {
        // Calcula o valor de b² usando o método calcularPotencia.
        double bQuadrado = calcularPotencia(b, 2);
        // Calcula o valor de 4ac.
        double quatroAc = 4 * a * c;
        // Calcula o valor do delta.
        double delta = bQuadrado - quatroAc;
        return delta;
    }

    // executa o programa.
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 6;
        // Chama o método Delta e armazena o resultado em uma variável.
        double delta = Delta(a, b, c);
        System.out.println("O valor de delta é: " + delta);
    }
}
