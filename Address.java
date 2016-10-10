
/**
 *
 * @author Nick Bock
 */
class Address {
    String addressLine1 = null;
    String addressLine2 = null;
    String city = null;
    String state = null;
    int zip = 0;
    
    public Address(String aLine1, String aLine2, String city, String state, int zip)
    {
        addressLine1 = aLine1;
        addressLine2 = aLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public void setAddressLine1(String aLine1)
    {
        this.addressLine1 = aLine1;
    }
    
    public void setAddressLine2(String aLine2)
    {
        this.addressLine2 = aLine2;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public void setZip(int zip)
    {
        this.zip = zip;
    }
    
    public String getAddressLine1()
    {
        return addressLine1;
    }
    
    public String getAddressLine2()
    {
        return addressLine2;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getState()
    {
        return state;
    }
    
    public int getZip()
    {
        return zip;
    }
}
