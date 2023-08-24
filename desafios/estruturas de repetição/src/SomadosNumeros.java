import java.util.Scanner;

public class SomadosNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero ");
    int numero = sc.nextInt();
    int somatorio = 0;
    for (int i = 1; i <= numero; i++)
      somatorio = i + somatorio;
    System.out.println("O somatorio dos numeros é igual a: " + somatorio);
    sc.close();
  }
}