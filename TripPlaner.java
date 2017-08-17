/** 
 * <h1>EDX: Microsoft: DEV276x Learn to Program in Java.</h1>
 * <h2>Module 1: Java Basics.</h2>
 * <h3>Project: Trip Planner.</h3>
 * <p>
 *  Program that asks the user for some information about
 *  an international trip and based on that information to
 *  do some conversions, using the correct data types, to 
 *  plan a trip.
 *  </p>
 * @author  Ignacio Aular, https://www.facebook.com/estudiandomas/, ignacio_345@hotmail.com
 * @version 1.0, 08/15/17
 */
 
import java.util.Scanner;

public class TripPlaner 
{
    // instance variables
    private String travellerName;
    private String travellerDestination;
    private int    travellingDays;
    private double moneyToSpend;
    private String currencySymbol;
    private double exchangeRates;
    private int    daysToHours;
    private int    daysToMinutes;
    private double moneySpendedPerDay;
    private double timeDifferenceInHours;
    private double squareAreaOfDestination;
    
    
    // constants
    private static final double SQ_MI = 0.3861; // Conversion base to square miles
    private static final double NOON = 12.0;
    
    
    // Objects
    Scanner input = new Scanner(System.in);  // object to read data from the keyboard
    static TripPlaner tp = new TripPlaner(); // object to call methods or play with they
    
    
    // the action start here :)
    public static void main(String[] args) 
    {
        greetingUser();        // Part 1
        travelTimeAndBudget(); // Part 2 
        timeDifference();      // Part 3
        countryArea();         // Part 4
    } 
    //////////////////////////////////////
    
    
    ////////////////////// starting getters and setters methods //////////////////    
    /**
     * @return the travellerName
     */
    public String getTravellerName()
    {
        return travellerName;
    }

    /**
     * @param travellerName the travellerName to set
     */
    public void setTravellerName(String travellerName)
    {
        this.travellerName = travellerName;
    }

    /**
     * @return the travellerDestination
     */
    public String getTravellerDestination()
    {
        return travellerDestination;
    }

    /**
     * @param travellerDestination the travellerDestination to set
     */
    public void setTravellerDestination(String travellerDestination)
    {
        this.travellerDestination = travellerDestination;
    }

    /**
     * @return the travellingDays
     */
    public int getTravellingDays()
    {
        return travellingDays;
    }

    /**
     * @param travellingDays the travellingDays to set
     */
    public void setTravellingDays(int travellingDays)
    {
        this.travellingDays = travellingDays;
    }

    /**
     * @return the moneyToSpend
     */
    public double getMoneyToSpend()
    {
        return moneyToSpend;
    }

    /**
     * @param moneyToSpend the moneyToSpend to set
     */
    public void setMoneyToSpend(double moneyToSpend)
    {
        this.moneyToSpend = moneyToSpend;
    }

    /**
     * @return the currencySymbol
     */
    public String getCurrencySymbol()
    {
        return currencySymbol;
    }

    /**
     * @param currencySymbol the currencySymbol to set
     */
    public void setCurrencySymbol(String currencySymbol)
    {
        this.currencySymbol = currencySymbol;
    }

    /**
     * @return the exchangeRates
     */
    public double getExchangeRates()
    {
        return exchangeRates;
    }

    /**
     * @param exchangeRates the exchangeRates to set
     */
    public void setExchangeRates(double exchangeRates)
    {
        this.exchangeRates = exchangeRates;
    }

    /**
     * @return the daysToHours
     */
    public int getDaysToHours()
    {
        return daysToHours = getTravellingDays() * 24;
    }

    /**
     * @param daysToHours the daysToHours to set
     */
    public void setDaysToHours(int daysToHours)
    {
        this.daysToHours = daysToHours;
    }

    /**
     * @return the daysToMinutes
     */
    public int getDaysToMinutes()
    {
        return daysToMinutes = getDaysToHours() * 60;
    }

    /**
     * @param daysToMinutes the daysToMinutes to set
     */
    public void setDaysToMinutes(int daysToMinutes)
    {
        this.daysToMinutes = daysToMinutes;
    }

    /**
     * @return the moneySpendedPerDay
     */
    public double getMoneySpendedPerDay()
    {
        return moneySpendedPerDay = getMoneyToSpend() / getTravellingDays();
    }

    /**
     * @param moneySpendedPerDay the moneySpendedPerDay to set
     */
    public void setMoneySpendedPerDay(double moneySpendedPerDay)
    {
        this.moneySpendedPerDay = moneySpendedPerDay;
    }

    /**
     * @return the timeDifferenceInHours
     */
    public double getTimeDifferenceInHours()
    {
        return timeDifferenceInHours;
    }

    /**
     * @param timeDifferenceInHours the timeDifferenceInHours to set
     */
    public void setTimeDifferenceInHours(double timeDifferenceInHours)
    {
        this.timeDifferenceInHours = timeDifferenceInHours;
    }

    /**
     * @return the squareAreaOfDestination
     */
    public double getSquareAreaOfDestination()
    {
        return squareAreaOfDestination;
    }

    /**
     * @param squareAreaOfDestination the squareAreaOfDestination to set
     */
    public void setSquareAreaOfDestination(double squareAreaOfDestination)
    {
        this.squareAreaOfDestination = squareAreaOfDestination;
    }
    
    ////////////////////// end of getters and setters methods //////////////////
    
    
    
