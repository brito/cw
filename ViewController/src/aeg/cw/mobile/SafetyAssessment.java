package aeg.cw.mobile;

public class SafetyAssessment extends Case {
    public SafetyAssessment(){
        this.setType("Safety Assessment");
        this.setPriority(Priority.Important);
        
        this.addTask("Safety Restrictions","Are safety threats being sufficiently managed in the least restrictive way possible?");
        this.addTask("Find Strengths","Can existing protective capacities (strengths) be built upon to make needed changes?");
        this.addTask("Make a Plan","What is the relationship between identified safety threats and currently diminished protective capacities?");
        this.addTask("Same Page","What is the perspective or awareness regarding safety threats and their relationship to diminished parental protective capacities?");
        this.addTask("Assign Tasks","What are parents ready, willing and able to do to make needed changes?");
        this.addTask("Identify Challenges","What are the areas of disagreement between the parents and Child Welfare regarding what needs to change?");
        this.addTask("Stick to the Plan","What change actions, services and activities will be used to assist in enhancing diminished parental protective capacities?");
        
    }
}
