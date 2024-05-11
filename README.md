# Java-Game-Online-Store


# Part A – Building a larger online store
In tutorials in week 5 we looked at a software program for an online gaming store.  This week we are adding to that project to incorporate many customers and many games, rather than just a couple.

1. Open the PlayzStore project from Week 5. TAKE A COPY OF THE PROJECT AND SAVE IT AS WEEK 7.
IF (and only if) the purchase() method in the Customer class is not complete in your solution, download the PlayzStore – w5.zip file from Canvas and save to your network drive. Unzip the project – use this project to get you started.  NOTE: If your Week 6 work is complete there is no reason to download this file – your own work is easier to use as it is more familiar to you.

NOW MAKE ALL CODE IN THE CONSTRUCTOR A COMMENT – USE /*  */
THIS MUST BE DONE TO AVOID LOTS OF COMPILE ERRORS WHILE INTRODUCING THE ARRAYS

2. Declare an attribute that is an array of type double called discounts – this will hold the percentage discount for each day of the week. Set the size of the array as 7.

3. Create a new method private void setupDiscounts() that initialises the values in the array to 10, 20, 30 etc. index 0 = 10, index 1 = 20 and so on.

4. Change the PlayzStore class so that it has an array of customers instead of one Customer, and initialises the size of the Customer array to be 5 like this:

private Customer customers[] = new Customer[5];

5. Now change the PlayzStore class so that it has an array of games instead of one Game, and initialises the size of the Game array to be 10.

6. Create a new method private void setupCustomers() that initialises each of the Customer objects, like this:

private void setupCustomers()
{
	customers[0] = new Customer(?);//What values are needed?
	customers[1] = ?
	customers[2] = ?
	// Continue for all 5 customers
}

7. Create a new method private void setupGames() that initialises each of the Game objects.

   

# Part B – Enable customers to choose a game to buy

8. Add a method openStore() to the PlayzStore class that prints a list of games at the store, after printing the name of the store (see picture above). HINT: Use a for loop to print each game name.
for(int i=0; i<?; i++)
{
	System.out.println(?);
}

9. Add a new function getGameNumber() to class PlayzStore that asks the user which game they wish to purchase (see picture above). The user must enter an integer: 0 for the first game, 1 for the second game etc. The function returns this number.
Use this code to get you started:
public int getGameNumber()
{
	Scanner in = ?
	System.out.println(“Please enter the game number: ”);
	int number = ?
	return number;
}
10. Modify the openStore() method so that it calls getGameNumber(). If the number returned is a valid game number (0 to 9), call purchaseGame(Game theGame) in the Customer class for the game entered. If an invalid game number has been entered, display an appropriate error message.
See below for the expected output:

 
