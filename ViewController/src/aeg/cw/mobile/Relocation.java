package aeg.cw.mobile;

public class Relocation extends Case {
    public Relocation(){
        this.setType("Relocation");
        this.setPriority(Priority.Urgent);
        
        this.addTask("Locate Child","Is the victim at home, at school or somewhere else?");
        this.addTask("Select Destination","Is this place available? Are there any significant pending issues?");
        this.addTask("Transport Child","Ensure vehicle meets child seat requirements");
    }
}
