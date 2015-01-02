package aeg.cw.mobile;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import java.util.Random;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Case  implements Comparable<Case>{
    private String type;
    // TODO http://stackoverflow.com/questions/3859288/how-to-calculate-time-ago-in-java/23215152#23215152
    private Date scheduled;
    private Priority priority;
    
    private String clientId;
    private String clientLastName;
    private String clientFirstName;
    private String clientPhoto;
    
    private Status status;
    private List<String> notes = new ArrayList<String>();
    
    private List<Task> tasks = new ArrayList<Task>();
    
    public enum Priority {
        Urgent(0), Important(1), Normal(2), OK(3), FYI(4);
        private final int number;
        Priority(int number){
            this.number = number;
        }
        private int number() { return number; }
    }
        
    public enum Status {
        Delayed(0), Active(1), Assigned(2), Waiting(3), Old(4);
        private final int number;
        Status(int number){
            this.number = number;
        }
        private int number() { return number; }
    }

    public Case(){
        this.setPriority(Priority.Normal);

        // randomly scheduled within the next days
        int days = 3;
        int soon = (new Random().nextInt(days*24)*60*60*1000);
        this.scheduled = new Date(System.currentTimeMillis() + soon);
    }

    public void setStatus(Case.Status status) {
        Case.Status oldStatus = this.status;
        this.status = status;
        propertyChangeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getStatus() {
        return status.toString();
    }

    public void setNote(String note) {
        this.notes.add(note);
        propertyChangeSupport.firePropertyChange("notes", notes, note);
    }

    public String getNote() {
        return notes.get(0);
    }

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

    public void setScheduled(Date scheduled) {
        Date oldScheduled = this.scheduled;
        this.scheduled = scheduled;
        propertyChangeSupport.firePropertyChange("scheduled", oldScheduled, scheduled);
    }

    public Date getScheduled() {
        return scheduled;
    }

    public void setPriority(Priority priority) {
        Priority oldPriority = this.priority;
        this.priority = priority;
        propertyChangeSupport.firePropertyChange("priority", oldPriority, priority);
    }

    public String getPriority() {
        if (priority.number()  == 2)
            return "";
        else
            return priority.toString();
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
    
    public Task[] getTasks(){
        return tasks.toArray(new Task[tasks.size()]);
    }

    void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    @Override
    public int compareTo(Case c) {
        return this.priority.number() - c.priority.number();
    }

    protected class Task {
        private String title;
        private String description;
        private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);


        public Task(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public void setTitle(String title) {
            String oldTitle = this.title;
            this.title = title;
            propertyChangeSupport.firePropertyChange("title", oldTitle, title);
        }

        public String getTitle() {
            return title;
        }

        public void setDescription(String description) {
            String oldDescription = this.description;
            this.description = description;
            propertyChangeSupport.firePropertyChange("description", oldDescription, description);
        }

        public String getDescription() {
            return description;
        }

        public void addPropertyChangeListener(PropertyChangeListener l) {
            propertyChangeSupport.addPropertyChangeListener(l);
        }

        public void removePropertyChangeListener(PropertyChangeListener l) {
            propertyChangeSupport.removePropertyChangeListener(l);
        }
    }
}
