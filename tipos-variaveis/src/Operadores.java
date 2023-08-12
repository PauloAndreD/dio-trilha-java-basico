public class Operadores {
  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);

    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1);
    System.out.println(concatenacao);

    int numero = +5;
    numero = -numero;
    System.out.println(numero);
    numero = numero * -1;
    System.out.println(numero);

    int number = 5;
    // number = number + 1;
    number++;
    System.out.println(number++);
    System.out.println(number);
    System.out.println(--number);
    System.out.println(number);

    boolean variavel = true;
    variavel = !variavel;
    System.out.println(variavel);

    int a, b;
    a = 5;
    b = 6;
    String resultado = a == b ? "verdadeiro" : "falso";
    int result = a == b ? 1 : 0;
    System.out.println(resultado);
    System.out.println(result);

    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;
    System.out.println("numero Um é igual a numero2? " + simNao);
    simNao = numero1 != numero2;
    System.out.println("numero Um é diferente a numero2? " + simNao);
    simNao = numero1 > numero2;
    System.out.println("Numero 1 maior que numero 2");

    String nome1 = "Paulo";
    String nome2 = "Paulo";
    System.out.println(nome1 == nome2);

    boolean condicao1 = true;
    boolean condicao2 = false;
    if (condicao1 && condicao2)
      System.out.print("Os dois valores precisam ser verdadeiros");
    if (condicao1 || condicao2)
      System.out.print("Um dos valores precisa ser verdadeiro");
  }
}
