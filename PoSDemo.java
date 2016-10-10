
import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Bock
 */
public class PoSDemo {
    public static void main(String [] args)
    {
        Customer c = new Customer("Abraham", "Lincoln");
        Address a = new Address("1600 Pennsylvania Ave NW", null, "Washington", "DC", 20500);
        c.setAddress(a);
        c.setEmail("honestabe@whitehouse.gov");
        c.setPhoneNumber("12345678901");
        
        System.out.println("The customer's full name is " + c.getFirstLast() + " and he lives in " + c.getAddress().getCity() + ", " + c.getAddress().getState() + ".");
        
        Product p = new Product("ACME Box", "Cardboard box, 48 x 48 x 48 inches", 4.99, 1.25, 19);
        System.out.println("Quantity of " + p.getName() + " in stock: " + p.getQuantity());
        NumberFormat numFormat = NumberFormat.getCurrencyInstance();
        System.out.println("This represents " + numFormat.format(p.getQuantity() * p.getPrice()) + " in total stock at retail value");
    }
}
