
package folhapagamento03;

import java.util.ArrayList;

public class Funcionario {
	public int codFuncionario;
	public double sBase;
	public int tContrato;
	public ArrayList<Dependente> dependente = new ArrayList<>();

	public void imprimaDados() {
		System.out.println("Código do funcionário: " + codFuncionario);
		System.out.println("Salário base: " + sBase);
		System.out.println("Tempo de contrato: " + tContrato);
	}

	public boolean associaDependente(Dependente d) {
		if (dependente.size() == 5) {
			System.out.println("Número maximo de dependentes é 5");
			return false;
		} else {
			dependente.add(d);
			return true;
		}
	}

	public int retornaDependentesIdadeValida(int idadeMax) {
		return ((Long) dependente.stream().filter(d -> d.retornaDependenteIdadeValida(idadeMax)).count()).intValue();
	}

	public ArrayList<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(ArrayList<Dependente> dependente) {
		this.dependente = dependente;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public double getsBase() {
		return sBase;
	}

	public void setsBase(double sBase) {
		this.sBase = sBase;
	}

	public int gettContrato() {
		return tContrato;
	}

	public void settContrato(int tContrato) {
		this.tContrato = tContrato;
	}

	public double calculaValorMensal() {
		return 0;
	}
}
