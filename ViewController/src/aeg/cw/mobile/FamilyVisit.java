package aeg.cw.mobile;

public class FamilyVisit extends Case {
    public FamilyVisit(){
        this.setPriority(Priority.NORMAL);
        this.setType("Family Visit");
        
        // https://www.childwelfare.gov/systemwide/laws_policies/statutes/homestudyreqs.pdf
        this.addTask("Accessible Help", "Telephone service shall be readily accessible in the home at all times");
        this.addTask("Play Space", "A play space for indoor and outdoor activities will be provided.");
        this.addTask("Working Utilities","The residence shall have a working telephone, electrical service, gas, comfortably regulated cooling and heating, adequate\n" + 
        "lighting, and a safe water supply.");
        this.addTask("Proper Bed","Beds and mattresses shall be of size and quality to allow good sleeping posture");
        this.addTask("Bedroom Separation per Gender","Separate sleeping rooms shall be provided for children over age 6 who are of the opposite sex.");
        this.addTask("Sufficient Bedrooms","An adequate number of bedrooms shall be provided for all persons residing in the home.");
        this.addTask("Clean Bathrooms","Sanitary bathroom facilities that provide privacy shall be available for use by family members and foster children.");
        this.addTask("Hazard-Free Environment","Nothing that constitutes a hazard is allowed on the property. There shall be appropriate safeguards against potential hazards.");
        this.addTask("Fire Safety","Smoke detectors, carbon monoxide detectors, and fire extinguishers");
        
    }
}