    // Part 1 ///////////////////////////////////////////////
    /**
     * greet to the user and ask for some data.
     */    
    public static void greetingUser()
    {
        tp.println("Welcome to Vacation Planner!");
        
        tp.print("What is your name? ");
        tp.setTravellerName(tp.readLine());
        
        tp.print("Nice to meet you " + tp.getTravellerName() + ", ");
        
        tp.print("Where are you travelling to? ");
        tp.setTravellerDestination(tp.readLine());
        
        tp.print("Great! " + tp.getTravellerDestination() + " ");
        
        tp.println("sounds like a great trip");
        
        tp.printSeparator();
    } ///////////////////////////////////////////////////////
    
    
    
    // Part 2 //////////////////////////////////////////////
    /**
     * ask the user about how much time and money they 
     * are budgeting for their trip.
     */    
    public static void travelTimeAndBudget()
    {
        tp.print("How many days are you going to spend travelling? ");
        tp.setTravellingDays(Integer.parseInt(tp.readLine()));
         
        tp.print("How much money, in USD, are you planning to spend on your trip? ");
        tp.setMoneyToSpend(Double.parseDouble(tp.readLine()));
         
        tp.print("What is the three letter currency symbol for your travel destination? ");
        tp.setCurrencySymbol(tp.readLine());
        
        tp.print("How many " + tp.getCurrencySymbol() + " are there in 1 USD? ");
        tp.setExchangeRates(Double.parseDouble(tp.readLine()));
        
        tp.println("");
        tp.println("");
        
        tp.print("If you are travelling for " + tp.getTravellingDays() 
                + " days that is the same as " + tp.getDaysToHours() 
                + " hours or " + tp.getDaysToMinutes() + " minutes");
         
        tp.println("");
         
        tp.print("If you are going to spend $" + (int)tp.getMoneyToSpend() 
                + " USD that means per day you can spend up to "                
                + tp.roundTo2Decimals(tp.getMoneySpendedPerDay()) + " USD");
         
        tp.println("");
         
        tp.print("Your total budget in " + tp.getCurrencySymbol() 
                + " is " + tp.roundTo2Decimals(tp.getExchangeRate()) + " " + tp.getCurrencySymbol() 
                + ", which per day is "
                + tp.roundTo2Decimals(tp.getExchangeRate() / tp.getTravellingDays()) + " MXC");
        
        tp.println("");
        
        tp.printSeparator();
    } ///////////////////////////////////////////////////////
    
    
    
    // Part 3 ///////////////////////////////////////////////
    /**
     * ask the user about the time difference between 
     * their home and where they are going.
     */ 
    public static void timeDifference()
    {
        tp.print("What is the time difference, in hours, "
               + "between your home and your destination? ");
        tp.setTimeDifferenceInHours(Double.parseDouble(tp.readLine()));
        
        tp.print("");
        
        tp.print("That means that when it is midnight at home it will be " 
               + tp.getHour() + ":" 
               + tp.getMinutes()  + " in your travel destination");
        
        tp.println("");
        
        tp.println("And when it is noon at home it will be " 
               + tp.getHour2() + ":" + tp.getMinutes());
        
        tp.printSeparator();
    } ///////////////////////////////////////////////////////
    
    
    
    // Part 4 ///////////////////////////////////////////////
    /**
     *  ask the user the area of their travel destination
     *  country in km2 and then to convert that to miles2
     */ 
    public static void countryArea()
    {
        tp.print("What is the square area of your destination country in km2? ");
        tp.setSquareAreaOfDestination(Double.parseDouble(tp.readLine()));
        tp.println("In miles2 that is " + tp.roundTo2Decimals(tp.km2ToMiles2()));
    } ///////////////////////////////////////////////////////
    
    
    
    // Part 5 ///////////////////////////////////////////////
    /**
     * clean up the answers so they each 
     * only have 2 decimal places.
     */
    public double roundTo2Decimals(double n)
    {
        n = n * 100;
        
        n = (int)n;
        
        n = (double)n;
        
        n = n / 100.0;
        
        return n;
    } ////////////////////////////////////////////////////////
    
    
    
    ////////////////////////////// Utilities ;) /////////////////////////////
    
    /**
     * @param message the message to print without new line
     */
    public void print(String message)
    {
        System.out.print(message);
    }
    
    /**
     * @param message the message to print with new line
     */
    public void println(String message)
    {
        System.out.println(message);
    }
    
    /**
     * print with new line
     */
    public void printSeparator()
    {
        println("***********");
        println("");
        println("");
        println("");
    }
    
    /**
     * read with blanck spaces
     */
    public String readLine()
    {
        return input.nextLine();
    }
    
    /**
     * calculate exchange rates
     */
    public double getExchangeRate()
    {
        return getMoneyToSpend() * getExchangeRates();
    }
    
    /**
     * convert km2 to miles2
     */
    public double km2ToMiles2()
    {
        return getSquareAreaOfDestination() * SQ_MI;
    }
    
    /**
     * calculate the hour for midnight
     */
    public int getHour()
    {
        return ((int)(tp.getTimeDifferenceInHours() % 24));
    }
    
    /**
     * calculate the hour for noon
     */
    public int getHour2()
    {
        return (int)(tp.roundTo2Decimals(tp.getTimeDifferenceInHours() + NOON) % 24);
    }
    
    /**
     * show minutes with two ceros when is neccesary
     */
    public String getMinutes()
    {
        int x = (int)(tp.getTimeDifferenceInHours() * 100) % 100;
        
        if ( x == 0 )
        {
            String s = Integer.toString(x);
            s = s + "0";
            
            return s;
        }
                
        return Integer.toString(x);
    }
}
