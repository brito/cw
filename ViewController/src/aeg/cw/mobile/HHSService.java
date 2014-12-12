package aeg.cw.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import oracle.adfmf.util.Utility;
import oracle.adfmf.util.logging.Trace;

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
    
    private void log(String msg){
        Trace.log(Utility.ApplicationLogger, Level.SEVERE, this.getClass(), "", msg);
    }
    
    private void resetClients(){
        // Ideally these are read/loaded from /photos directory
        String[] data = {"f,5,dalia","f,5,mariah","f,5,misty",
                            "f,6,destiny","f,8,genesis","f,10,guadalupe",
                            "f,10,iris","f,11,juanita","f,12,calinda",
                            "f,12,cassidy","f,12,joana","f,12,maria",
                            "f,13,alize","f,13,ariana","f,13,celia","f,13,crystal",
                            "f,13,jasmin","f,13,kiley","f,14,celestina","f,14,maria",
                            "f,15,danyel","f,16,lillyanna","f,16,viviana","f,17,barbie",
                            "f,18,natalie","m,1,vincent","m,4,kelvin","m,7,ramon","m,8,joseph",
                            "m,8,kalob","m,8,noah","m,9,brandon","m,9,jesus","m,10,armani",
                            "m,10,kane","m,11,anthony","m,11,esteven","m,11,michael",
                            "m,12,aiden","m,12,mateo","m,12,michael","m,14,christopher",
                            "m,14,kenton","m,15,christopher","m,15,dyllan","m,15,mio",
                            "m,16,lase","m,17,garrant"};
        // find more at http://adoptuskids.org
        
        for (String s : data){
            String[] tokens = s.split(",");
            String gender = tokens[0] == "f" ? "Female" : "Male";
            int age = Integer.parseInt(tokens[1]);
            String name = tokens[2];
            
            Client client = new Client(name, age, gender);
            client.setPhoto("/photos/" + tokens[0] + tokens[1] + tokens[2] + ".jpg");
            client.setCases(cases);
            clients.add(client);
        }
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
