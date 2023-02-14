package SparshaDabadi;

/**
 * .
 *
 * @author (Sparsha Dabadi)
 * @version (question2)
 */
//subclass
public class DebitCard extends BankCard
{
    // variable declaration and initialization
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    // constructor
    public DebitCard( int balanceAmount, int cardId, String bankAccount, 
    String issuerBank, String clientName, int pinNumber){
        super(cardId,issuerBank,bankAccount,balanceAmount);      //accessing to superclass
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }

    //accessor method(getter method)
    public int getPinNumber()
    {
        return this.pinNumber;
    }

    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;

    }

    public boolean gethasWithdrawal()
    {
        return this.hasWithdrawn;
    }
    //accessor method(setter method)
    public void setWithdrawalAmount( int withDrawal)
    {
        this.withdrawalAmount = withDrawal;

    }
    //withdraw method
    public void withdraw( int withdrawalAmount, int pinNumber,String dateOfWithdrawal)
    {
        if( this.pinNumber == pinNumber && withdrawalAmount <= super.getBalanceAmount() )
        {

            this.setWithdrawalAmount(withdrawalAmount);
            this.setBalanceAmount(super.getBalanceAmount()-withdrawalAmount);
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
            System.out.println("The transaction has been successful. Your new balance amount is: " + this.getBalanceAmount());

        }
        else
        {
            System.out.println("The transaction cannot be carried out.UNSUCCESSFUL.");

        }
    }
    //display
    public void displayDebitCard()
    {
        if(this.hasWithdrawn == false)
        {
            System.out.println("The balance amount is: " + this.getBalanceAmount());
        }
        else{
            super.display();
            System.out.println("The pin number is: " + this.pinNumber);
            System.out.println("The withdrawal amount is: " + this.withdrawalAmount);
            System.out.println("The date of withdrawal is: " + this.dateOfWithdrawal);

        }
    }
}

