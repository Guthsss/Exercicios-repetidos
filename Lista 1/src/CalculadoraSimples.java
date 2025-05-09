import java.util.Scanner;

public class CalculadoraSimples {

    static double x;
    static double y;

    static double calcular(String operacao) {
        switch (operacao) {
            case "Soma":
                return (x + y);
            case "Subtração":
                return (x - y);
            case "Divisão":
                if (y != 0) {
                    return (x / y);
                } else {
                    throw new ArithmeticException("Divisão por zero não permitida");
                }
            case "Multiplicação":
                return (x * y);
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            x = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            y = scanner.nextDouble();

            System.out.print("Digite a operação (Soma, Subtração, Multiplicação, Divisão): ");
            String operacao = scanner.next();

            try {
                double resultado = calcular(operacao);
                System.out.println("O resultado da operação é: " + resultado);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}