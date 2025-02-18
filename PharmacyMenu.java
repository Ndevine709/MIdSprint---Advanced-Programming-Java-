import java.time.LocalDate;
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

        for (Patient patient : system.getPatients()) {
            if (patient.getID().equalsIgnoreCase(patientID)) {
                toDelete = patient;
                break;
            }
        }
        if (toDelete != null) {
            system.getPatients().remove(toDelete);
            System.out.println("Patient with ID of " + patientID + " has been deleted");
        } else {
            System.out.println("No patient found with an ID of: " + patientID);
        }
    }

    private static void editPatient(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter the ID of the patient to edit: ");
        String patientID = scanner.nextLine();

        Patient ToEdit = null;
        for (Patient patient : system.getPatients()) {
            if (patient.getID().equalsIgnoreCase(patientID)) {
                ToEdit = patient;
                break;
            }
        }

        if (ToEdit != null) {
            System.out.println("Editing Patient: " + ToEdit);

            System.out.print("Enter new name (leave blank to keep current): ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                ToEdit.setName(newName);
            }

            System.out.print("Enter new age (leave blank to keep current): ");
            String newAge = scanner.nextLine();
            if (!newAge.isEmpty()) {
                ToEdit.setAge(Integer.parseInt(newAge));
            }

            System.out.print("Enter new phone number (leave blank to keep current): ");
            String newPhoneNumber = scanner.nextLine();
            if (!newPhoneNumber.isEmpty()) {
                ToEdit.setPhoneNumber(newPhoneNumber);
            }

            System.out.println("Patient details have been updated.");
        } else {
            System.out.println("No patient found with ID of " + patientID);
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

        for (Doctor doctor : system.getDoctors()) {
            if (doctor.getID().equalsIgnoreCase(doctorID)) {
                toDelete = doctor;
                break;
            }
        }
        if (toDelete != null) {
            system.getDoctors().remove(toDelete);
            System.out.println("Doctor with ID of " + doctorID + " has been deleted");
        } else {
            System.out.println("No patient found with an ID of: " + doctorID);
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
    
            System.out.print("Enter new age (leave blank for same age): ");
            String newAge = scanner.nextLine();
            if (!newAge.isEmpty()) {
                toEdit.setAge(Integer.parseInt(newAge));
            }
    
            System.out.print("Enter new phone number (leave blank for same number): ");
            String newNumber = scanner.nextLine();
            if (!newNumber.isEmpty()) {
                toEdit.setPhoneNumber(newNumber);
            }
    
            System.out.print("Enter new specialization (leave blank for same specialization): ");
            String newSpecialization = scanner.nextLine();
            if (!newSpecialization.isEmpty()) {
                toEdit.setSpecialization(newSpecialization);
            }
    
            System.out.println("Doctor details have been updated.");
        } else {
            System.out.println("No doctor found with an ID of " + doctorID);
        }
    } // noah

    private static void addNewMedication(Scanner scanner, MedicationTrackingSystem system) {
        System.out.println("\nEnter Medication Details:");

        System.out.print("ID");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Dose (mg): ");
        double dose = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Stock Quantity: ");
        int stockQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Expiry Date (YYYY-MM-DD): ");
        String expiryDateStr = scanner.nextLine();
        LocalDate expiryDate = LocalDate.parse(expiryDateStr); // convert the input to date (googled this, need to look
                                                               // into it more)

        // stores the medication
        Medication newMedication = new Medication(id, name, dose, stockQuantity, expiryDate);
        system.addMedication(newMedication);

        // confirm medication was added
        System.out.println("\nMedication added successfully!");
    }

    private static void deleteMedication(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter the name of the medication you would like to delete: ");
        String medicationName = scanner.nextLine();

        Medication toDelete = null;

        // go through medications and find a match by name
        for (Medication medication : system.getMedications()) {
            if (medication.getName().equalsIgnoreCase(medicationName)) {
                toDelete = medication;
                break;
            }
        }

        // remove the medication if found
        if (toDelete != null) {
            system.getMedications().remove(toDelete);
            System.out.println("Medication with name \"" + medicationName + "\" has been deleted.");
        } else { // let you know if one cannot be found
            System.out.println("No medication found with the name \"" + medicationName + "\".");
        }
    }

    private static void editMedication(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("\nEnter the name of the medication to edit: ");
        String name = scanner.nextLine();

        for (Medication medication : system.getMedications()) {
            if (medication.getName().equalsIgnoreCase(name)) {
                System.out.print("New Dose (mg): ");
                medication.setDose(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("New Stock Quantity: ");
                medication.setStockQuantity(scanner.nextInt());
                scanner.nextLine();

                System.out.print("New Expiry Date (YYYY-MM-DD): ");
                medication.setExpiryDate(LocalDate.parse(scanner.nextLine()));

                System.out.println("\nMedication updated successfully!");
                return;
            }
        }

        System.out.println("No medication found with the name: " + name);
    }

    private static void searchRecords(Scanner scanner, MedicationTrackingSystem system) {
        System.out.println("\nSearch for:");
        System.out.println("1: Patient");
        System.out.println("2: Medication");
        System.out.println("3: Doctor");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the name to search: ");
        String name = scanner.nextLine();

        boolean found = false; // easist way I found to error handel right now, but can look into future improvements

        if (choice == 1) { 
            for (Patient patient : system.getPatients()) {
                if (patient.getName().equalsIgnoreCase(name)) {
                    System.out.println("\nPatient Found: " + patient);
                    found = true;
                    break;
                }
            }
        } else if (choice == 2) { 
            for (Medication medication : system.getMedications()) {
                if (medication.getName().equalsIgnoreCase(name)) {
                    System.out.println("\nMedication Found: " + medication);
                    found = true;
                    break;
                }
            }
        } else if (choice == 3) { 
            for (Doctor doctor : system.getDoctors()) {
                if (doctor.getName().equalsIgnoreCase(name)) {
                    System.out.println("\nDoctor Found: " + doctor);
                    found = true;
                    break;
                }
            }
        } else {
            System.out.println("Invalid option.");
            return;
        }

        if (!found) {
            System.out.println("No record found with the name: " + name);
        }
    }

    private static void acceptPrescription(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("\nEnter Doctor's Name: ");
        String doctorName = scanner.nextLine();

        System.out.print("Enter Patient's Name: ");
        String patientName = scanner.nextLine();

        System.out.print("Enter Medication Name: ");
        String medicationName = scanner.nextLine();

        // Add the prescription to the system
        system.addPrescription(doctorName, patientName, medicationName);

        System.out.println("\nPrescription accepted successfully!");
    }// chris

    private static void assignPatientToDoctor(Scanner scanner, MedicationTrackingSystem system) { 
        // Prompt user for patients id
        System.out.println("Please enter the Patient's ID: ");
        String patientId = scanner.nextLine();

        // Prompt user for doctors id
        System.out.println("Please enter the Doctor's ID: ");
        String doctorId = scanner.nextLine();

        // Find patient in the system
        Patient patient = system.findPatientById(patientId);
        if(patient ==null){
            System.out.println("Patient not found.");
            return;
        }

        // Find doctor in the system
        Doctor doctor = system.findDoctorById(doctorId);
        if(doctor == null){
            System.out.println("Doctor not found.");
            return;
        }

        // Assign the patient to a doctor
        doctor.addPatient(patient);
        System.out.println("Patient " + patient.getName() + " has been assigned to Doctor " + doctor.getName()+ ".");
    }

    private static void generateSystemReport(MedicationTrackingSystem system) {
        system.generateReport();
    } 

    private static void generateExpiredMedicationReport(MedicationTrackingSystem system) {
        system.checkExpiredMedications();
    }

    private static void printPrescriptionsByDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.println("Enter the doctor's name: ");
        String doctorName = scanner.nextLine();
        
        // Call method to print prescetipions by doctor
        system.printPrescriptionsByDoctor(doctorName);
    }

    private static void restockAllMedications(Scanner scanner, MedicationTrackingSystem system) {
        // Prompt user for restock quanitity
        System.out.println("Please enter the restock quantity for all medications:");
        int stockQuantity = scanner.nextInt();
        scanner.nextLine();

        // Restock each medication in the system
        for (Medication medication : system.getMedications()){
            medication.setStockQuantity(medication.getStockQuantity()+ stockQuantity);
            System.out.println("Restocked " + medication.getName()+ "by"+ stockQuantity);
        }
    } 
}
