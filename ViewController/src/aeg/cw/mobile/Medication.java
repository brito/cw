package aeg.cw.mobile;

import java.util.Date;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Medication {
    private String name;
    private String dose;
    private Date[] taken;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        propertyChangeSupport.firePropertyChange("name", oldName, name);
    }

    public String getName() {
        return name;
    }

    public void setDose(String dose) {
        String oldDose = this.dose;
        this.dose = dose;
        propertyChangeSupport.firePropertyChange("dose", oldDose, dose);
    }

    public String getDose() {
        return dose;
    }

    public void setTaken(Date[] taken) {
        Date[] oldTaken = this.taken;
        this.taken = taken;
        propertyChangeSupport.firePropertyChange("taken", oldTaken, taken);
    }

    public Date[] getTaken() {
        return taken;
    }

    public Medication(String name, String dose) {
        this.name = name;
        this.dose = dose;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
