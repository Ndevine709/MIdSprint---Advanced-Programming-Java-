
import java.time.LocalDate;

public class Medication{
    // Attributes
    private String id;
    private String name;
    private double dose;
    private int stockQuantity;
    private LocalDate expiryDate;

    public Medication(String id, String name, double dose, int stockQuantity, LocalDate expiryDate){
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.stockQuantity = stockQuantity;
        this.expiryDate = expiryDate;
    }

    public Medication(){
    }

    // Getters and Setters

    public String getID(String id){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }
    
    public String getName(String name){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDose(){
        return dose;
    }

    public void setDose(double dose){
        this.dose = dose;
    }

    public int getStockQuantity(){
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity){
        this.stockQuantity = stockQuantity;
    }

    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate){    
        this.expiryDate = expiryDate;
    }


    public String toString(){
        return  "Medication [ID =" + id + ", Name =" + name + ", Dose =" + dose + "Stock Quantity =" + stockQuantity + "Expiry Date =" + expiryDate + "]";
    }
}
