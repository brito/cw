package aeg.cw.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import java.util.Random;

import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class Client {
    private String lastName;
    private String firstName;
    private String clientId;
    private String gender;
    private String race;
    private int age;
    private String photo = "data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7";
    
    private Location placement;
    private Location school;
    
    private List<Case> cases = new ArrayList<Case>();    
    private List<Medication> medications = new ArrayList<Medication>();
    private List<Document> documents = new ArrayList<Document>();
    
    private int score;
    private int scoreCountA;
    private int scoreCountB;
    private int scoreCountC;
    private int score100A;
    private int score100B;
    private int score100C;

    public Client(String firstName, int age, String gender) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.race = "Hispanic/Latino";
        
        Random rnd = new Random();
        this.clientId = "UTAE" + (rnd.nextInt(9999) + 999999);
        this.score = rnd.nextInt(60) + 40;
        this.scoreCountA = rnd.nextInt(10);
        this.scoreCountB = rnd.nextInt(50);
        this.scoreCountC = rnd.nextInt(420);
        this.score100A = rnd.nextInt(100);
        this.score100A = rnd.nextInt(100);
        this.score100A = rnd.nextInt(100);
        
    }

    protected void setCases(List<Case> cases) {
        this.cases = cases;
        for (Case c : cases){
            c.setClientId(this.clientId);
            c.setClientFirstName(this.firstName);
            c.setClientLastName(this.lastName);
            c.setClientPhoto(this.photo);
        }
    }
    protected void addCase(Case c){
        c.setClientId(this.clientId);
        c.setClientFirstName(this.firstName);
        c.setClientLastName(this.lastName);
        c.setClientPhoto(this.photo);
        cases.add(c);
    }

    public Case[] getCases() {
        Case[] sorted = cases.toArray(new Case[cases.size()]);
        // by priority
        Arrays.sort(sorted);
        return sorted;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public Medication[] getMedications() {
        return medications.toArray(new Medication[medications.size()]);
    }

    public void setDocuments(List<Document> documents) {
    }

    public Document[] getDocuments() {
        return documents.toArray(new Document[documents.size()]);
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        propertyChangeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getGender() {
        return gender;
    }

    public void setRace(String race) {
        String oldRace = this.race;
        this.race = race;
        propertyChangeSupport.firePropertyChange("race", oldRace, race);
    }

    public String getRace() {
        return race;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        propertyChangeSupport.firePropertyChange("age", oldAge, age);
    }

    public int getAge() {
        return age;
    }

    public void setPlacement(Location placement) {
        Location oldPlacement = this.placement;
        this.placement = placement;
        propertyChangeSupport.firePropertyChange("placement", oldPlacement, placement);
    }

    public Location getPlacement() {
        return placement;
    }

    public void setSchool(Location school) {
        Location oldSchool = this.school;
        this.school = school;
        propertyChangeSupport.firePropertyChange("school", oldSchool, school);
    }

    public Location getSchool() {
        return school;
    }

    public void setScoreCountA(int scoreCountA) {
        int oldScoreCountA = this.scoreCountA;
        this.scoreCountA = scoreCountA;
        propertyChangeSupport.firePropertyChange("scoreCountA", oldScoreCountA, scoreCountA);
    }

    public int getScoreCountA() {
        return scoreCountA;
    }

    public void setScoreCountB(int scoreCountB) {
        int oldScoreCountB = this.scoreCountB;
        this.scoreCountB = scoreCountB;
        propertyChangeSupport.firePropertyChange("scoreCountB", oldScoreCountB, scoreCountB);
    }

    public int getScoreCountB() {
        return scoreCountB;
    }

    public void setScoreCountC(int scoreCountC) {
        int oldScoreCountC = this.scoreCountC;
        this.scoreCountC = scoreCountC;
        propertyChangeSupport.firePropertyChange("scoreCountC", oldScoreCountC, scoreCountC);
    }

    public int getScoreCountC() {
        return scoreCountC;
    }

    public void setScore100A(int score100A) {
        int oldScore100A = this.score100A;
        this.score100A = score100A;
        propertyChangeSupport.firePropertyChange("score100A", oldScore100A, score100A);
    }

    public int getScore100A() {
        return score100A;
    }

    public void setScore100B(int score100B) {
        int oldScore100B = this.score100B;
        this.score100B = score100B;
        propertyChangeSupport.firePropertyChange("score100B", oldScore100B, score100B);
    }

    public int getScore100B() {
        return score100B;
    }

    public void setScore100C(int score100C) {
        int oldScore100C = this.score100C;
        this.score100C = score100C;
        propertyChangeSupport.firePropertyChange("score100C", oldScore100C, score100C);
    }

    public int getScore100C() {
        return score100C;
    }


    public void setPhoto(String photo) {
        String oldPhoto = this.photo;
        this.photo = photo;
        propertyChangeSupport.firePropertyChange("photo", oldPhoto, photo);
    }

    public String getPhoto() {
        return photo;
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

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        propertyChangeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getLastName() {
        return lastName;
    }

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
}
