package application;

import java.util.Scanner;
import entities.Exam;
import entities.Course;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Course uspComputerScience = new Course("USP São Carlos - Ciência da Computação", 2, 3, 1, 2, 2, 2022.1, 800.61, 695.32);
		Course uspInformationSystems = new Course("USP São Carlos - Sistemas de informação", 2, 3, 1, 2, 2, 2022.1, 775.97, 695.92);
		Course uspDataScience = new Course("USP São Carlos - Ciência de dados", 2, 3, 1, 2, 2, 2022.1, 774.86, 734.18);
		
		
		System.out.println("Olá! Bem vindo!");
		System.out.println("Aqui você pode conferir a compatibilidade das suas notas do ENEM com cursos, seja os que temos inseridos no sistema ou colocando os pesos do curso que você quer.");
		
		Exam nota = new Exam();
		Course cursoInserido = new Course();
		int resposta;
		int loop = 0;
		// variável que controla se o user vai precisar inserir a nota da prova ou não.
		boolean insertGrade = true;
		
		while (loop == 0) {
			
			if (insertGrade == false) {
				
				System.out.println("Com a nota inserida, você quer conferir com um dos conjuntos do sistema ou adicionar os pesos?");
				System.out.println("0) Sair do sistema");
				System.out.println("1) Conferir com um dos conjuntos do sistema");
				System.out.println("2) Adicionar os pesos manualmente");
				System.out.println("3) Conferir a nota com os pesos já inseridos");
				System.out.println("4) Inserir outra nota");
				resposta = sc.nextInt();
				
				switch (resposta) {
					case 0: 
						loop = 1;
						break;
						
					case 1:
						System.out.println("Selecione uma das áreas:");
						System.out.println("1) Programação e TI");
						System.out.println("2) Saúde");
						int subject = sc.nextInt();
						switch (subject) {
							case 1:
								System.out.printf("%s: %.2f %n", uspComputerScience, uspComputerScience.gradeOnIt(nota));
								System.out.printf("%s: %.2f %n", uspInformationSystems, uspInformationSystems.gradeOnIt(nota));
								System.out.printf("%s: %.2f %n", uspDataScience, uspDataScience.gradeOnIt(nota));
								System.out.println();
								break;
							case 2:
								break;
						}
						
						break;
						
					case 2:
						System.out.println("Digite o nome do curso:");
						sc.nextLine();
						String courseName = sc.nextLine();
						System.out.println("Digite os pesos do curso na ordem do SISUsimulator (Ling - Mat - Hum - Nat - Red)");
						double languages = sc.nextDouble();
						double math = sc.nextDouble();
						double humanities = sc.nextDouble();
						double nature = sc.nextDouble();
						double essay = sc.nextDouble();
						
						
						
						cursoInserido = new Course(courseName, languages, math, humanities, nature, essay);
						System.out.printf("Sua nota no curso inserido (%s) é %.2f.  %n%n", cursoInserido.getName(), cursoInserido.gradeOnIt(nota) );
						break;
						
					case 3:
						System.out.printf("Sua nota no curso inserido (%s) é %.2f.  %n%n", cursoInserido.getName(), cursoInserido.gradeOnIt(nota) );
						break;
					case 4:
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
		
		System.out.println("Adeus, amigo.");
		
		sc.close();
	}
}
