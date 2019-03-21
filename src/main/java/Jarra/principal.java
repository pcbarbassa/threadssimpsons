package Jarra;

public class principal {
	
	public static void main(String[] args) {
		JarraBiscoitos jarra = new JarraBiscoitos();
		
		Homer homer = new Homer(jarra);
		Marge marge = new Marge(jarra);
		
		new Thread(homer).start();
		new Thread(marge).start();
	}

}
