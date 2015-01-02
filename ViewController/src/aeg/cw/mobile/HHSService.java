package aeg.cw.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

import oracle.adfmf.util.Utility;
import oracle.adfmf.util.logging.Trace;

public class HHSService {
    private List<Client> clients = new ArrayList<Client>();
    private List<Case> cases = new ArrayList<Case>();
    
    public Client[] getClients(){
        return clients.toArray(new Client[clients.size()]);
    }

    // This generator returns 5 cases, randomly
    public Client[] getRecent(){
        int num_results = 5;
        Collections.shuffle(clients);
        int a = new Random().nextInt(clients.size() - num_results);
        Client[] recent = clients.subList(a, a + num_results).toArray(new Client[num_results]);
        return recent;
    }
    
    public Case[] getCases(){
        return cases.toArray(new Case[cases.size()]);
    }
    public Case[] getSchedule(){
        int num_results = 5;
        Collections.shuffle(cases);
        int a = new Random().nextInt(cases.size() - num_results);
        Case[] schedule = cases.subList(a, a + num_results).toArray(new Case[num_results]);
        return schedule;
    }
    
    public HHSService() {
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
        
        Random rnd = new Random();
        for (String s : data){
            String[] tokens = s.split(",");
            String gender = tokens[0].equalsIgnoreCase("f") ? "Female" : "Male";
            int age = Integer.parseInt(tokens[1]);
            String name = tokens[2];
            
            Client client = new Client(name, age, gender);
            String url = "/photos/" + tokens[0] + tokens[1] + tokens[2] + ".jpg";
            client.setPhoto(url);
            clients.add(client);
            
            log(name +", "+ age +", "+ gender +", "+ url);
            
            // assign random cases
            int n = rnd.nextInt(3);
            for(int i=0; i < n;i++){
                Case c = new Case();
                switch (rnd.nextInt(5)) {
                case 0: c = new FamilyVisit(); break;
                case 1: c = new Relocation(); break;
                case 2: c = new SafetyAssessment(); break;
                case 3: c = new HomeInspection(); break;
                case 4: c = new RequestMedication(); break;
                case 5: c = new AbuseReport(); break;
                }
                cases.add(client.addCase(c));
                
                log(c.getPriority() + " " + c.getType() + " " + c.getClientFirstName());
            }
        }
    }
}
