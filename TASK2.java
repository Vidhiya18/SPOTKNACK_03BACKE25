//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * this program sum the total price of item and calculates the GST,print total bill
     * @param args
     */
    public static final double GST=0.18;
    public static void main(String[] args)//this is the main method starts here
    {
        double Briyani = 250;//this is a double variable to store briyani
        double Burger = 120;//this is a double variable to store Burger
        double Parotta = 50;//this is a double variable to store Parotta
        double Cheesecake = 150;//this is a double variable to store Cheesecake
        int total_items = 4;//integer variable to store total_item
        double total_price = 570;//double variable to store total_price
        double GST = total_price*0.18;//this is a double variable to calculate GST
        double total_bill=total_price+GST;//this is double variable total_bill
        {
            //to print the values
            System.out.println("Briyani:" + Briyani);
            System.out.println("Burger:" + Burger);
            System.out.println("Parotta:" + Parotta);
            System.out.println("Cheesecake:" + Cheesecake);
            System.out.println("total_items:" + total_items);
            System.out.println("total_price:" + total_price);
            System.out.println("GST:" + GST);
            System.out.println("total_bill:"+total_bill);
        }
    }
}






