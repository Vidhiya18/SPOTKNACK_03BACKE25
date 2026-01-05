abstract class questions {
    // using abstract method
    protected String questionsText;
    protected int marks;
// Using constructor to initialize common data
    public questions(String questionsText, int marks) {
        this.questionsText = questionsText;
        this.marks = marks;
    }
    //Creating abstract method to display questions
    public abstract void displayQuestions();
    public abstract boolean checkAnswer(String userAnswer);
    // Getting method for marks
    public int getmarks() {
        return marks;
    }
}
class MCQquestions extends questions{ //child class(MCQ questions) inherits parent class(questions)
    private String[]options;
    private String correctOption;
    //constructor
    public MCQquestions(String q,int m,String[]options,String correct){
        super(q,m);
        this.options=options;
        this.correctOption=correct;
    }
    // Creating method
    public void displayQuestions() {
        System.out.println(questionsText);
        //Using for loop
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) ('A' + i) + "." + options[i]);
        }
    }
    // Check if user answer matches the correct option
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctOption);
    }
}
class TrueFalseQuestion extends questions{ // another child class inherits parent class
    private String correctAnswer;
    //constructor
    public TrueFalseQuestion(String q,int m,String correctAnswer) {
        super(q,m);
        this.correctAnswer = correctAnswer;
    }
    //Displays true or false questions by suing method
    public void displayQuestions() {
        System.out.println(questionsText+"(True/False)");
    }
    //Checks answer
    public boolean checkAnswer(String userAnswer){
        return userAnswer.equalsIgnoreCase(correctAnswer);
        }
        }
public class QuizResult { //  creating QuizResult class demonstrated encapsulation
    private int Score;//private variable to store score
    public void addScore(int marks) { // Creating addScore method to add marks for the score
        Score += marks;
    }
    // Creating method to return final score
    public int getScore() {
        return Score;
    }
}
import java.util.Scanner;
    public class OnlineQuiz { // Creating class
        public static void main(String[] args) { // Main method
            Scanner sc = new Scanner(System.in); // creating Scanner object for user input
            questions[] questions = new questions[3];// Creating array(Polymorphism)
            {
                // creating object by using strings and arrays
                questions[0] = new MCQquestions("java is a?", 5, new String[]{"programming language","Operating System","Browser"}, "A");
                questions[1] = new TrueFalseQuestion("java is a objectoriented programming langugae?", 5, "True");
                questions[2] = new MCQquestions("which keyword is used in java to inherit the class?", 5, new String[]{"this", "extends", "super"}, "B");
                QuizResult quizResult = new QuizResult();// Creating object to store quizResult
                System.out.println("------ONLINE QUIZ-------");
                for (questions q : questions) { //loop through all questions
                    try { // Using Exception handling
                        q.displayQuestions(); //Using method to displayQuestions
                        System.out.println("Enter your choice:");
                        String answer = sc.nextLine();
                        if (q.checkAnswer(answer)) { //  using if else loop
                            System.out.println("Correct");
                            quizResult.addScore(q.getmarks());
                        } else {
                            System.out.println("Wrong answer!");
                        }
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                    }
                }
                System.out.println("Quiz Over!");
                System.out.println("Total Score:" + quizResult.getScore());//Displays total score
                sc.close();// close Scanner
            }
        }
    }



