import java.util.Scanner;


public class Principal{
	public static void main(String[] args) {
		
		Filmes filmes = new Filmes();
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		boolean loop = true;

		

		while(loop){
			System.out.println(":.:.:.: Locadora Seculo XX :.:.:.:\n");

			System.out.println("Escolha 1 para pesquisar um Filme");
			System.out.println("Escolha 2 para adicionar um Filme ");
			System.out.println("Escolha 3 para deletar um Filme");
			System.out.println("Escolha 4 para editar um Filme");
			System.out.println("Escolha 5 para listar os Filmes");
			System.out.println("Escolha 6 sair do sistema\n");

			System.out.println("Por favor, escolha uma opcao do menu.");

			menu = teclado.nextInt();

			//esvaziar o buffer do teclado
			
			teclado.nextLine();


			switch(menu){

				case 1:
					System.out.println("Digite um filme para pesquisar");
					String filme = teclado.nextLine();
					filmes.listarEngrenagem(filmes.findByName(filme));
					break;

				case 2:
					System.out.println("Cadastro novo Filme\n");
					filmes.addFilme(filmes.criarNovoFilme(teclado));
					break;

				case 3:
					System.out.println("Deletar um Filme\n");
					filmes.deletarFilme(teclado);
					break;

				case 4:
					System.out.println("Editar um Filme\n");
					filmes.editarFilme(teclado);
					break;

				case 5:
					System.out.println("Lista dos Filmes\n");
					filmes.listarEngrenagem();
					break;


				case 6:
					System.out.println("Obrigado por usar nosso sistema locadora. \n");
					teclado.close();
					loop = false;
			}


		}





	}
}