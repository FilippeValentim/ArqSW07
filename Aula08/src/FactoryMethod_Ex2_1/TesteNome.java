package FactoryMethod_Ex2_1;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * 			RA 81612333
 * 			Turma SI3AN-MCA
 *
 */
public class TesteNome {

	public static void main(String[] args) {
		FactoryNome fn = new FactoryNome();
		
		String nome = "Filippe";
		String sobrenome = "Valentim";
		
		fn.getNome(nome, sobrenome);

	}

}
