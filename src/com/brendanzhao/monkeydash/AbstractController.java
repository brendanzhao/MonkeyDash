package com.brendanzhao.monkeydash;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractController implements PropertyChangeListener {
    
    private List<AbstractView> registeredViews;
    private List<AbstractModel> registeredModels;
    
    public AbstractController() {
        registeredViews = new ArrayList<AbstractView>();
        registeredModels = new ArrayList<AbstractModel>();
    }

    public void addModel(AbstractModel model) {
        registeredModels.add(model);
        model.addPropertyChangeListener(this);
    }

    public void removeModel(AbstractModel model) {
        registeredModels.remove(model);
        model.removePropertyChangeListener(this);
    }
    
    public void addView(AbstractView view) {
        registeredViews.add(view);
    }

    public void removeView(AbstractView view) {
        registeredViews.remove(view);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        for (AbstractView view: registeredViews) {
            view.modelPropertyChange(evt);
        }
    }
}