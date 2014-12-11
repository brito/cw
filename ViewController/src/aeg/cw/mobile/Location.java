package aeg.cw.mobile;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Location {
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressState;
    private String addressZip;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public Location(String name, String addressStreet, String addressCity, String addressState, String addressZip) {
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        propertyChangeSupport.firePropertyChange("name", oldName, name);
    }

    public String getName() {
        return name;
    }

    public void setAddressStreet(String addressStreet) {
        String oldAddressStreet = this.addressStreet;
        this.addressStreet = addressStreet;
        propertyChangeSupport.firePropertyChange("addressStreet", oldAddressStreet, addressStreet);
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressCity(String addressCity) {
        String oldAddressCity = this.addressCity;
        this.addressCity = addressCity;
        propertyChangeSupport.firePropertyChange("addressCity", oldAddressCity, addressCity);
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressState(String addressState) {
        String oldAddressState = this.addressState;
        this.addressState = addressState;
        propertyChangeSupport.firePropertyChange("addressState", oldAddressState, addressState);
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressZip(String addressZip) {
        String oldAddressZip = this.addressZip;
        this.addressZip = addressZip;
        propertyChangeSupport.firePropertyChange("addressZip", oldAddressZip, addressZip);
    }

    public String getAddressZip() {
        return addressZip;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
