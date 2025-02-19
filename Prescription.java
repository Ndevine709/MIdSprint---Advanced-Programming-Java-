import java.time.LocalDate;

public class Prescription {
    // attributes
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate dateIssued;
    private LocalDate expiryDate;

    // Constructors
public Prescription(String id, Doctor doctor, Patient patient, Medication medication, LocalDate dateIssued, LocalDate expiryDate){
    this.id = id;
    this.doctor = doctor;
    this.patient = patient;
    this.medication = medication;
    this.dateIssued = dateIssued;
    this.expiryDate = expiryDate;
}

    // Getters and setters

public String getID(){
    return id;
}

public void setID(String id){
    this.id = id;
}

public Doctor getDoctor(){
    return doctor;
}

public void setDoctor(Doctor doctor){
    this.doctor = doctor;
}

public Patient getPatient(){
    return patient;
}

public void setPatient(Patient patient){
    this.patient = patient;
}

public Medication getMedication(){
    return medication;
}

public void setMedication(Medication medication){
    this.medication = medication;
}

public LocalDate getDateIssued(){
    return dateIssued;
}

public void setDateIssued(LocalDate dateIssued){
    this.dateIssued = dateIssued;
    this.expiryDate = dateIssued.plusYears(1); // Autoset to one year from dateIssued
}

public LocalDate getExpiryDate(){
    return expiryDate;
}

public void setExpiryDate(LocalDate expiryDate){
    this.expiryDate = expiryDate;
}

public String toString(){
    return  "Prescription [ID =" + id + ", Doctor =" + doctor + ", Patient =" + patient + "Medication =" + medication + "Date Issued =" + dateIssued + "Expiry Date =" + expiryDate + "]";
}

}
