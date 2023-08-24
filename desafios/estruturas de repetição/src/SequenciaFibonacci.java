import java.util.Scanner;

public class SequenciaFibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de números da sequência de Fibonacci: ");
    int quantidade = scanner.nextInt();

    System.out.println("Sequência de Fibonacci com " + quantidade + " números:");

    int primeiroTermo = 0;
    int segundoTermo = 1;

    for (int i = 1; i <= quantidade; i++) {
      System.out.print(primeiroTermo + " ");

      int proximoTermo = primeiroTermo + segundoTermo;
      primeiroTermo = segundoTermo;
      segundoTermo = proximoTermo;
    }

    scanner.close();
  }
}
