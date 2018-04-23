package FactoryMethod_Ex2_1;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * 			RA 81612333
 * 			Turma SI3AN-MCA
 *
 */
public class FactoryNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
