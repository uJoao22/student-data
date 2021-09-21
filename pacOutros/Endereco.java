package pacOutros;

public class Endereco {
	private String rua;
	private int numeroCasa;
	
	public Endereco(String rua, int numeroCasa) {
		this.rua = rua;
		this.numeroCasa = numeroCasa;
	}

	public String toString() {
		return "Endereco: Rua " + rua + " - Número " 
		+ numeroCasa;
	}
}