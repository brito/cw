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
        cases.add(new Case("Family Visit", new Date(), "UTAE031943", 0));
    }
}
