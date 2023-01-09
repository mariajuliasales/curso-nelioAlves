package mariajulia.estudos.arraylist3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Digite o nome do aluno:");
		aluno.setNome(scan.nextLine());

//		System.out.println("Digite a idade do aluno:");
//		aluno.setIdade(scan.nextInt());

//		scan.nextLine();
//		System.out.println("Digite a data de nascimento do aluno:");
//		aluno.setDataNascimento(scan.nextLine());
//
//		System.out.println("Digite o Registro Geral do aluno:");
//		aluno.setRegistroGeral(scan.nextLine());
//
//		System.out.println("Digite o CPF do aluno:");
//		aluno.setNumeroCpf(scan.nextLine());
//
//		System.out.println("Digite o nome da mãe do aluno:");
//		aluno.setNomeMae(scan.nextLine());
//
//		System.out.println("Digite o nome do pai do aluno:");
//		aluno.setNomePai(scan.nextLine());
//
//		System.out.println("Digite a data de matrícula do aluno:");
//		aluno.setDataMatricula(scan.nextLine());
//
//		System.out.println("Digite o nome da escola do aluno:");
//		aluno.setNomeEscola(scan.nextLine());
//
//		System.out.println("Digite a serie matriculada do aluno:");
//		aluno.setSerieMatriculado(scan.nextLine());

		for (int i = 0; i < 2; i++) {
			scan.nextLine();
			System.out.printf("Informe o nome da disciplina %d:", i + 1);
			String nomeDisciplina = scan.nextLine();
			System.out.printf("Informe a nota da disciplina %d:", i + 1);
			double notaDisciplina = scan.nextDouble();

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(notaDisciplina);

			aluno.getDisciplinas().add(disciplina);
		}

		System.out.println(aluno);

		System.out.println("Digite o index da disciplina a ser removida. Se não deseja remover, digite 0.");
		int opcao = scan.nextInt();

		if (opcao != 0) {
			aluno.getDisciplinas().remove(opcao);
		}

		System.out.println(aluno);
		System.out.println("Média do aluno: " + aluno.getMediaNota());
		System.out.println("Aprovado ou reprovado: " + aluno.getAlunoAprovado());
		System.out.println("Aprovado ou reprovado: " + aluno.getAlunoAprovado2());

	}

}