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
        Client client = new Client("Sanchez", "Jerry", "UTAE031943", 40, "data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7");
        client.setCases(cases);
        clients.add(client);
    }

    private void resetCases() {
        Case c = new Case("Family Visit", new Date(), 0);
        // https://www.childwelfare.gov/systemwide/laws_policies/statutes/homestudyreqs.pdf
        c.addTask("Accessible Help", "Telephone service shall be readily accessible in the home at all times");
        cases.add(c);
    }
}
