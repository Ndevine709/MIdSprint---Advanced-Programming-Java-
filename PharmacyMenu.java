import java.util.Scanner;

public class PharmacyMenu {
    public static void main(String[] args) {
        MedicationTrackingSystem system = new MedicationTrackingSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Welcome To The Pharmacy Med Tracking System =====");
            System.out.println("1: Add A New Patient");
            System.out.println("2: Delete A Patient");
            System.out.println("3: Edit A Patient");
            System.out.println("4: Add A New Doctor");
            System.out.println("5: Delete A Doctor");
            System.out.println("6: Edit A Doctor");
            System.out.println("7: Add A New Medication");
            System.out.println("8: Delete A Medication");
            System.out.println("9: Edit A Medication");
            System.out.println("10: Search for Patient, Medication, or Doctor");
            System.out.println("11: Accept A Prescription");
            System.out.println("12: Assign Patient to a Doctor");
            System.out.println("13: Generate System Report");
            System.out.println("14: Generate Expired Medication Report");
            System.out.println("15: Print All Prescriptions for a Specific Doctor");
            System.out.println("16: Restock All Medications");
            System.out.println("17: Exit");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addNewPatient(scanner, system);
                    break;
                case 2:
                    deletePatient(scanner, system);
                    break;
                case 3:
                    editPatient(scanner, system);
                    break;
                case 4:
                    addNewDoctor(scanner, system);
                    break;
                case 5:
                    deleteDoctor(scanner, system);
                    break;
                case 6:
                    editDoctor(scanner, system);
                    break;
                case 7:
                    addNewMedication(scanner, system);
                    break;
                case 8:
                    deleteMedication(scanner, system);
                    break;
                case 9:
                    editMedication(scanner, system);
                    break;
                case 10:
                    searchRecords(scanner, system);
                    break;
                case 11:
                    acceptPrescription(scanner, system);
                    break;
                case 12:
                    assignPatientToDoctor(scanner, system);
                    break;
                case 13:
                    generateSystemReport(system);
                    break;
                case 14:
                    generateExpiredMedicationReport(system);
                    break;
                case 15:
                    printPrescriptionsByDoctor(scanner, system);
                    break;
                case 16:
                    restockAllMedications(scanner, system);
                    break;
                case 17:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please choose a valid option.");
            }
        }
        scanner.close();
    }

    private static void addNewPatient(Scanner scanner, MedicationTrackingSystem system) {
        System.out.println("\nEnter Patient Details:");
    
        System.out.print("ID: ");
        String id = scanner.nextLine();
    
        System.out.print("Name: ");
        String name = scanner.nextLine();
    
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
    
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
    
        // store in memory
        Patient newPatient = new Patient(id, name, age, phoneNumber);
        system.addPatient(newPatient);
    
        // confirm patient was added
        System.out.println("\nPatient added successfully!");
    }
    
    private static void deletePatient(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter the ID of the patient you would like to delete: ");
        String patientID = scanner.nextLine();

        Patient toDelete = null;

        for (Patient patient: system.getPatients()) {
            if (patient.getID().equalsIgnoreCase(patientID)) {
                toDelete = patient;
                break;
            }
        }
        if (toDelete != null) {
            system.getPatients().remove(toDelete);
            System.out.println("Patient with ID of " + patientID + " has been deleted");
        } else {
            System.out.println("No patient found with an ID of " + patientID);
        }
    }
    private static void editPatient(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter the ID of the patient you would like to edit: ");
        String patientID = scanner.nextLine();

        Patient toEdit = null;
        for (Patient patient : system.getPatients()) {
            if (patient.getID().equalsIgnoreCase(patientID)) {
                toEdit = patient;
                break;
            }
        }
        if (toEdit != null) {
            System.out.println("Editing Patient: " + toEdit);

            System.out.print("Enter new name (leave blank for same name): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                toEdit.setName(newName);
            }

            System.out.print("Enter new age (leave blank for same name): ");
            String newAge = scanner.nextLine();
            if (!newAge.isEmpty()) {
                toEdit.setAge(Integer.parseInt(newAge));
            }

            System.out.print("Enter new phone number (leave blank for same name): ");
            String newNumber = scanner.nextLine();
            if (!newNumber.isEmpty()) {
                toEdit.setPhoneNumber(newNumber);
            }

            System.out.print("Patient details have been updated");
        } else {
            System.out.println("No patient found with an ID of " + patientID);
        }
        }
    
    private static void addNewDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.println("\nEnter Doctor Details:");
    
        System.out.print("ID: ");
        String id = scanner.nextLine();
    
        System.out.print("Name: ");
        String name = scanner.nextLine();
    
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
    
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Doctor Specialization");
        String specialization = scanner.nextLine();
    
        // store in memory
        Doctor newDoctor = new Doctor(id, name, age, phoneNumber, specialization);
        system.addDoctor(newDoctor);
    
        // confirm new doctor was added
        System.out.println("\nDoctor added successfully!");
    }
    private static void deleteDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter the ID of the doctor you would like to delete: ");
        String doctorID = scanner.nextLine();

        Doctor toDelete = null;

        for (Doctor doctor: system.getDoctors()) {
            if (doctor.getID().equalsIgnoreCase(doctorID)) {
                toDelete = doctor;
                break;
            }
        }
        if (toDelete != null) {
            system.getDoctors().remove(toDelete);
            System.out.println("Doctor with ID of " + doctorID + " has been deleted");
        } else {
            System.out.println("No patient found with an ID of " + doctorID);
        }
    }
    private static void editDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter the ID of the doctor you would like to edit: ");
        String doctorID = scanner.nextLine();

        Doctor toEdit = null;
        for (Doctor doctor : system.getDoctors()) {
            if (doctor.getID().equalsIgnoreCase(doctorID)) {
                toEdit = doctor;
                break;
            }
        }
        if (toEdit != null) {
            System.out.println("Editing Doctor: " + toEdit);

            System.out.print("Enter new name (leave blank for same name): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                toEdit.setName(newName);
            }

            System.out.print("Enter new age (leave blank for same name): ");
            String newAge = scanner.nextLine();
            if (!newAge.isEmpty()) {
                toEdit.setAge(Integer.parseInt(newAge));
            }

            System.out.print("Enter new phone number (leave blank for same name): ");
            String newNumber = scanner.nextLine();
            if (!newNumber.isEmpty()) {
                toEdit.setPhoneNumber(newNumber);
            }

            System.out.print("Enter new specialization (leave blank for same specialization)");
            String newSpecial = scanner.nextLine();
            if (!newSpecial.isEmpty()) {
                toEdit.setSpecialization(newSpecial);
            }

            System.out.print("Doctor details have been updated");
        } else {
            System.out.println("No doctor found with an ID of " + doctorID);
        }
    } // noah
    private static void addNewMedication(Scanner scanner, MedicationTrackingSystem system) {}
    private static void deleteMedication(Scanner scanner, MedicationTrackingSystem system) {}
    private static void editMedication(Scanner scanner, MedicationTrackingSystem system) {}
    private static void searchRecords(Scanner scanner, MedicationTrackingSystem system) {}
    private static void acceptPrescription(Scanner scanner, MedicationTrackingSystem system) {} // chris
    private static void assignPatientToDoctor(Scanner scanner, MedicationTrackingSystem system) {}
    private static void generateSystemReport(MedicationTrackingSystem system) {} // function done need to be called from MTS.java
    private static void generateExpiredMedicationReport(MedicationTrackingSystem system) {}
    private static void printPrescriptionsByDoctor(Scanner scanner, MedicationTrackingSystem system) {}
    private static void restockAllMedications(Scanner scanner, MedicationTrackingSystem system) {} // laura.
}
