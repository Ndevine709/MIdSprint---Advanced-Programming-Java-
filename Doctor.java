import java.util.ArrayList;

public class Doctor extends Person {
    // attributes
    private String specialization;
    private ArrayList<Patient> patients;

    // constructor 
    public Doctor(String id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // getters
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public String getSpecialization() {
        return specialization;
    }

    // setters
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    @Override
    public String toString() {
        return "Doctor: " + getName() + " (" + specialization + ") with patients: " + patients;
    }
}

