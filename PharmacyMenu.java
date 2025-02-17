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

    private static void addNewPatient(Scanner scanner, MedicationTrackingSystem system) {}
    private static void deletePatient(Scanner scanner, MedicationTrackingSystem system) {}
    private static void editPatient(Scanner scanner, MedicationTrackingSystem system) {}
    private static void addNewDoctor(Scanner scanner, MedicationTrackingSystem system) {}
    private static void deleteDoctor(Scanner scanner, MedicationTrackingSystem system) {}
    private static void editDoctor(Scanner scanner, MedicationTrackingSystem system) {}
    private static void addNewMedication(Scanner scanner, MedicationTrackingSystem system) {}
    private static void deleteMedication(Scanner scanner, MedicationTrackingSystem system) {}
    private static void editMedication(Scanner scanner, MedicationTrackingSystem system) {}
    private static void searchRecords(Scanner scanner, MedicationTrackingSystem system) {}
    private static void acceptPrescription(Scanner scanner, MedicationTrackingSystem system) {}
    private static void assignPatientToDoctor(Scanner scanner, MedicationTrackingSystem system) {}
    private static void generateSystemReport(MedicationTrackingSystem system) {}
    private static void generateExpiredMedicationReport(MedicationTrackingSystem system) {}
    private static void printPrescriptionsByDoctor(Scanner scanner, MedicationTrackingSystem system) {}
    private static void restockAllMedications(Scanner scanner, MedicationTrackingSystem system) {}
}
