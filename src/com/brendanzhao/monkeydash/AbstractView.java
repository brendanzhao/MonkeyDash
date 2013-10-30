package com.brendanzhao.monkeydash;

import java.beans.PropertyChangeEvent;
import javax.swing.JPanel;

public abstract class AbstractView extends JPanel {    
	private static final long serialVersionUID = 1L;

	public abstract void modelPropertyChange(PropertyChangeEvent evt);
}