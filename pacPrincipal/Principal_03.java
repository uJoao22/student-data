package pacPrincipal;

import javax.swing.JOptionPane;

import pacOutros.Aluno;
import pacOutros.Endereco;

public class Principal_03 {

	public static void main(String[] args) {
			
		int qtdal = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos existem na sala?"));
			
		for(int i=1; i<=qtdal; i++) {
			
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
			String rua = JOptionPane.showInputDialog("Qual a rua?");
			int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da casa?"));
			
			Endereco end = new Endereco(rua, num);
			Aluno al = new Aluno(nome,end);
			
			JOptionPane.showMessageDialog(null, al.toString());
			
		}
	}
}