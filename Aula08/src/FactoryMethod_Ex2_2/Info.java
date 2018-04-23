package FactoryMethod_Ex2_2;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * 			RA 81612333
 * 			Turma SI3AN-MCA
 *
 */
public class Info extends Texto{
	
	public Info(){
		
	}
	public Info(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
