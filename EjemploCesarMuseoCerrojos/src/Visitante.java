

class Visitante extends Thread {

	private Museo museo;

	public Visitante(Museo museo) {
		this.museo = museo;
	}

	public void run() {
		Pantalla pantalla = Pantalla.getPantalla();
		for (int i  = 0; i < 10; i++) {
			museo.entrar();
			pantalla.escribir("Viendo el museo");
			for (int j = 0; j < (int) 10000 * Math.random(); j++) ;
			museo.salir();
			pantalla.escribir("Ha salido del museo.");
			for (int j = 0; j < (int) 10000 * Math.random(); j++) ;
		}
	}
}
