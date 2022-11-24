package pruebatecnica_ob;

/**
 *
 * @author Moth
 */
public class Product {

    private int id;
    private String description;
    private int amount;

    //Constructor for the product
    public Product(int id, String description, int amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    //Getters & Setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
   //ToString method
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description + ", amount=" + amount + '}';
    }

}
