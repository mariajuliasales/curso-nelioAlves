package mariajulia.estudos.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Digite o nome do aluno:");
		aluno.setNome(scan.nextLine());

		System.out.println("Digite a idade do aluno:");
		aluno.setIdade(scan.nextInt());

		scan.nextLine();
		System.out.println("Digite a data de nascimento do aluno:");
		aluno.setDataNascimento(scan.nextLine());

		System.out.println("Digite o Registro Geral do aluno:");
		aluno.setRegistroGeral(scan.nextLine());

		System.out.println("Digite o CPF do aluno:");
		aluno.setNumeroCpf(scan.nextLine());

		System.out.println("Digite o nome da mãe do aluno:");
		aluno.setNomeMae(scan.nextLine());

		System.out.println("Digite o nome do pai do aluno:");
		aluno.setNomePai(scan.nextLine());

		System.out.println("Digite a data de matrícula do aluno:");
		aluno.setDataMatricula(scan.nextLine());

		System.out.println("Digite o nome da escola do aluno:");
		aluno.setNomeEscola(scan.nextLine());

		System.out.println("Digite a serie matriculada do aluno:");
		aluno.setSerieMatriculado(scan.nextLine());

		Disciplina disciplina = new Disciplina();

		disciplina.setDisciplina("Banco de Dados");
		disciplina.setNota(90);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Estrutura de Dados");
		disciplina2.setNota(90);
		aluno.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Estrutura de Dados");
		disciplina3.setNota(90);
		aluno.getDisciplinas().add(disciplina3);

		System.out.println();

		System.out.println(aluno);

	}

}
