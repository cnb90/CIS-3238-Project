
/**
 *
 * @author Nick Bock
 */
public class Product {
    private String name = null;
    private String description = null;
    private double price = 0;
    private double cost = 0;
    private int quantity = 0;
    
    public Product(String name, String description, double price, double cost, int quantity)
    {
        if(name != null)
            this.name = name;
        if(description != null)
            this.description = description;
        if(price > 0)
            this.price = price;
        if(cost <= 0)
            this.cost = price / 2;
        else
            this.cost = cost;
        if(quantity > 0)
            this.quantity = quantity;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public void decreaseQuantity()
    {
        quantity--;
    }
    
    public void increaseQuantity()
    {
        quantity++;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}
