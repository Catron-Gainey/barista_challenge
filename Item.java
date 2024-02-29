public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item (String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // GETTERS & SETTERS  - for name and price
    //getters
    public String getItemName() {
        return name;}
    public double getItemPrice(){
        return price;}
    //setter
    public void setName(String givenName) {
        this.name = givenName;}
    public void setPrice(double givenPrice) {
        this.price = givenPrice;}
    }
