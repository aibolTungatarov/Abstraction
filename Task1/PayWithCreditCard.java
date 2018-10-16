package Task1;

public class PayWithCreditCard implements PayProperty{
    public void pay(int cash){
        System.out.println("Paying " + cash + " by CreditCard");
    }
    public boolean verification(String email, String password, String typedEmail, String typedPassword){
        return typedEmail.equals(email) & typedPassword.equals(password);
    }
}
