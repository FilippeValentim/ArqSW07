package AbstractFactory_Ex1_1_2;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * 			RA 81612333
 * 			Turma SI3AN-MCA
 *
 */
public class FacPizzaria implements FactoryPizzaria{
	String m;
	
	@Override
	public String funcionarioP() {
		
		return  m = "**********************************\nIngredientes:\n -- queijo\n -- calabresa\n -- tomate\n **********************************";
	}
	
	@Override
	public String funcionarioS() {
		
		return  m = "**********************************\nIngredientes:\n -- queijo\n -- presunto\n -- tomate\n **********************************";
	}

}
