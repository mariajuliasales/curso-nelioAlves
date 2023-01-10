package mariajulia.estudos.arraylist6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<Aluno>();

		int opc;

		do {

			Aluno aluno = new Aluno();

			System.out.println("Digite o nome do aluno " + (alunos.size() + 1) + ":");
			aluno.setNome(scan.nextLine());

			for (int i = 0; i < 1; i++) {
				System.out.printf("Informe o nome da disciplina %d:", i + 1);
				String nomeDisciplina = scan.nextLine();
				System.out.printf("Informe a nota da disciplina %d:", i + 1);
				double notaDisciplina = scan.nextDouble();
				scan.nextLine();

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(notaDisciplina);

				aluno.getDisciplinas().add(disciplina);
			}

			System.out.println(aluno);

			System.out.println("-----------------------------------------------------");

//		System.out.println("Digite o index da disciplina a ser removida. Se não deseja remover, digite 0.");
			System.out.println("Deseja remover alguma disciplina? Digite 0 para não e 1 para sim.");
			int opcao = scan.nextInt();

//		if (opcao != 0) {
//			aluno.getDisciplinas().remove(opcao);
//		}

			if (opcao == 1) {
				int continuarRemover;
				do {
					System.out.println(aluno);
					System.out.println("Digite o index da disciplina a ser removida:");
					opcao = scan.nextInt();
					aluno.getDisciplinas().remove(opcao);
					System.out.println("Deseja remover outra disciplina? Digite 0 para não e 1 para sim.");
					if (aluno.getDisciplinas().size() == 0) {
						break;
					}
					continuarRemover = scan.nextInt();
				} while (continuarRemover == 0);
			}

			System.out.println("-----------------------------------------------------");

			alunos.add(aluno);

			System.out.println("Deseja criar outro aluno? Digite 1 para sim e 0 para não.");
			opc = scan.nextInt();
			scan.nextLine();

		} while (opc != 0);

		System.out.println("-----------------------------------------------------");

		for (Aluno aluno : alunos) {

			Aluno i = alunos.get(opc);

			System.out.println(aluno);
			if (aluno.getDisciplinas().size() != 0) {
				System.out.println("Média do aluno: " + aluno.getMediaNota());
				System.out.println("Aprovado ou reprovado: " + aluno.getAlunoAprovado());
				System.out.println("Aprovado ou reprovado: " + aluno.getAlunoAprovado2());
			} else {
				System.out.println("Não foram encontrados alunos.");
			}
		}

//		for (Aluno aluno : alunos) {
////			Procurando a partir do nome
////			equalsIgnoreCase("Maria Julia"). vai ignorar letras maiusculas e minusculas
////			equals("Maria Julia") vai procurar exatamente igual, levando as letras maiusculas e minusculas em consideração
//			if(aluno.getNome().equalsIgnoreCase("Maria Julia")) {
//				alunos.remove(aluno);
//				break;
//			}
//		}

		System.out.println("-----------------------------------------------------");

		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			System.out.println(aluno);
		}

		for (int i = 0; i < alunos.size(); i++) {

			Aluno aluno = alunos.get(i);

			if (aluno.getNome().equalsIgnoreCase("Maria Julia")) {
				Aluno alunoNovo = new Aluno();
				alunoNovo.setNome("Aluno trocado");

				Disciplina novaDisciplina = new Disciplina();
				novaDisciplina.setDisciplina("Estrutura");
				novaDisciplina.setNota(70);
				alunoNovo.getDisciplinas().add(novaDisciplina);

				alunos.set(i, alunoNovo);
			}
		}

		System.out.println();
		System.out.println(alunos);

	}

}