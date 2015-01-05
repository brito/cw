package aeg.cw.mobile;

public class FamilyVisit extends Case {
    public FamilyVisit(){
        this.setType("Family Visit");
        
        this.addTask("Monthly Visit", "The following may be addressed, as age appropriate, with the child(ren) at least monthly during the worker visit.");
        this.addTask("Safety Assessment","Discuss the child's feelings of safety in the placement and note any safety concerns. Assess the child's risk in the placement. Note concerns about any household members' behaviors/interactions based on worker observation or as discussed with the provider. Observed safety concerns should be immediately discussed with the provider and then discussed with the supervisor and licensing worker.");
        this.addTask("Wellbeing","Assess if the child has any feelings of guilt or blame for events which occurred or caused separation from family. Discuss with the child as needed and appropriate.");
        this.addTask("Adjustment","Discuss child's adjustment to current placement as well as interactions with other family members. Note changes in household composition or structure.");
        this.addTask("Issues","Discuss child's loss and grief issues.");
        this.addTask("Performance","Discuss child's adjustment and performance at school or daycare if applicable.");
        
    }
}
