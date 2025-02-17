import java.util.List;
import java.util.ArrayList;

public class Patient extends Person {
    // Attributes
    private List <Medication> medications;
    private List <Prescription> prescriptions;

    // Constructor
    public Patient (String id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber);
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    // Methods, getters & setters
    public List <Medication> getMedications () {
        return medications;
    }

    public void setMedications (List <Medication> medications) {
        this.medications = medications;
    }

    public List <Prescription> getPrescriptions () {
        return prescriptions;
    }

    public void setPrescriptions (List <Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void addMedication (Medication medication) {
        this.medications.add(medication);
    }

    public void addPrescription (Prescription prescription) {
        this.prescriptions.add(prescription);
    }

    @Override
    public String toString () {
        return "Patient [ID =" + getID() + ", Name =" + getName() + ", Age =" + getAge() + ", Phone Number =" + getPhoneNumber() + ", Medications =" + medications + ", Prescriptions =" + prescriptions + "]";
    }
}
