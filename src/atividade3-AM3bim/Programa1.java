package atividade3tercbim;

public class Pessoa {
	private String nome;
	private String pai;
	private String mae;

	//Construtores
	public Pessoa(String nome, String pai, String mae) { 
	      this.nome = nome;
	      this.pai = pai;
	      this.mae = mae;
	}
	public Pessoa(String nome) { 
		 this.nome = nome; 
	}
	
	///Sets e gets
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPai(String nome) {
		this.pai = nome;
	}

	public void setMae(String nome) {
		this.mae = nome;
	}
	
	public String getNome() {
		return (this.nome);
	}

	public String getPai() {
		return (this.pai);
	}
	
	public String getMae() {
		return (this.mae);
	}
	
	//Verificações
	public void VerificaPessoa(Pessoa pessoa) {
		if(this.pai == pessoa.pai || this.mae == pessoa.mae){
			System.out.println("São irmãos");
		} else {
			System.out.println("Não são irmãos");
		}
	}
	
	public void VerificaAntecessor(Pessoa pessoa) {
		if(pessoa.nome == this.pai || pessoa.nome == this.mae) {
			System.out.println("São parentes");
		} else {
			System.out.println("Não são parentes");
		}
	}
}