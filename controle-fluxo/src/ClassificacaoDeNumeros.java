import java.util.Scanner;

public class ClassificacaoDeNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o primeiro numero: ");
    int primeiro = sc.nextInt();
    System.out.println();
    System.out.print("Digite o segundo numero: ");
    int segundo = sc.nextInt();
    System.out.println();
    System.out.print("Digite o terceiro numero: ");
    int terceiro = sc.nextInt();
    System.out.println();
    if (primeiro < segundo && segundo < terceiro && primeiro < terceiro)
      System.out.println("A ordem dos numero é: " + primeiro + " " + segundo + " " + terceiro);
    else if (primeiro < segundo && segundo > terceiro && primeiro < terceiro)
      System.out.println("A ordem dos numero é: " + primeiro + " " + terceiro + " " + segundo);
    else if (primeiro > segundo && segundo < terceiro && primeiro < terceiro)
      System.out.println("A ordem dos numero é: " + segundo + " " + primeiro + " " + terceiro);
    else if (primeiro < segundo && segundo > terceiro && primeiro > terceiro)
      System.out.println("A ordem dos numero é: " + terceiro + " " + primeiro + " " + segundo);
    else if (primeiro < segundo && segundo < terceiro && primeiro > terceiro)
      System.out.println("A ordem dos numero é: " + segundo + " " + terceiro + " " + primeiro);
    else if (primeiro > segundo && segundo < terceiro && primeiro > terceiro)
      System.out.println("A ordem dos numero é: " + terceiro + " " + segundo + " " + primeiro);
    sc.close();
  }
}
