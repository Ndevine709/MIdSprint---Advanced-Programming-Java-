/**
 * The Doctor class extends the Person class and represents a doctor within the system.
 * Includes methods and attributes specific to the doctors
 */

import java.util.ArrayList;
public class Doctor extends Person {
    // Attributes
    private String specialization;
    private ArrayList<Patient> patients;

    // Constructor 
    /**
     * 
     * @param id                Unique identifier for the doctors
     * @param name              Name of the doctor
     * @param age               Age of the doctor
     * @param phoneNumber       Phone number for the doctor
     * @param specialization    Doctors area of expertise
     */

    public Doctor(String id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Getters
    /**
     * 
     * @return the list of patients the doctor is managing
     */
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    /**
     * 
     * @return the doctors specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    // Setters
    /**
     * 
     * @param specialization sets the doctors specialization
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * 
     * @param patient adds a patient to the doctors list of patients
     */
    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    @Override
    public String toString() {
        return "Doctor: " + getName() + " (" + specialization + ") with patients: " + patients;
    }
}

