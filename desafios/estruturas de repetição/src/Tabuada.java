import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("-----------------TABUADA-----------------");
    System.out.println("Digite um numero para saber a sua tabuada");
    int numero = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " * " + i + " = " + (numero * i));
    }
    sc.close();
  }
}
