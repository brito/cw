package aeg.cw.mobile;

import java.util.ArrayList;
import java.util.List;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Client {
    private String lastName;
    private String firstName;
    private String clientId;
    private int score;
    private String photo;

    public void setPhoto(String photo) {
        String oldPhoto = this.photo;
        this.photo = photo;
        propertyChangeSupport.firePropertyChange("photo", oldPhoto, photo);
    }

    public String getPhoto() {
        return photo;
    }

    public Client(String lastName, String firstName, String clientId, int score, String photo) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.clientId = clientId;
        this.score = score;
        this.photo = photo;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        propertyChangeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setClientId(String clientId) {
        String oldClientId = this.clientId;
        this.clientId = clientId;
        propertyChangeSupport.firePropertyChange("clientId", oldClientId, clientId);
    }

    public String getClientId() {
        return clientId;
    }

    public void setScore(int score) {
        int oldScore = this.score;
        this.score = score;
        propertyChangeSupport.firePropertyChange("score", oldScore, score);
    }

    public int getScore() {
        return score;
    }

    private List<Case> cases = new ArrayList<Case>();

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        propertyChangeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getLastName() {
        return lastName;
    }

    protected void setCases(List<Case> cases) {
        this.cases = cases;
    }

    public Case[] getCases() {
        return cases.toArray(new Case[cases.size()]);
    }

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
