import java.util.Scanner;
class TimeBomb extends Thread {
    public void run() { // using function
        try {
            for(int i = 10; i >= 0; i--) {
                System.out.println("Bomb exploding in " + i + " seconds...");
                Thread.sleep(1000);
            }
            System.out.println("BOOM! The bomb exploded.");
        }
        catch(Exception e) {
            System.out.println("Bomb stopped.");// Using Exception handling
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password to defuse the bomb:");
        String password = sc.nextLine();
        if(password.equals("1234")) { // Using if else conditional statement
            System.out.println("Bomb Defused!");
        }
        else {
            TimeBomb bomb = new TimeBomb();
            bomb.start();
        }
        sc.close();
    }
}
