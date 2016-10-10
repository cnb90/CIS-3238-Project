
/**
 *
 * @author Nick Bock
 */
public class Customer {
    private String firstName = null;
    private String lastName = null;
    private Address address = null;
    private String phone;
    private String email = null;
    
    public Customer(String f, String l, Address a, String p, String e)
    {
        firstName = f;
        lastName = l;
        address = a;
        phone = p;
        email = e;
    }
    
    public Customer(String f, String l)
    {
        firstName = f;
        lastName = l;
    }
    
    public void setFirstName(String s)
    {
        firstName = s;
    }
    
    public void setLastName(String s)
    {
        lastName = s;
    }
    
    public void setAddress(Address a)
    {
        address = a;
    }
    
    public void setPhoneNumber(String p)
    {
        phone = p;
    }
    
    public void setEmail(String s)
    {
        email = s;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getFirstLast()
    {
        return firstName + " " + lastName;
    }
    
    public String getLastFirst()
    {
        return lastName + ", " + firstName;
    }
    
    public Address getAddress()
    {
        return address;
    }
    
    public String getPhoneNumer()
    {
        return phone;
    }
    
    public String getEmail()
    {
        return email;
    }
}
