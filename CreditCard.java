package SparshaDabadi;

/**
 * .
 *
 * @author (Sparsha Dabadi)
 * @version (question3)
 */
//subclass
public class CreditCard extends BankCard
{
    // variable declaration and initialization
    private int cvcNumber;
    private double creditLimit; 
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //constructor
    public CreditCard( int cardId,String clientName, String issuerBank, 
    String bankAccount,int balanceAmount, int cvcNumber, double interestRate,
    String expirationDate )
    {
        super(cardId,issuerBank,bankAccount,balanceAmount);         //accessing to superclass
        super.setClientName(clientName);
        super.setBalanceAmount(balanceAmount);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    //accesor method(getter method)
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }

    public double getCreditLimit()
    {
        return this.creditLimit;
    }

    public double getInterestRate()
    {
        return this.interestRate;
    }

    public String getExpirationDate()
    {
        return this.expirationDate;
    }

    public int getGracePeriod()
    {
        return this.gracePeriod;
    }

    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    //accessor method( setter method)
    public void setCreditLimit( double creditLimit, int gracePeriod)
    {
        if ( creditLimit <= 2.5*super.getBalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        }
        else
        {
            System.out.println( "Credit card cannot be issued.");
        }
    }

    public void cancelCreditCard()
    {

        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;

    }
    //display
    public void displayCreditCard()
    {
        if( this.isGranted == true)
        {
            super.display();
            System.out.println("The credit limit of the client is: " + this.creditLimit);
            System.out.println(" The grace period of the credit card is: " + this.gracePeriod);
        }
        else
        {
            super.display();
        }

    }
}
