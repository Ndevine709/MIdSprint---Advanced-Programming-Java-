import java.util.Scanner;

public class PharmacyMenu {
    public static void main(String[] args) {
        MedicationTrackingSystem system = new MedicationTrackingSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Welcome To The Pharmacy Med Tracking System =====");
            System.out.println("1: Add A New Patient");
            System.out.println("2: Add A New Doctor");
            System.out.println("3: Add A New Medication To The Pharmacy");
            System.out.println("4: Search for Patient, Medication, or Doctor");
            System.out.println("5: Check If Medications Are Expired");
            System.out.println("6: Process A New Prescription");
            System.out.println("7: Assign Patient to a Doctor");
            System.out.println("8: Print All Prescriptions for a Specific Doctor");
            System.out.println("9: Restock All Medications");
            System.out.println("10: Generate System Report");
            System.out.println("11: Exit");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addNewPatient(scanner, system);
                    break;
                case 2:
                    addNewDoctor(scanner, system);
                    break;
                case 3:
                    addNewMedication(scanner, system);
                    break;
                case 4:
                    searchRecords(scanner, system);
                    break;
                case 5:
                    checkExpiredMedications(system);
                    break;
                case 6:
                    processNewPrescription(scanner, system);
                    break;
                case 7:
                    assignPatientToDoctor(scanner, system);
                    break;
                case 8:
                    printPrescriptionsByDoctor(scanner, system);
                    break;
                case 9:
                    restockMedication(scanner, system);
                    break;
                case 10:
                    generateSystemReport(system);
                    break;
                case 11:
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
    }

    private static void addNewDoctor(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void addNewMedication(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void searchRecords(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void checkExpiredMedications(MedicationTrackingSystem system) {
    }

    private static void processNewPrescription(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void assignPatientToDoctor(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void printPrescriptionsByDoctor(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void restockMedication(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void generateSystemReport(MedicationTrackingSystem system) {
    }
}
