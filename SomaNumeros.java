import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número float: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        scanner.close();

        float sum = num1 + num2;

        System.out.println("A soma dos dois números é: " + sum);
    }
}