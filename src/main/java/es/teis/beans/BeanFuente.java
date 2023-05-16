package es.teis.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class BeanFuente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.pcs.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		this.pcs.removePropertyChangeListener(listener);
	}

	private String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String newValue) {
		String oldValue = this.value;
		this.value = newValue;
		// 3 parámetros: El valor de la propiedad que se ha cambiado, el valor antiguo y
		// el nuevo valor
		this.pcs.firePropertyChange("value", oldValue, newValue);
	}

	
	// [...]
}
