package aeg.cw.mobile;

public class RequestMedication extends Case {
    public RequestMedication(){
        this.setType("Request Medication");
        
        this.addTask("Validate Prescription","Determine if current dose is appropriate according to medical advice");
        this.addTask("Identify Issues","Count prescription available and projected need from dosage log records, if available");
        this.addTask("Submit Request","");
    }
}
