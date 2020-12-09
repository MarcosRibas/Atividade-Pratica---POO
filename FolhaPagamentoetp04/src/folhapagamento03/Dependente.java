package folhapagamento03;

public class Dependente {
	public int idade;

	public Dependente(int idade) {
		this.idade = idade;
	}

	public boolean retornaDependenteIdadeValida(int idadeMax) {
		return idade <= idadeMax;
	}

}