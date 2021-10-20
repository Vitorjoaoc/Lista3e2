import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
		
		String nome = "";
		String senha = "";
		
		System.out.println("Digite seu usuario!");
		nome = leitor.nextLine();
		System.out.println("Digite sua senha!");
		senha = leitor.nextLine();
		
		if(senha.contentEquals(nome)) {
			while(senha.contentEquals(nome)) {
				System.err.println("ERRO!!!Digite uma senha diferente do seu nome de usuario!");
				System.out.println("Digite seu usuario!");
				nome = leitor.nextLine();
				System.out.println("Digite sua senha!");
				senha = leitor.nextLine();
			}
		}
		System.out.println("Cadastro feito com sucesso!"); 
  }
}