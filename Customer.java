public class Customer
{
    private String name,address, email, dateOfBirth;
    private double credit;
    private String myGame;

    public Customer(String theName, String theAddress, String theEmail, String theDateOfBirth, double theCredit, String theMyGame)
    {
        name = theName;
        address = theAddress;
        email = theEmail;
        dateOfBirth = theDateOfBirth;
        credit = theCredit;
        myGame = theMyGame;
    }

    /*Accessor
     */
    public String getName()
    {
        return name;
    }

    public double getCredit()
    {
        return credit;
    }

    //Mutators
    public void setEmail(String theEmail)
    {
        email = theEmail;
    }

    //PSEUDOCODE 
    public void purchase(Game theGame, double discount)
    {
        //Check the credit & availability
        double price = theGame.getPrice();
        if(credit >= price)
        {
            if(theGame.getIsAvailable() == true)
            {
                //poceed
                System.out.println("Purchase Succesful!");
                //become unav
                theGame.setIsAvailable(false);
                //subtract
                credit = credit - price;
                
                myGame = theGame.getName();
                System.out.println(myGame + " is owned!");

            }
            else
            {
                System.out.println("Game not available! Come back tomorrow!");
            }
        }
        else
        {
            System.out.println("Credit insufficient! Please insert more credit!");
        }

    }

}