/**
 * Patient class extends the Person super class and represents a patient in the system.
 * Includes methods and attributes specific to the patients.
 */

import java.util.List;
import java.util.ArrayList;

public class Patient extends Person {
    // Attributes
    private List <Medication> medications;
    private List <Prescription> prescriptions;

    // Constructor
    /**
     * 
     * @param id                Uniqge identifier for the patient
     * @param name              Name of the patient
     * @param age               Age of the patient
     * @param phoneNumber       Phone number of the patient
     */

    public Patient (String id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber);
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    // Methods, getters & setters
    /**
     * 
     * @return the list of medications the patient is taking
     */

    public List <Medication> getMedications () {
        return medications;
    }

    /**
     * 
     * @param medications sets the new list of medications
     */
    public void setMedications (List <Medication> medications) {
        this.medications = medications;
    }

    /**
     * 
     * @return the list of prescriptions
     */
    public List <Prescription> getPrescriptions () {
        return prescriptions;
    }

    /**
     * 
     * @param prescriptions set the list of prescriptions
     */
    public void setPrescriptions (List <Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    /**
     * 
     * @param medication adds a medication to the patients list of medications
     */
    public void addMedication (Medication medication) {
        this.medications.add(medication);
    }

    /**
     * 
     * @param prescription adds a prescription to the list of prescriptions
     */
    public void addPrescription (Prescription prescription) {
        this.prescriptions.add(prescription);
    }

    @Override
    public String toString () {
        return "Patient [ID =" + getID() + ", Name =" + getName() + ", Age =" + getAge() + ", Phone Number =" + getPhoneNumber() + ", Medications =" + medications + ", Prescriptions =" + prescriptions + "]";
    }
}
