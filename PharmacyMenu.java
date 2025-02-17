import java.util.Scanner;

public class PharmacyMenu {
    public static void main(String[] args) {
        MedicationTrackingSystem system = new MedicationTrackingSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Welcome To The Pharmacy Med Tracking System =====");
            System.out.println("What would you like to do?");
            System.out.println("1: Add A New Patient");
            System.out.println("2: Add A New Doctor");
            System.out.println("3: Add A New Medication To The Pharmacy");
            System.out.println("4: Search for Patient, Medication, or Doctor");
            System.out.println("5: Check If Medications Are Expired");
            System.out.println("6: Process A New Prescription");
            System.out.println("7: Assign Patient to a Doctor");
            System.out.println("8: Print All Prescriptions for a Specific Doctor");
            System.out.println("9: Restock All Medications");
            System.out.println("10: Edit Patient, Doctor, or Medication");
            System.out.println("11: Delete Patient, Doctor, or Medication");
            System.out.println("12: Generate System Report");
            System.out.println("13: Exit");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addNewPatient(scanner, system);
                    break;
                case 2:
                    addNewDoctor(scanner, system);
                    break;
                case 3:
                    addNewMedicationToPharmacy(scanner, system);
                    break;
                case 4:
                    searchRecords(scanner, system);
                    break;
                case 5:
                    checkExpiredMeds(system);
                    break;
                case 6:
                    processNewScript(scanner, system);
                    break;
                case 7:
                    assignPatientToDoctor(scanner, system);
                    break;
                case 8:
                    printScriptsForSpecificDoctor(scanner, system);
                    break;
                case 9:
                    restockPharmacyDrugs(scanner, system);
                    break;
                case 10:
                    editEntry(scanner, system);
                    break;
                case 11:
                    deleteEntry(scanner, system);
                    break;
                case 12:
                    printPharmacyReport(system);
                    break;
                case 13:
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

    private static void addNewMedicationToPharmacy(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void searchRecords(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void processNewScript(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void checkExpiredMeds(MedicationTrackingSystem system) {
    }

    private static void assignPatientToDoctor(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void printScriptsForSpecificDoctor(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void restockPharmacyDrugs(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void editEntry(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void deleteEntry(Scanner scanner, MedicationTrackingSystem system) {
    }

    private static void printPharmacyReport(MedicationTrackingSystem system) {
    }
}
