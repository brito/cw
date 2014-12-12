package aeg.cw.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HHSService {
    private List<Client> clients = new ArrayList<Client>();
    private List<Case> cases = new ArrayList<Case>();
    
    public Client[] getClients(){
        return clients.toArray(new Client[clients.size()]);
    }
    public Case[] getCases(){
        Case[] sorted = cases.toArray(new Case[cases.size()]);
        // by priority
        Arrays.sort(sorted);
        return sorted;
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
        cases.add(new FamilyVisit());
        
        cases.add(new Relocation());
        cases.add(new SafetyAssessment());
        cases.add(new HomeInspection());
        cases.add(new RequestMedication());
        cases.add(new AbuseReport());
    }
}
