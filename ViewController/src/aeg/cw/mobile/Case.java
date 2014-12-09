package aeg.cw.mobile;

import java.util.Date;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Case {
    private String type;
    private Date scheduled;
    private String clientId;
    private int priority;

    public Case(String type, Date scheduled, String clientId, int priority) {
        this.type = type;
        this.scheduled = scheduled;
        this.clientId = clientId;
        this.priority = priority;
    }

    public void setScheduled(Date scheduled) {
        Date oldScheduled = this.scheduled;
        this.scheduled = scheduled;
        propertyChangeSupport.firePropertyChange("scheduled", oldScheduled, scheduled);
    }

    public Date getScheduled() {
        return scheduled;
    }

    public void setClientId(String clientId) {
        String oldClientId = this.clientId;
        this.clientId = clientId;
        propertyChangeSupport.firePropertyChange("clientId", oldClientId, clientId);
    }

    public String getClientId() {
        return clientId;
    }

    public void setPriority(int priority) {
        int oldPriority = this.priority;
        this.priority = priority;
        propertyChangeSupport.firePropertyChange("priority", oldPriority, priority);
    }

    public int getPriority() {
        return priority;
    }

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        propertyChangeSupport.firePropertyChange("type", oldType, type);
    }

    public String getType() {
        return type;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
