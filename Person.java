/**
 * the Person class represents a generic person in the system.
 * It includes attributes and methods that are common to both patients and doctors.
 */

public class Person {
    // Attributes
    private String id;
    private String name;
    private int age;
    private String phoneNumber;

    // Constructors
    /**
     * Constructs a new person with the following specificed details
     * @param id                Unique identifier for each person
     * @param name              The name of the person
     * @param age               Age of the person
     * @param phoneNumber       Phone number for the person
     */

    public Person (String id, String name, int age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters & Setters
    /**
     * 
     * @return the ID of the person
     */

    public String getID() {
        return id;
    }

    /**
     * 
     * @param id sets the ID of the person
     */

    public void setID(String id) {
        this.id = id;
    }

    /**
     * 
     * @return the name of a person
     */

    public String getName() {
        return name;
    }

    /**
     * 
     * @param name sets the name of the person
     */

    public void setName (String name) {
        this.name = name;
    }

    /**
     * 
     * @return the age of the person
     */

    public int getAge() {
        return age;
    }

    /**
     * 
     * @param age sets the age of the person
     */

    public void setAge (int age) {
        this.age = age;
    }

    /**
     * 
     * @return the phone number of the person
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber sets the phone number for the person
     */
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person [ID =" + id + ", Name =" + name + ", Age =" + age + ", Phone Number =" + phoneNumber + "]";
    }

}
