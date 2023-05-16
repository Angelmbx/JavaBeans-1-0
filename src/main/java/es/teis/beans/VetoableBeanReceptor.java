package es.teis.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class VetoableBeanReceptor implements VetoableChangeListener {

	@Override
	public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
		// comprobación de las condiciones

		// ...

		// se lanza excepción si no se aprueba el cambio
		if ((evt.getOldValue()!=null) && evt.getNewValue().equals("ABORT") ){
			System.out.println("Abortando notificación cambio...");
			throw new PropertyVetoException("Mensaje", evt);
		} else {
			System.out.println("Antiguo valor: " + evt.getOldValue() + "=> Nuevo valor: " + evt.getNewValue());
		}

	}

}
