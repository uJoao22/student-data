package pacPrincipal;

import javax.swing.JOptionPane;

import pacOutros.Aluno;
import pacOutros.Endereco;

public class Principal_04 {

	public static void main(String[] args) {
		
		int qtdal = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos existem na sala?"));
		Aluno turma[] = new Aluno[qtdal];
		
		for(int i=0; i<turma.length; i++) {
		
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
			String rua = JOptionPane.showInputDialog("Qual a rua?");
			int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da casa?"));
			
			Endereco end = new Endereco(rua, num);
			turma[i] = new Aluno(nome, end);
		}
		
		for(int i=0; i<turma.length; i++) {
			JOptionPane.showMessageDialog(null, turma[i].toString());
		}
		
	}
}