import java.util.Scanner;

public class CalculadoraSimples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o primeiro valor: ");
    int priNum = sc.nextInt();
    System.err.println();
    System.out.print("Digite o segundo valor: ");
    int segNum = sc.nextInt();
    System.out.println();
    System.out.println(
        "Qual a operação a ser realizada?" + "\n1- adicao" + "\n2- subtração" + "\n3- multiplicação" + "\n4- divisão");
    int operacao = sc.nextInt();
    System.out.println();
    int resultado = 0;
    if (operacao == 1) {
      resultado = priNum + segNum;
      System.out.println("O resultado da adiçao é igual a: " + resultado);
    } else if (operacao == 2) {
      resultado = priNum - segNum;
      System.out.println("O resultado da subtração é igual a: " + resultado);
    } else if (operacao == 3) {
      resultado = priNum * segNum;
      System.out.println("O resultado da multiplicação é igual a: " + resultado);
    } else if (operacao == 4) {
      resultado = priNum / segNum;
      System.out.println("O resultado da divisão é igual a: " + resultado);
    } else
      System.out.println("operação invalida...");
    sc.close();
  }
}
