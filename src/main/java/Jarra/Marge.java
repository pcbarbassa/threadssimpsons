package Jarra;

public class Marge implements Runnable{
	JarraBiscoitos jarra;
	
	public Marge(JarraBiscoitos jarra) {
		this.jarra = jarra;
	}
	
	public void bake(int numBiscoitos) {
		jarra.colocarBiscoito("Marge", numBiscoitos);
		try{
			Thread.sleep((int)Math.random()*500);
		}catch (InterruptedException ie) {
			
		}		
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			
		}
	}

}
