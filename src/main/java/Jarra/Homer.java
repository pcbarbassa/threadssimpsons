package Jarra;

public class Homer implements Runnable{
	 JarraBiscoitos jarra;
	 
	 public Homer(JarraBiscoitos jarra) {
		 this.jarra = jarra;		 
	 }
	 
	 public void comer() {
		jarra.pegarBiscoito("Homer");
		try {
			Thread.sleep((int) Math.random()*1000);
		} catch (InterruptedException ie) {
		}		 
	 }
	 
	 public void run() {
		for (int i = 0; i <= 10; i++) {
			comer();
		}
	 }
}