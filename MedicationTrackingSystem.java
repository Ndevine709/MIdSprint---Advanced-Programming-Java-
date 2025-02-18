import java.util.*; // uses java's utility classes, including ArrayList, which stores lists of data.
import java.time.LocalDate;

public class MedicationTrackingSystem {
    // store data in lists
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Medication> medications = new ArrayList<>();
    private List<Prescription> prescriptions = new ArrayList<>();

    // method to add patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // method to get patients
    public List<Patient> getPatients() {
        return patients;
    }

    // method to get doctors
    public List<Doctor> getDoctors() {
        return doctors;
    }

    // method to add doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // method to add medication
    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    // method to get medications
    public List<Medication> getMedications() {
        return medications;
    }

    // method to find doctor by ID
    public Doctor findDoctorById(String id) {
        return doctors.stream().filter(doctor -> doctor.getID().equals(id)).findFirst().orElse(null);
    }

    // method to find patient by ID
    public Patient findPatientById(String id) {
        return patients.stream().filter(patient -> patient.getID().equals(id)).findFirst().orElse(null);
    }

    public void search(String name) {
        System.out.println("Searching for: " + name);
        // set a boolean to identify if anything is matched in the system
        boolean found = false;

        // search for the medications and return if one can be found, if not it will let
        // you know
        for (Medication medication : medications) {
            if (medication.getName().equalsIgnoreCase(name)) { // ignores cases for better searching
                System.out.println("Found Medication: " + medication);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No medication found with the name: " + name);
        }

        // search for the patients and return if one can be found,
        found = false;
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                System.out.println("Found Patient: " + patient);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No patient found with the name: " + name);
        }

        // search for doctors and return if one can be found,
        found = false;
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                System.out.println("Found Doctor: " + doctor);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No doctor found with the name: " + name);
        }
    }

    // other findings to make this easier
    // created a way to search through each set of data, doctor, patient, and
    // medication
    // using the stream function which converts the list into a stream (a pipeline
    // for processing data).

    // find doctor
    private Doctor findDoctor(String name) {
        return doctors.stream().filter(doctor -> doctor.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    // find patient
    private Patient findPatient(String name) {
        return patients.stream().filter(patient -> patient.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    // find medication
    private Medication findMedication(String name) {
        return medications.stream().filter(medication -> medication.getName().equalsIgnoreCase(name)).findFirst()
                .orElse(null);
    }

    // get medication by name
    public Medication getMedicationByName(String name) {
        return findMedication(name);
    }

    // creates a new prescription by finding a doctor, patient, and medication using
    // their names
    // If all three exist, it adds a new Prescription object to the prescriptions
    // list, assigning it a unique ID and setting the current date
    public void addPrescription(String doctorName, String patientName, String medicationName) {
        Doctor doctor = findDoctor(doctorName);
        Patient patient = findPatient(patientName);
        Medication medication = findMedication(medicationName);
        if (doctor != null && patient != null && medication != null) {
            prescriptions.add(
                    new Prescription("RX" + prescriptions.size(), doctor, patient, medication, LocalDate.now(), null));
            System.out.println("Prescription added.");
        }
    }

    // checks all medications in the system to see if their expiration date has
    // passed
    // If a medication is expired, it prints a warning message with the medications
    // name
    public void checkExpiredMedications() {
        LocalDate today = LocalDate.now();
        for (Medication medication : medications) {
            if (medication.getExpiryDate().isBefore(today)) {
                System.out.println("Expired: " + medication.getName());
            }
        }
    }

    // finds and prints all prescriptions written by a specific doctor by looping
    // through the prescriptions list.
    // if a prescription was issued by the specified doctor, it prints the
    // prescription details.
    public void printPrescriptionsByDoctor(String doctorName) {
        System.out.println("\n=== Prescriptions by Dr. " + doctorName + " ===");
        boolean found = false;

        for (Prescription prescription : prescriptions) {
            if (prescription.getDoctor().getName().equalsIgnoreCase(doctorName)) {
                System.out.println("Prescription ID: " + prescription.getID());
                System.out.println("Patient: " + prescription.getPatient().getName());
                System.out.println("Medication: " + prescription.getMedication().getName());
                System.out.println("Date Issued: " + prescription.getDateIssued());
                System.out.println("Expiry Date: " + prescription.getExpiryDate());
                System.out.println("-----------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No prescriptions found for Dr. " + doctorName);
        }
    }

    // finds a medication by its name and increases its stock quantity by the
    // specified amount.
    // If the medication is found, it updates the stock and prints a confirmation
    // message.
    public void restockMedication(String name, int quantity) {
        Medication medication = findMedication(name);
        if (medication != null) {
            medication.setStockQuantity(medication.getStockQuantity() + quantity);
            System.out.println("Restocked " + name + " by " + quantity);
        }
    }

    // prints a complete system report, listing all doctors, patients, medications,
    // and prescriptions stored in the system.
    // It uses Java's forEach method to print each list in a structured format.
    public void generateReport() {
        System.out.println("=== System Report ===");
        System.out.println("Doctors:");
        doctors.forEach(System.out::println);
        System.out.println("\nPatients:");
        patients.forEach(System.out::println);
        System.out.println("\nMedications:");
        medications.forEach(System.out::println);
        System.out.println("\nPrescriptions:");
        prescriptions.forEach(System.out::println);
    }
}
