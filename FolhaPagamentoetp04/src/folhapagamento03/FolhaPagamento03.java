package folhapagamento03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolhaPagamento03 {

	public static void main(String[] args) {
		List<Funcionario> funcionarios;

		try (Scanner tec = new Scanner(System.in)) {
			System.out.println("Informe a quantidade de funcionários que você quer inserir:  ");
			int nFunc = tec.nextInt();
			tec.nextLine();

			funcionarios = new ArrayList<Funcionario>();

			for (int c = 0; c < nFunc; c++) {
				System.out.println("Informe o tipo: \n 1 - Concursado\n 2 - Temporário");
				int fTipo = tec.nextInt();
				if (fTipo == 1) {
					FuncionarioConcursado func = new FuncionarioConcursado();
					System.out.println("Qual o código do funcionário?");
					func.setCodFuncionario(tec.nextInt());
					System.out.println("Qual o salário?");
					func.setsBase(tec.nextDouble());
					System.out.println("Quantos anos de contrato?");
					func.settContrato(tec.nextInt());

					System.out.println("Quantos dependentes você deseja associar a este funcionário? ");
					int qtdeDependentes = tec.nextInt();
					while (qtdeDependentes > 5) {
						System.out.println("Número maximo de dependentes é 5");
						System.out.println("Quantos dependentes você deseja associar a este funcionário? ");
						qtdeDependentes = tec.nextInt();
					}
					tec.nextLine();

					for (int i = 0; i < qtdeDependentes; i++) {
						System.out.println("_Dependente" + i + "_");
						System.out.println("Informe a idade do dependente: ");
						Dependente d = new Dependente(tec.nextInt());
						func.associaDependente(d);
					}

					func.calculaValorMensal();
					funcionarios.add(func);
				} else if (fTipo == 2) {
					FuncionarioTemporario func = new FuncionarioTemporario();
					System.out.println("Qual o código do funcionário?");
					func.setCodFuncionario(tec.nextInt());
					System.out.println("Qual o salário?");
					func.setsBase(tec.nextDouble());
					System.out.println("Quantos meses de contrato?");
					func.settContrato(tec.nextInt());

					System.out.println("Quantos dependentes você deseja associar a este funcionário? ");
					int qtdeDependentes = tec.nextInt();
					while (qtdeDependentes > 5) {
						System.out.println("Número maximo de dependentes é 5");
						System.out.println("Quantos dependentes você deseja associar a este funcionário? ");
						qtdeDependentes = tec.nextInt();
					}
					tec.nextLine();

					for (int i = 0; i < qtdeDependentes; i++) {
						System.out.println("_Dependente" + i + "_");
						System.out.println("Informe a idade do dependente: ");
						Dependente d = new Dependente(tec.nextInt());
						func.associaDependente(d);
					}

					func.calculaValorMensal();
					funcionarios.add(func);
				} else {
					System.out.println("Resposta invalida");
				}
			}

			for (Funcionario funcionario : funcionarios) {
				funcionario.imprimaDados();
			}

		} catch (Exception e) {
			System.out.println("Erro inesperado");
		}

	}
}