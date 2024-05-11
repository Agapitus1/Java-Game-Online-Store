import java.util.Scanner;
public class PlayzStore
{
    private Customer customers[] = new Customer[5];//0-4
    private Game games[] = new Game[10];//0-9
    private final String STORE_NAME = "Punten Store";
    private double discounts[] = new double[7];//0-6

    public PlayzStore()
    {
        /*customerOne = new Customer("Lontong", "Homeless", "Homeless.Lontong@gmail.com", "21-12-2012", 100.00, "");
        gameOne = new Game(19.99, true, "Pri Payer", "KNTG", "FPS", "LOW");
        gameTwo = new Game(99.99, false, "Cabcay", "MKNN", "RPG", "HIGH");

        customerOne.purchase(gameOne);
        customerOne.purchase(gameTwo);
         */
        
        setupCustomers();
        setupGames();
        setupDiscounts();
        openStore();
    }

    private void setupDiscounts()
    {
        
        discounts[0] = 10;
        discounts[1] = 20;
        discounts[2] = 30;
        discounts[3] = 40;
        discounts[4] = 50;
        discounts[5] = 60;
        discounts[6] = 70;
        
    }


    private void setupCustomers()
    {
        customers[0] = new Customer("Lontong", "Homeless", "Homeless.Lontong@gmail.com", "21-12-2002", 100.00, "");//What values are needed?
        customers[1] = new Customer("Ketupat", "Homeless", "Homeless.Lontong@gmail.com", "30-10-2020", 300.00, "");
        customers[2] = new Customer("Lemper", "Homeless", "Homeless.Lontong@gmail.com", "5-1-2003", 50.00, "");
        customers[3] = new Customer("Arem", "Homeless", "Homeless.Lontong@gmail.com", "16-8-2012", 20.00, "");
        customers[4] = new Customer("Ketan", "Homeless", "Homeless.Lontong@gmail.com", "29-3-2010", 1000.00, "");
        // Continue for all 5 customers
    }

    private void setupGames()
    {
        games[0] = new Game(619.99, true, "Pri Payer", "KNTG", "FPS", "LOW");
        games[1] = new Game(219.99, true, "Poebgy", "KNTG", "FPS", "LOW");
        games[2] = new Game(419.99, true, "Peace Craft", "KNTG", "FPS", "LOW");
        games[3] = new Game(129.99, true, "Bui Buayer", "KNTG", "FPS", "LOW");
        games[4] = new Game(19.99, true, "Getey", "KNTG", "FPS", "LOW");
        games[5] = new Game(9.99, true, "Gregorr", "KNTG", "FPS", "LOW");
        games[6] = new Game(859.99, true, "Dakon", "KNTG", "FPS", "LOW");
        games[7] = new Game(349.99, true, "Setin", "KNTG", "FPS", "LOW");
        games[8] = new Game(559.99, true, "Sengklek", "KNTG", "FPS", "LOW");
        games[9] = new Game(559.99, true, "Chatyur", "KNTG", "FPS", "LOW");
    }

    public void openStore()
    {
        System.out.println(STORE_NAME + " is open for business");
        for(int i=0;i<games.length;i++)
        {
            System.out.println((i+1) + ". " + games[i].getName());
        }
        
        System.out.print("You get " + discounts[1] + "% discount!");
        int num = getGameNumber()-1;
        

        if ( num >= 0 && num <= 9 )
        {
            customers[4].purchase(games[num], discounts[1]);
        }
        else
            System.out.println("Error: invalid number selected!");
        
    }

    public int getGameNumber()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter the game number you wish to purchase");
        int number = in.nextInt();
        return number -1;
    }

}