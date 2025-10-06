//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
       To sum all the elements in the main diagonal and printing the sum of the diagonal array
       @param args
     */
    public static void main(String[] args) {
        int[][] array = {{1, 5, 8}, {3, 9, 10}, {3, 6, 2}};//Using 2D dimensional array
        int sum = array[0][0] + array[1][1] + array[2][2];// Sum all elements in the diagonal of the array
        System.out.print("The Sum of the 2D Array is:" + sum);//Printing the sum of diagonal array
    }
}



