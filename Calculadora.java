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
    public class Calculadora {
    public double somar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
        }
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

        public class Calculadora {
    public double somar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
        }
    }
}

    }
}
