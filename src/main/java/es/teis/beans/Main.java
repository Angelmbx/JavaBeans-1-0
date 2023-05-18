package es.teis.beans;

public class Main {

	public static void main(String[] args) {
		
		testRestringidas();

		
	}
	
	private static void testLigadas() {
		BeanFuente fuente = new BeanFuente();
		BeanReceptor receptor = new BeanReceptor();
		BeanReceptor receptor2 = new BeanReceptor();
		
		fuente.addPropertyChangeListener(receptor);
		fuente.addPropertyChangeListener(receptor);
		fuente.setValue("nuevo");
		fuente.setValue("nuevovalor");
		
	}

	private static void testRestringidas() {
		VetoableBeanFuente fuente = new VetoableBeanFuente();
		VetoableBeanReceptor receptor = new VetoableBeanReceptor();
		VetoableBeanReceptor receptor2 = new VetoableBeanReceptor();
		
		fuente.addVetoableChangeListener(receptor);
		fuente.addVetoableChangeListener(receptor);
		fuente.setValue("nuevo");
		fuente.setValue("ABORT");
		fuente.setValue("nuevovalor");
		
	}
	
}
