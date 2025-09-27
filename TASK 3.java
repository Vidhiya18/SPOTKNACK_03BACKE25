//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // using for loop 
        for (int i = 1; i <= 5; i++)//Number of rows in the triangle
        {
            for (int j=1; j<=i; j++) //Number of columns in the triangle
            {
                System.out.print("*");//To print the StarPattern in the triangle
            }
            // print a newline after each row
            System.out.println();
        }
    }
}


