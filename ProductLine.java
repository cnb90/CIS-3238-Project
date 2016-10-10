
/**
 *
 * @author Nick Bock
 */
class ProductLine {
    private Product product = null;
    private int quantity;
    
    public ProductLine(Product p, int qty)
    {
        product = p;
        quantity = qty;
    }
    
    public ProductLine(Product p)
    {
        product = p;
        quantity = 1;
    }
    
    public Product getProduct()
    {
        return product;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}
