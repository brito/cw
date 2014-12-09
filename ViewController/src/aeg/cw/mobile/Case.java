package aeg.cw.mobile;

import java.util.Date;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Case {
    private String type;
    // TODO http://stackoverflow.com/questions/3859288/how-to-calculate-time-ago-in-java/23215152#23215152
    private Date scheduled;
    private int priority;
    
    private String clientId;
    private String clientLastName;
    private String clientFirstName;
    private String clientPhoto;

    public void setClientId(String clientId) {
        String oldClientId = this.clientId;
        this.clientId = clientId;
        propertyChangeSupport.firePropertyChange("clientId", oldClientId, clientId);
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientLastName(String clientLastName) {
        String oldClientLastName = this.clientLastName;
        this.clientLastName = clientLastName;
        propertyChangeSupport.firePropertyChange("clientLastName", oldClientLastName, clientLastName);
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientFirstName(String clientFirstName) {
        String oldClientFirstName = this.clientFirstName;
        this.clientFirstName = clientFirstName;
        propertyChangeSupport.firePropertyChange("clientFirstName", oldClientFirstName, clientFirstName);
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientPhoto(String clientPhoto) {
        String oldClientPhoto = this.clientPhoto;
        this.clientPhoto = clientPhoto;
        propertyChangeSupport.firePropertyChange("clientPhoto", oldClientPhoto, clientPhoto);
    }

    public String getClientPhoto() {
        return clientPhoto;
    }

    public Case(String type, Date scheduled, int priority) {
        this.type = type;
        this.scheduled = scheduled;
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
