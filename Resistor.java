import java.util.ArrayList;
import java.util.Arrays;

public class Resistor {
	
	private double value;
	
	double valor(String a, String b, String c) {
		ArrayList<String> cores = new ArrayList<>(Arrays.asList(new String[] {"Preto", "Marrom", "Vermelho",
				"Laranja","Amarelo", "Verde", "Azul", "Roxo", "Cinza", "Branco", "Prata", "Ouro"}));
		
		value = Integer.parseInt(String.valueOf(cores.indexOf(a)) + String.valueOf(cores.indexOf(b)));
			
		if(cores.indexOf(c) < 10) {
			value *=  Math.pow(10 , cores.indexOf(c));
				
		}
		else if(cores.indexOf(c) > 10){
			value *=  0.1;
		}
		else {
			value *=  cores.indexOf(c)/1000;
		}
		return value;
		
	}
	
}