package AbstractFactory_Ex1_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * 			RA 81612333
 * 			Turma SI3AN-MCA
 *
 */
public class FactorySaudacao implements FactoryOla{

	@Override
	public Ola criarOla() {
		return new Ola (System.out.printf("Olá, Mundo"));
	}
	
	@Override
	public void outOla() {
	try {
	      PrintStream out = new PrintStream(new FileOutputStream(
	          "OutFile.txt"));
	 
	        out.println("Olá, Mundo");

	      out.close();

	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	
	}

}
