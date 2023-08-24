import java.util.Scanner;

public class SomaDigitos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    int soma = calcularSomaDigitos(numero);
    System.out.println("A soma dos dígitos de " + numero + " é " + soma);

    scanner.close();
  }

  public static int calcularSomaDigitos(int num) {
    int soma = 0;

    while (num != 0) {
      soma += num % 10; // Adiciona o último dígito ao total
      num /= 10; // Remove o último dígito
    }

    return soma;
  }
}
