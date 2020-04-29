import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Filmes{

	//Atributo do catalogo de filmes
	private List<Engrenagem> listafilme = new ArrayList<>();

	//construtor
	public Filmes(){
		alocarFilmes();
	}

	public List<Engrenagem> getEngrenagem(){
		return this.listafilme;
	}

	//servicos  sobre um filme
	public void editarFilme(Scanner teclado){

		System.out.println("\n Digite o nome do filme");
		String filme = teclado.nextLine();

		listarEngrenagem(findByName(filme));

		System.out.println("Escolha o numero de catalogo de filme para editar");
		int id = teclado.nextInt();
		Engrenagem obj = findById(id);

		//limpar buffer
		teclado.nextLine();

		System.out.println("Digite o nome do Filme");
		obj.setFilme(teclado.nextLine());

		System.out.println("Digite o genero do filme");
		obj.setGenero(teclado.nextLine());

		System.out.println("Digite o ano de lancamento do filme");
		obj.setAnoLanc(teclado.nextLine());

		obj.mostrarEngrenagem();
		System.out.println("\nFilme editado.\n");

	}


	public boolean deletarFilme(Scanner teclado){

		System.out.println("Digite o nome do Filme");
		String filme = teclado.nextLine();

		List<Engrenagem> result = findByName(filme);

		listarEngrenagem(result);

		System.out.println("Escolha o numero de catalogo de filme para deletar.");

		int id = teclado.nextInt();

		if(deleteById(id)){
			System.out.println("Filme deletado."); return true;
		}
		else{
			System.out.println("Nao foi possivel deletar o Filme."); return false;
		}



	}


	public Engrenagem findById(int id){
		for (Engrenagem c : listafilme) {
			if(c.getId() == id) return c;
		}
		System.out.println("Desculpe, nenhum filme encontrado... Tente uma outra opcao");
		return null;
	}

	//deleta um filme pelo id
	public boolean deleteById(int id){
		Engrenagem obj = findById(id);
		if(obj == null) return false;
		else return listafilme.remove(obj);
	}


	//criar novo filme
	public Engrenagem criarNovoFilme(Scanner teclado){

		System.out.println("Digite o titulodo filme ");
		String filme = teclado.nextLine();

		System.out.println("Digite o genero do filme");
		String genero = teclado.nextLine();

		System.out.println("Digite o ano de lancamento do filme");
		String anoLanc = teclado.nextLine();

		return new Engrenagem (filme,genero, anoLanc);
	}


	//adicionar um filme
	public boolean addFilme(Engrenagem obj){
		if(obj == null) return false;
		else listafilme.add(obj); return true;
	}

	//Pesquisar filme por nome
	public List<Engrenagem> findByName(String filme){
		List<Engrenagem> result = new ArrayList<>();
		for(Engrenagem c : listafilme){
			if(c.getFilme().toLowerCase().contains(filme.toLowerCase())) result.add(c);
		}
		if(result.size() < 1) System.out.println("\nNenhum Filme encontrado.\n");
		return result;
	}

	//dado uma lista imprimir os filmes
	public void listarEngrenagem(List<Engrenagem> filmes){
		for (Engrenagem c : filmes ) {
			c.mostrarEngrenagem();
		}
	}

	//overloading sobrecarga
	//listar todos os filme da lista
	public void listarEngrenagem(){
		for (Engrenagem c : this.listafilme ) {
			c.mostrarEngrenagem();
		}
	}

	private void alocarFilmes(){

		Engrenagem c1 = new Engrenagem("Robocop", "Acao", "1987");
		Engrenagem c2 = new Engrenagem("Stallone Cobra", "Acao", "1986");
		Engrenagem c3 = new Engrenagem("Os Goonies", "Aventura", "1985");
		Engrenagem c4 = new Engrenagem("A Lista de Schindler", "Drama", "1993");
		Engrenagem c5 = new Engrenagem("A Bruxa de Blair", "Thash Movie", "1999");
		Engrenagem c6 = new Engrenagem("O Silencio dos Inocentes", "Suspense", "1991");
		Engrenagem c7 = new Engrenagem("O Maskara", "Comedia", "1994");
		Engrenagem c8 = new Engrenagem("Uma Linda Mulher", "Romance", "1990");
		Engrenagem c9 = new Engrenagem("Star Wars", "Ficcao Cientfica", "1977");
		listafilme.addAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9));

	}



}
