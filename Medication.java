import java.time.LocalDate;
/**
 *  The medication class represents a medication in the system.
 *  It also includes attributes and methods to manage medication details
 */
public class Medication{
    // Attributes
    private String id;
    private String name;
    private double dose;
    private int stockQuantity;
    private LocalDate expiryDate;

    /**
     * Constructs a new medication with the specified details
     * 
     * @param id                Unique ID for the medication
     * @param name              Name of medication
     * @param dose              Dosage of medication
     * @param stockQuantity     Stock quantity of medication
     * @param expiryDate        Expiry date of medication
     */
    public Medication(String id, String name, double dose, int stockQuantity, LocalDate expiryDate){
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.stockQuantity = stockQuantity;
        this.expiryDate = expiryDate;
    }

    // Getters and Setters
    /**
     * 
     * @return the ID of the medication
     */
    public String getID(){
        return id;
    }

    /**
     * 
     * @param id sets the id of the medication
     */
    public void setID(String id){
        this.id = id;
    }

    /**
     * 
     * @return the name of the medication
     */
    public String getName(){
        return name;
    }

    /**
     * 
     * @param name sets the name of the medication
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 
     * @return the dosage of the medication
     */
    public double getDose(){
        return dose;
    }

    /**
     * 
     * @param dose set the dosage of the medication
     */
    public void setDose(double dose){
        this.dose = dose;
    }

    /**
     * 
     * @return the stock quantity of the medication
     */
    public int getStockQuantity(){
        return stockQuantity;
    }

    /**
     * 
     * @param stockQuantity set the stock quantity of the medication
     */
    public void setStockQuantity(int stockQuantity){
        this.stockQuantity = stockQuantity;
    }

    /**
     * 
     * @return the expiry date of the medication
     */
    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    /**
     * 
     * @param expiryDate set the expiry date of the medication
     */
    public void setExpiryDate(LocalDate expiryDate){    
        this.expiryDate = expiryDate;
    }

    public String toString(){
        return  "Medication [ID =" + id + ", Name =" + name + ", Dose =" + dose + "Stock Quantity =" + stockQuantity + "Expiry Date =" + expiryDate + "]";
    }
}
