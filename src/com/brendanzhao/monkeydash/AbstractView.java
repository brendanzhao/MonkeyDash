package com.brendanzhao.monkeydash;

import java.beans.PropertyChangeEvent;
import javax.swing.JPanel;

public abstract class AbstractView extends JPanel {    

	public abstract void modelPropertyChange(PropertyChangeEvent evt);
}