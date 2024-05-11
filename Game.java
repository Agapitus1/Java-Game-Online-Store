public class Game
{
    private double price;
    private boolean isAvailable;
    private String name, code, type, rating;

    public Game(double thePrice, boolean theIsAvailable, String theName, String theCode, String theType, String theRating)
    {
        price = thePrice;
        isAvailable = theIsAvailable;
        name = theName;
        code = theCode;
        type = theType;
        rating = theRating;
    }

    //Accessor
    public boolean getIsAvailable()
    {
        return isAvailable;
    }

    public double getPrice()
    {
        return price;
    }
    
    public String getName()
    {
        return name;
    }

    //Mutators
    public void setIsAvailable(boolean theIsAv)
    {
        isAvailable = theIsAv;
    }

    public void setPrice(double thePrice)
    {
        price = thePrice;
    }
    
    
}