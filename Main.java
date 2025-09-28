import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * To print the valid even number
         * until the user enter the valid even number the loop will comtiously work to get the number
         * @param args
         */
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){// Using while loop
            System.out.println("Enter the Even number:");// To print the even number
            num = sc.nextInt();
            if(num%2==0)//using if else condition
            {
                System.out.println(num + "You entered the correct even number");//Printing the correct even number
                break;
            } else {
                System.out.println("Please enter the valid even number");//Printing the valid even number
            }
        }
    }
}






