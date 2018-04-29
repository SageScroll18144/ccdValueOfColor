import java.util.Scanner;

public class ResistorTest {

	private static Scanner c;

	public static void main(String[] args) {
		Resistor s = new Resistor();
		boolean loop = true;
		do {
			try {
				c = new Scanner(System.in);
			    System.out.println("Anel 1...");
				String um = c.next();
			    System.out.println("Anel 2...");
				String dois = c.next();
			    System.out.println("Anel 3...");
				String tres = c.next();
				
				if (s.valor(um, dois, tres) < 1000) {System.out.println(s.valor(um, dois, tres) + " Ohms");}
				else{System.out.println(s.valor(um, dois, tres)/1000 + " K Ohms");}
				loop = false;
				
			}catch(NumberFormatException e) {
				System.out.println("Reescreva novamente com a primeira \nletra maiuscula\n");
			}
		}while(loop);	

	}
	
}
