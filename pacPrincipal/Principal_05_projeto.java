package pacPrincipal;

import javax.swing.JOptionPane;

import pacOutros.Aluno;
import pacOutros.Endereco;

public class Principal_05_projeto {

	public static void main(String[] args) {

		try {
			int qtdAl = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos existem na sala?"));
			Aluno turma[] = new Aluno[qtdAl];
			
			for(int i=0; i<turma.length; i++) {
				
				String nome = JOptionPane.showInputDialog("Qual o nome do " +(i+1)+ "º aluno?");
				String rua = JOptionPane.showInputDialog("Qual a rua?");
				int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da casa?"));
				
				Endereco end = new Endereco(rua, num);
				turma[i] = new Aluno(nome, end);
			}
		
		for(int i=0; i<turma.length;) {
			Object[] option = {"Ok", "Alterar Dados"}; 
			int r = JOptionPane.showOptionDialog(null, turma[i].toString(), "Aluno " +(i+1),  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
			
			if (r == 1) { //ALTERAR DADOS
				String name = JOptionPane.showInputDialog("Qual o nome do aluno?");
				String street = JOptionPane.showInputDialog("Qual a rua?");
				int number = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da casa?"));
				
				Endereco end = new Endereco(street, number);
				turma[i] = new Aluno(name, end);
			} else {
				i++;
			}
		}
		
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Inválido!!! \nInforme um número.", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Desconhecido!!!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		finally{
			JOptionPane.showMessageDialog(null, "Finalizado");
		}
		
	}
}