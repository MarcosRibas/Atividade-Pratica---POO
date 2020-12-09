package folhapagamento03;

public class FuncionarioTemporario extends Funcionario {

	public FuncionarioTemporario() {

	}

	public FuncionarioTemporario(int codFuncionario, double sBase, int tContrato) {
		this.codFuncionario = codFuncionario;
		this.sBase = sBase;
		this.tContrato = tContrato;
	}

	@Override
	public double calculaValorMensal() {
		return sBase + (15 * tContrato) + (retornaDependentesIdadeValida(18) * 50);
	}

	@Override
	public void imprimaDados() {
		super.imprimaDados();
		System.out.println("Valor mensal: R$" + calculaValorMensal());
	}

}