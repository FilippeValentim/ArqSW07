package AbstractFactory_Ex1_1;
import javax.swing.JOptionPane;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * 			RA 81612333
 * 			Turma SI3AN-MCA
 *
 */
public class TesteOla {
	public static void main(String[] args) {
		FactorySaudacao fs = new FactorySaudacao();
		
		String info;
		
		info = JOptionPane.showInputDialog(null, "Escolha entre --  A  -- ou --  B --");
		if(info.equals("a")){
		fs.criarOla();
		}
		else if(info.equals("b")){
		 fs.outOla();
		 JOptionPane.showMessageDialog(null, "Arquivo criado com Sucesso,  \n\n\n****Obs: click em reflash para visualizar");
		}
		else{
		  JOptionPane.showMessageDialog(null, "Desculpe Ocorreu Algum Erro");
		}
		System.exit(0);
	}
}
