package pacOutros;

public class Aluno {
	private String nome;
	private Endereco end;
	
	public Aluno(String nome, Endereco end) {
		this.nome = nome;
		this.end = end;
	}

	public String toString() {
		return "Nome do Aluno: " + nome + ", \n" + end;
	}
}