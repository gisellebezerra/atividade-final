// Classe para a operação de soma
class Soma {
    public static int executar(int a, int b) {
        return a + b;
    }

    public static double executar(double a, double b) {
        return a + b;
    }
}
// Classe para a operação de subtração
class Subtracao {
    public static int executar(int a, int b) {
        return a - b;
    }

    public static double executar(double a, double b) {
        return a - b;
    }
}
// Classe para a operação de multiplicação
class Multiplicacao {
    public static int executar(int a, int b) {
        return a * b;
    }

    public static double executar(double a, double b) {
        return a * b;
    }
}

// Classe para a operação de divisão
class Divisao {
    public static double executar(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
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
        
        // Executando a operação de subtração        
        int resultadoSubtracaoInt = Subtracao.executar(num1, num2);
        System.out.println("Resultado da subtração (int): " + resultadoSubtracaoInt);

        double resultadoSubtracaoDouble = Subtracao.executar(3.5, 2.1);
        System.out.println("Resultado da subtração (double): " + resultadoSubtracaoDouble);

        // Executando a operação de multiplicação
        int resultadoMultiplicacaoInt = Multiplicacao.executar(num1, num2);
        System.out.println("Resultado da multiplicação (int): " + resultadoMultiplicacaoInt);

        double resultadoMultiplicacaoDouble = Multiplicacao.executar(3.5, 2.1);
        System.out.println("Resultado da multiplicação (double): " + resultadoMultiplicacaoDouble);
        // Executando a operação de divisão
        double resultadoDivisao = Divisao.executar(10.0, 3.0);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}
