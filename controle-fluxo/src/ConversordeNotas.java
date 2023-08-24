import java.util.Scanner;

public class ConversordeNotas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a sua nota: ");
    int nota = sc.nextInt();
    if (nota < 100)
      System.out.println("Voce esta reprovado");
    else if (nota >= 100 && nota <= 200)
      System.out.println("Sua nota foi E");
    else if (nota >= 300 && nota <= 400)
      System.out.println("Sua nota foi D");
    else if (nota >= 500 && nota <= 600)
      System.out.println("Sua nota foi C");
    else if (nota >= 700 && nota <= 800)
      System.out.println("Sua nota foi B");
    else if (nota >= 900 && nota <= 1000)
      System.out.println("Sua nota foi A");
    sc.close();
  }
}
