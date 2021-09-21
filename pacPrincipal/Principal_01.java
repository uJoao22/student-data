package pacPrincipal;

import javax.swing.JOptionPane;

import pacOutros.Aluno;
import pacOutros.Endereco;

public class Principal_01 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String rua = JOptionPane.showInputDialog("Qual a rua?");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da casa?"));
		
		Endereco end = new Endereco(rua, num);
		Aluno al = new Aluno(nome,end);
		
		JOptionPane.showMessageDialog(null, al.toString());
	}
}