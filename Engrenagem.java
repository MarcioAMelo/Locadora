public class Engrenagem{

	//Atributos dos filmes
	private static int qtdFilmes = 0;
	private int id;
	private String filme;
	private String genero;
	private String anoLanc;

	//Construtor
	public Engrenagem(String filme, String genero){
		this.filme = filme;
		this.genero = genero;
		this.id = ++qtdFilmes;
	}

	public Engrenagem(String filme, String genero, String anoLanc){
		this.filme = filme;
		this.genero = genero;
		this.anoLanc = anoLanc;
		this.id = ++qtdFilmes;

	}

	//Getters & Setters
	public int getQtdFilmes(){
		return this.qtdFilmes;
	}

	public int getId(){
		return this.id;
	}


	public String getFilme(){
		return this.filme;
	}

	public void setFilme(String filme){
		this.filme = filme;
	}

	public String getGenero(){
		return this.genero;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}

	public String anoLanc(){
		return this.anoLanc;
	}

	public void setAnoLanc(String anoLanc){
		this.anoLanc = anoLanc;
	}

	public void mostrarEngrenagem(){
		System.out.println(":.:.:.: Filme :.:.:.:");
		System.out.println("Número de catálogo: " + this.id);
		System.out.println("Nome do filme: " + this.filme);
		System.out.println("Genero: " + this.genero);
		if(this.anoLanc != null) System.out.println("Ano de lancamento: " +this.anoLanc);
		System.out.println( "\n");
	}




}