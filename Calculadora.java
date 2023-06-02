// Classe para a operação de soma
class Soma {
    public static int executar(int a, int b) {
        return a + b;
    }

    public static double executar(double a, double b) {
        return a + b;
    }
}
// Classe principal que utiliza as operações da calculadora
public class Calculadora {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Executando a operação de soma
        int resultadoSomaInt = Soma.executar(num1, num2);
        System.out.println("Resultado da soma (int): " + resultadoSomaInt);

        double resultadoSomaDouble = Soma.executar(3.5, 2.1);
        System.out.println("Resultado da soma (double): " + resultadoSomaDouble);

    }
}