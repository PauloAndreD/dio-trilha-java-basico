import java.util.Scanner;

public class SistemaDeAutenticacaoSimples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o seu usuario: ");
    String usuario = sc.nextLine();
    System.out.print("Digite a sua senha: ");
    String senha = sc.nextLine();
    String nomeDeUsuarioCorreto = "usuario";
    String senhaCorreta = "senha123";
    if (usuario.equals(nomeDeUsuarioCorreto) && senha.equals(senhaCorreta)) {
      System.out.println("Autenticação bem-sucedida. Acesso concedido!");
    } else {
      System.out.println("Nome de usuário ou senha incorretos. Acesso negado.");
    }
    sc.close();
  }
}
