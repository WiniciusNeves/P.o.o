package br.com.uncuritiba;
import java.util.Scanner;

import br.com.uncuritiba.model.Aluno;
import br.com.uncuritiba.model.Prof;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String Nome	= null;
			String CPF = null;
			String Email = null;
			String Contato = null;
			String Matricula = null;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("cadastro de Prof ");
			System.out.println("");
			System.out.println("");
			
			Prof professor = new Prof();
			professor.setNome(Nome);
			professor.setMatricula(Matricula);
			professor.setEmail(Email);
				
			System.out.print("Informe quantos alunos estaram presentes na turma: \n");
			
			Scanner scanner1 = new Scanner(System.in);
			int nalunos = scanner1.nextInt();
			
			for (int x = 0; x > nalunos; x++)
			{
				Aluno aluno = new Aluno();
				aluno.setNome(Nome);
				aluno.setCPF(CPF);
				aluno.setEmail(Email);
				aluno.setContato(Contato);
					
			}
		
					
	}
	

}
