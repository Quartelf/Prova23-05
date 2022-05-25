import java.util.Scanner;

public class Thomas {

	public static void main(String[] args) {
	String nomeProf, nomeAluno, turma, disciplina;
	int qtdAlunos, qtdAvaliacoes, cont = 1, cont2 = 1;
	Double notas;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o numero do professor:");
	nomeProf = sc.next();
	System.out.println("Informe a turma:");
	turma = sc.next();
	System.out.println("Qual sua disciplina:");
	disciplina = sc.next();
	System.out.println("Informe a quantidade de alunos");
	qtdAlunos = sc.nextInt();
	System.out.println("Informe o numero de avaliações:");
	qtdAvaliacoes = sc.nextInt();
	
	while (cont <= qtdAlunos){
		cont++;
		System.out.println("Informe seu nome: ");
		nomeAluno = sc.next();
	}
	while (cont2 <= qtdAvaliacoes) {
		System.out.println("Informe suas notas");
		notas = sc.nextDouble();
	}
	}

}
