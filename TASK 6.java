import java.util.Arrays;
public class Main {
    /**
     * It calculates the average of studMarks and sorts the number in ascending order
     * By using split() method splitting the names and marks
     * @param args
     */
    public static void main(String[]args) {
        String StudName="Vidhiya=75;Priya=85;Kaviya=90";
        String[]students=StudName.split(";");
        //Using split() method to split the names and marks
        for(String StudName1 : students){
            System.out.println(StudName1);
        }
        for(String StudName1 : students){
            String[] students2=StudName1.split("=");
            System.out.println(students2[0]);
            System.out.println(students2[1]);
        }
        // to print the average for studMarks
        int[]studMarks={75,90,85};
        int sum=0;
        for(int num:studMarks){
            sum+=num;
        }
        double average= (double) sum/studMarks.length;
        {
            System.out.println("Average mark:" + average);
        }
        //Sorting the studMarks in ascending order
        Arrays.sort(studMarks);
        {
            System.out.println("Sorted number(ascending):" + Arrays.toString(studMarks));
        }
    }
}

