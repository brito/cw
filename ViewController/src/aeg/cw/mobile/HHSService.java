package aeg.cw.mobile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HHSService {
    private List<Client> clients = new ArrayList<Client>();
    private List<Case> cases = new ArrayList<Case>();
    
    public Client[] getClients(){
        return clients.toArray(new Client[clients.size()]);
    }
    public Case[] getCases(){
        return cases.toArray(new Case[cases.size()]);
    }
    
    public HHSService() {
        resetCases();
        resetClients();
    }
    
    private void resetClients(){
        Client client = new Client("Sanchez", "Jerry", 17, "Male");
        client.setCases(cases);
        clients.add(client);
        
        clients.add(new Client("Sanchez","Liliette",16,"Female"));        
        clients.add(new Client("Sanchez","Jesus",15,"Male"));        
        clients.add(new Client("Sanchez","Mark",12,"Male"));        
        clients.add(new Client("Sanchez","Luis",11,"Male"));        
        clients.add(new Client("Sanchez","Selena",10,"Female"));        
        clients.add(new Client("Sanchez","Christian",8,"Male"));        
        clients.add(new Client("Sanchez","Vanessa",7,"Female"));        
        clients.add(new Client("Sanchez","Alexsy",5,"Male"));        
        clients.add(new Client("Rodriguez","Sandro",10,"Male"));        
        clients.add(new Client("Alvarez","Alberto",12,"Male"));        
        clients.add(new Client("Olmedo","Jesus",5,"Male"));        
        clients.add(new Client("Salazar","Carlos",8,"Male"));        
        clients.add(new Client("Cuevas","Roberta",9,"Female"));        
        clients.add(new Client("Merigo","Claudia",10,"Female"));        
        clients.add(new Client("Salado","Norma",16,"Female"));        
        clients.add(new Client("Reynoso","Diana",4,"Female"));
    }

    private void resetCases() {
        Case c = new Case("Family Visit", "Normal");
        // https://www.childwelfare.gov/systemwide/laws_policies/statutes/homestudyreqs.pdf
        c.addTask("Accessible Help", "Telephone service shall be readily accessible in the home at all times");
        c.addTask("Play Space", "A play space for indoor and outdoor activities will be provided.");
        c.addTask("Working Utilities","The residence shall have a working telephone, electrical service, gas, comfortably regulated cooling and heating, adequate\n" + 
        "lighting, and a safe water supply.");
        c.addTask("Proper Bed","Beds and mattresses shall be of size and quality to allow good sleeping posture");
        c.addTask("Bedroom Separation per Gender","Separate sleeping rooms shall be provided for children over age 6 who are of the opposite sex.");
        c.addTask("Sufficient Bedrooms","An adequate number of bedrooms shall be provided for all persons residing in the home.");
        c.addTask("Clean Bathrooms","Sanitary bathroom facilities that provide privacy shall be available for use by family members and foster children.");
        c.addTask("Hazard-Free Environment","Nothing that constitutes a hazard is allowed on the property. There shall be appropriate safeguards against potential hazards.");
        c.addTask("Fire Safety","Smoke detectors, carbon monoxide detectors, and fire extinguishers");
        cases.add(c);
        
        cases.add(new Case("Relocation", "High"));
        cases.add(new Case("Safety Assessment", "High"));
        cases.add(new Case("Home Inspection", "Normal"));
        cases.add(new Case("Request Medication", "Normal"));
        cases.add(new Case("Abuse Report", "Urgent"));
    }
}
