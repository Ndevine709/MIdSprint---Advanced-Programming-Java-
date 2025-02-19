import java.time.LocalDate;
/**
 * The prescription class reprsents a prescription issued by a doctor for a patient
 * Also includes methods and attributes to manage prescription details
 */
public class Prescription {
// Attributes
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate dateIssued;
    private LocalDate expiryDate;

// Constructors
/**
 * 
 * @param id                Unique ID for the prescription
 * @param doctor            The prescribing doctor
 * @param patient           The patient getting the prescription
 * @param medication        The prescribed medication
 * @param dateIssued        The date the prescription was issued
 * @param expiryDate        The expiry date of the prescription
 */
public Prescription(String id, Doctor doctor, Patient patient, Medication medication, LocalDate dateIssued, LocalDate expiryDate){
    this.id = id;
    this.doctor = doctor;
    this.patient = patient;
    this.medication = medication;
    this.dateIssued = dateIssued;
    this.expiryDate = expiryDate;
}

// Getters and setters
/**
 * 
 * @return the ID of the prescription
 */
public String getID(){
    return id;
}

/**
 * 
 * @param id set the ID of the prescription
 */
public void setID(String id){
    this.id = id;
}

/**
 * 
 * @return the prescribing doctor
 */
public Doctor getDoctor(){
    return doctor;
}

/**
 * 
 * @param doctor set the prescribing doctor
 */
public void setDoctor(Doctor doctor){
    this.doctor = doctor;
}

/**
 * 
 * @return the patient being prescribed
 */
public Patient getPatient(){
    return patient;
}

/**
 * 
 * @param patient set the patient for the prescription
 */
public void setPatient(Patient patient){
    this.patient = patient;
}

/**
 * 
 * @return the medication being prescribed
 */
public Medication getMedication(){
    return medication;
}

/**
 * 
 * @param medication set the medication being prescribed
 */
public void setMedication(Medication medication){
    this.medication = medication;
}

/**
 * 
 * @return the issue date of the prescription 
 */
public LocalDate getDateIssued(){
    return dateIssued;
}

/**
 * 
 * @param dateIssued set the date issued of the prescribed prescription
 */
public void setDateIssued(LocalDate dateIssued){
    this.dateIssued = dateIssued;
    this.expiryDate = dateIssued.plusYears(1); // Autoset to one year from dateIssued
}

/**
 * 
 * @return the expiry date of the prescription
 */
public LocalDate getExpiryDate(){
    return expiryDate;
}

/**
 * 
 * @param expiryDate set the expiry date of the prescription
 */
public void setExpiryDate(LocalDate expiryDate){
    this.expiryDate = expiryDate;
}

public String toString(){
    return  "Prescription [ID =" + id + ", Doctor =" + doctor + ", Patient =" + patient + "Medication =" + medication + "Date Issued =" + dateIssued + "Expiry Date =" + expiryDate + "]";
}

}
