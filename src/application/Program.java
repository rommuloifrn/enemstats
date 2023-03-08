package application;

import java.util.Scanner;
import entities.EnemExam;
import entities.Course;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Bem vindo!");
		System.out.println("Aqui você pode conferir a compatibilidade das suas notas do ENEM com cursos, seja os que temos inseridos no sistema ou colocando os pesos do curso que você quer.");
		EnemExam nota = new EnemExam();
		int resposta;
		int loop = 0;
		// variável que controla quando o user irá digitar as notas de sua prova.
		boolean insertGrade = true;
		while (loop == 0) {
			
			if (insertGrade == false) {
				
				System.out.println("Com a nota inserida, você quer conferir com um dos conjuntos do sistema ou adicionar os pesos?");
				System.out.println("0) Sair do sistema");
				System.out.println("1) Conferir com um dos conjuntos do sistema");
				System.out.println("2) Adicionar os pesos manualmente");
				System.out.println("3) Conferir a nota com os pesos já inseridos");
				System.out.println("3) Inserir outra nota");
				resposta = sc.nextInt();
				
				switch (resposta) {
					case 0: 
						loop = 1;
						break;
						
					case 1:
						break;
						
					case 2:
						System.out.println("Digite o nome do curso:");
						String courseName = sc.nextLine();
						System.out.println("Digite os pesos do curso na ordem do SISUsimulator (Ling - Mat - Hum - Nat - Red)");
						double languages = sc.nextInt();
						double math = sc.nextInt();
						double humanities = sc.nextInt();
						double nature = sc.nextInt();
						double essay = sc.nextInt();
						
						Course cursoInserido = new Course(courseName, languages, math, humanities, nature, essay);
						System.out.printf("Sua nota no curso inserido  (%s) é %f.  %n", cursoInserido.getName(), cursoInserido.gradeOnIt(languages, math, humanities, nature, essay) );
						break;
						
					case 3:
						insertGrade = true;
						break;
				}
				
			}else{
				System.out.println("insira suas notas na ordem do INEP (Lin - Hum  - Nat - Mat - Red)");
				nota.setLanguagesGrade(sc.nextDouble()); 
				nota.setMathGrade(sc.nextDouble()); 
				nota.setHumanitiesGrade(sc.nextDouble());
				nota.setNatureGrade(sc.nextDouble());
				nota.setEssayGrade(sc.nextDouble());
				insertGrade = false;
			}
			
		}
		
		
		
		sc.close();
	}
}
