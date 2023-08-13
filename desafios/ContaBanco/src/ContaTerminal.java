import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------BANK---------------------");
        System.out.print("Por favor digite o seu nome: ");
        String nomeCliente = sc.next();
        System.out.println();
        System.out.print("Digite o seu numero de usuario: ");
        int numUsuario = sc.nextInt();
        System.out.println();
        System.out.print("Digito o numero de sua agencia: ");
        String agenciaUsuario = sc.next();
        System.out.println();
        System.out.print("Digite o saldo atual da sua conta: ");
        double saldoConta = sc.nextDouble();
        System.out.println();
        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaUsuario
                        + ", conta " + numUsuario + " e seu saldo R$" + saldoConta + " já esta disponível para saque");
        System.out.println();
        sc.close();
    }
}
