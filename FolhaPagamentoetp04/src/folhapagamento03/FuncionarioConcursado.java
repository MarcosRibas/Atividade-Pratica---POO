package folhapagamento03;

public class FuncionarioConcursado extends Funcionario {

	public FuncionarioConcursado() {

	}

	public FuncionarioConcursado(int codFuncionario, double sBase, int tContrato) {
		this.codFuncionario = codFuncionario;
		this.sBase = sBase;
		this.tContrato = tContrato;

	}

	@Override
	public double calculaValorMensal() {
		return sBase + (200 * tContrato) + (retornaDependentesIdadeValida(21) * 100);
	}

	@Override
	public void imprimaDados() {
		super.imprimaDados();
		System.out.println("Valor mensal: R$" + calculaValorMensal());
	}

}