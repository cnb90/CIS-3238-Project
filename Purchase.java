
import java.util.ArrayList;

/**
 *
 * @author Nick Bock
 */
class Purchase {
    private Customer customer = null;
    private ArrayList<ProductLine> products;
    
    public Purchase(Customer c)
    {
        customer = c;
        products = new ArrayList<>();
    }
    
    public boolean addToPurchase(Product p, int qty)
    {
        ProductLine line = new ProductLine(p, qty);
        boolean add = products.add(line);
        return add == true;
    }
    

    
}
