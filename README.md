# Mid Term Sprint - Pharmacy Management System
### Group Members: Laura Wiseman, Christopher Meadus, Noah Devine
### Due Date: March 2nd, 2025

# Overview
For this project, we created a comprehensive pharmacy system to manage patient drugs and information. This project was created using object-oriented programming (OOP) principles and
includes several classes representing different entities such as doctors, patients, medications prescriptions, and the overall medication tracking system.

# Project Managment
1. Noah Devine
   - Created the Person super class and patient class
   - Initalized the repo we worked in
   - Created five of the methods within the menu file
   - Created the readme for this project

2. Laura Wiseman
   - Created the Medication and Prescription classes
   - Created five of the methods within the menu file
   - Created required diagrams for the project
  
3. Christopher Meadus
   - Created the Doctor and MedicationTrackingSystem classes
   - Cleaned up the menu file
   - Created the video for this project
   - Created five methods within the menu file
  
We each split off and worked on our assigned classes, we made regular commits throughout the process and used branches to make our classes. We worked well as a team and if one group member ran into an issue, we would all come together to try and fix it.

# Repo Files Breakdown
Within this repo, you will find all the required files needed in order to run this program. The main files of this repo are:
1. Person.java
2. Patient.java
3. Doctor.java
4. Medication.java
5. Prescription.java
6. MedicationTrackingSystem.java
7. PharmacyMenu.java

All of these files together make up the pharmacy managment system and are required in order make the program run as intended.

#### Person.java
- The Person class is a super class that represents a generic person in the system. It includes attributes and methods that are both common to patients and doctors
- Attributes of this class includes ID, name, age, and a phone number
- This class also includes a constructor to initialize the attribures
- It also includes various getters and setters to allow for encapsulation and data manipulation
- These include:
  1. getID()
  2. setID()
  3. getName()
  4. setName()
  5. getAge()
  6. setAge()
  7. getPhoneNumber()
  8. setPhoneNumber()
  9. Custom toString() method

 #### Patient.java
 - The Patient class extends the Person supewr class and represents a patient in the system. It also includes additional attributes and methods specific to patients.
 - Attributes of this class include medications and prescriptions
 - This class also contains a constructor to initialize the attributes, inclduing those inherited from the Person super class
 - Methods, getters and setters include:
   1. getMedications()
   2. setMedications()
   3. getPrescriptions()
   4. setPrescriptions()
   5. addMedication()
   6. addPrescription()
   7. Custom toString() methods
  
#### Doctor.java
- Just like the Patient class, the Doctor class extends the Person super class and represents a doctor in the system. It also includes attributes and methods specific to doctors.
- Attributes include specialization and patients.
- This class also contains a constructor to initialize the attributes, inclduing those inherited from the Person super class.
- Methods, getters and setters include:
  1. getPatients()
  2. getSpecialization()
  3. setSpecialization(String specialization)
  4. addPatient(Patient patient)
  5. Custom toString() method
 
#### Medication.java
- The Medication class represents a medication in the system. It includes attributes and methods to manage medication details.
- Attributes include ID, name, dose, stockQuantity, expiryDate.
- This class also contains a constructor to initialize the attributes
- Methods, getters and setters include:
  1. getID()
  2. setID()
  3. getName()
  4. setName(String name)
  5. getDose()
  6. setDose(double dose)
  7. getStockQuantity()
  8. setStockQuantity(int stockQuantity)
  9. getExpiryDate()
  10. setExpiryDate(LocalDate expiryDate)
  11. Custom toString() method
 
#### Prescription.java
- The Prescription class represents a prescription issued by a doctor for a patient. It also includes attributes and methods to manage prescription details.
- Attributes include ID, doctor, patient, medication, dateIssued, expiryDate
- Just like the rest of the classes, the Prescription class also includes a constructor to initialize the attributes
- Methods, getters and setters include:
  1. getID()
  2. setID(String id)
  3. getDoctor()
  4. setDoctor(Doctor doctor)
  5. getPatient()
  6. setPatient(Patient patient)
  7. getMedication()
  8. setMedication(Medication medication)
  9. getDateIssued()
  10. setDateIssued(LocalDate dateIssued)
  11. getExpiryDate()
  12. setExpiryDate(LocalDate expiryDate)
  13. Custom toString method

#### MedicationTrackingSystem.java
- This class manages the entire pharmacy system, including doctors, patients, medications, and prescriptions.
- It provides methods to add, search, and manage these entities.
- Attributes include doctors, patients, medications, and prescriptions
- This class includes many different methods, getters and setters such as:
  1. addPatient(Patient patient)
  2. addDoctor(Doctor doctor)
  3. addMedication(Medication medication)
  4. getPatient()
  5. getDoctors()
  6. getMedications()
  7. search(String name)
  8. findDoctor(String name)
  9. findPatient(String name)
  10. findMedication(String name)
  11. getMedicationByName(String name)
  12. addPrescription(String doctorName, String patientName, String medicationName)
  13. checkExpiredMedications()
  14. printPrescriptionsByDoctor(String doctorName)
  15. restockMedication( String name, int quantity)
  16. generateReport()
 
  - This class encapsulates the core functionality of the pharmacy managment system and provides methods to manage and interact with the various entities within this system.
 
#### PharmacyMenu.java
- This class provides the user with an interface for interacting with the medication tracking system. It uses a menu to allow users to perform various operations on the system
- This class enters a loop to display the menu for the user and handle the user choices
- Some methods the user can interact with are:
  1. addNewPatient(Scanner scanner, MedicationtrackingSystem system)
  2. deletePatient(Scanner scanner, MedicationtrackingSystem system)
  3. editPatient(Scanner scanner, MedicationtrackingSystem system)
  4. addNewDoctor(Scanner scanner, MedicationtrackingSystem system)
  5. addNewMedication(Scanner scanner, MedicationtrackingSystem system)
  6. searchRecords(Scanner scanner, MedicationtrackingSystem system)
  7. acceptPrescription(Scanner scanner, MedicationtrackingSystem system)
  8. assignPatientToDoctor(Scanner scanner, MedicationtrackingSystem system)

  - These are just some examples of the methods the user can interact with on the menu, the full list can be found within the file.
 
# Getting Started
1. Move to the GitHub repo home page containg the Java files for this project, then click the green "code" button and download the repo as a zip file.
2. Extract the zip file somewhere you can access it easily (desktop, doccuments, etc..).
3. Using your IDE of choice (VScode for example), open the folder you just extracted which contains all the required project files.
4. Review the files if needed, but your main focus should be on the PharmacyMenu.java file
5. If you are using VScode, navigate to the menu file and click the play button on the top right of the VScode window.
6. This will then run the program for you and display a menu with 17 different choices for you to make
7. From there, make your choice depending on what you want to do in the system (EX. enter 1 to add a patient, 2 to delete a patient)
 




