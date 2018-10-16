package Task1;

import java.util.*;

public class Task1
{
    // variables
    private static int toPay = 0;
    private static PayProperty payProperty;
    private static Scanner sc = new Scanner(System.in);
    private static boolean stop = false;
    private static Map<Integer,String>  items  = new TreeMap<>();
    private static Map<Integer,Integer> prices = new TreeMap<>();;
    // /variables end

    //main method
    public static void main(String[] args)
    {
        // filling dictionaries
        items.put(1,"Mother Board");
        prices.put(1,143);

        items.put(2,"Cpu");
        prices.put(2,203);

        items.put(3,"HDD");
        prices.put(3,310);

        items.put(4,"Memory");
        prices.put(4,450);
        // /filling dictionaries end

        menu(); //menu to buy items

    }
    // /main method end

    //methods
    private static void continueOrNot(String needToStop){
        needToStop = needToStop.toLowerCase();
        while(!needToStop.equals("y") || !needToStop.equals("n")){
            if(needToStop.equals("n"))
            {
                payProperty = paymentMethod();
                boolean correct = false;
                while(!correct){
                    System.out.println("Enter the users email: ");

                    String typedEmail = sc.next();

                    System.out.println("Enter the users password: ");

                    String typedPassword = sc.next();
                    String userPassword = "1234";
                    String userEmail = "aibol@gmail.com";
                    boolean verified = payProperty.verification(typedEmail,typedPassword, userEmail, userPassword);
                    if(verified){
                        System.out.println("Payment has been successful");
                        payProperty.pay(toPay);
                        correct = true;
                    }
                    else{
                        System.out.println("password or email incorrect");
                        System.out.println();
                    }
                }
                stop = true;
                break;
            }
            else if(needToStop.equals("y")){
                break;
            }
            System.out.println("Enter y or n: ");
            needToStop = sc.next();
        }
    }
    private static int chooseItem(){
        int choosedItem = sc.nextInt();
        while(!items.containsKey(choosedItem)){
            System.out.println("There is no such item, try again:(Just enter index of item:) ");
            choosedItem = sc.nextInt();
        }
        return choosedItem;
    }
    private static PayProperty paymentMethod(){
        System.out.println("Select payment method(by default it would be cash): ");
        System.out.println("1 - PayPal");
        System.out.println("2 - Cash");
        System.out.println("3 - CreditCard");
        int payMethod = sc.nextInt();
        if(payMethod == 1){
            payProperty = new PayWithPayPal();
        }
        else if(payMethod == 2){
            payProperty = new PayWithCash();
        }
        else if(payMethod == 3){
            payProperty = new PayWithCreditCard();
        }
        else {
            payProperty = new PayWithCash();
        }
        return payProperty;
    }

    private static void showListOfItems(){
        for (Object o : items.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            System.out.println(pair.getKey() + " - " + pair.getValue() + " - $" + prices.get(pair.getKey()));
        }
    }
    private static void menu(){
        while(!stop) // wont stop while buyer don't wanna
        {
            System.out.println("Please, select a product:");
            showListOfItems();
            int choosedItem = chooseItem(); // choosed Item Number
            System.out.print("Count: ");
            int countOfChoosed = sc.nextInt(); // number of items that choosed
            toPay += prices.get(choosedItem)*countOfChoosed;
            System.out.println();
            System.out.print("Do u wish to continue selecting products? y/n: ");
            System.out.println();
            String needToStop = sc.next();
            continueOrNot(needToStop);


        }

    }
    // /methods end
}
