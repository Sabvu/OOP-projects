package SparshaDabadi;

/**
 * .
 *
 * @author (Sparsha Dabadi)
 * @version (question1)
 */

//main class
public class BankCard 
{
    //variable declaration 

    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;

    //constructor
    public BankCard (int cardId,String issuerBank,String bankAccount,
    int balanceAmount){
        this.cardId = cardId;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
        this.clientName="";
    }
    //accessor method(getter method)
    public int getCardId()
    {
        return this.cardId;

    }

    public String getIssuerBank()
    {
        return this.issuerBank;

    }

    public String getBankAccount()
    {
        return this.bankAccount;
    }

    public String getClientName()
    {
        return this.clientName;
    }

    public int getBalanceAmount()
    {
        return this.balanceAmount;
    }
    //accessor method(setter method)
    public void setBalanceAmount( int balanceAmount)
    {
        this.balanceAmount =  balanceAmount ;
    }

    public void setClientName( String clientName)
    {
        this.clientName = clientName;
    }
    //display
    public void display()
    {
        System.out.println("The id number of the client is: " + this.cardId);
        if( clientName == "")
        {
            System.out.println("The required detail is not found");
        }
        else
        {
            System.out.println("The name of the client is: " + this.clientName);
        }
        System.out.println("The name of the issuerbank is:" + this.issuerBank);
        System.out.println("The bank account of the client is: " + this.bankAccount);
        System.out.println("The balance amount in the account of the client is: " + this.balanceAmount);
    }

}


  
        
    

