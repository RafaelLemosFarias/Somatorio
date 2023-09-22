import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira os números separados por vírgula
        System.out.print("Digite um conjunto de números separados por vírgula: ");
        String input = scanner.nextLine();
        
        // Divide a entrada do usuário em um array de números
        String[] numerosString = input.split(",");
        double[] numeros = new double[numerosString.length];
        
        // Converte os números de string para double
        for (int i = 0; i < numerosString.length; i++) {
            numeros[i] = Double.parseDouble(numerosString[i]);
        }
        
        // Calcula a soma dos números
        double soma = calcularSoma(numeros);
        
        // Exibe o resultado da soma
        System.out.println("A soma dos números é: " + soma);
        
        // Fecha o scanner
        scanner.close();
    }
    
    // Função para calcular a soma dos números em um array
    public static double calcularSoma(double[] arr) {
        double soma = 0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        return soma;
    }
}
