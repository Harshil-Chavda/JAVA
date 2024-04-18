import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOption;

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int option) {
        return option == correctOption;
    }
}

class Quiz {
    private List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

class User {
    private String name;
    private int score;

    public User(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        score++;
    }
}

public class CarQuiz {
    public static void main(String[] args) {
        // Create some sample questions about cars
        Question question1 = new Question("Which car manufacturer produces the Mustang?",
                List.of("A. Ford", "B. Chevrolet", "C. Dodge", "D. Toyota"), 1);
        Question question2 = new Question("Which car brand is known for the '911' sports car model?",
                List.of("A. Mercedes-Benz", "B. Audi", "C. Porsche", "D. BMW"), 3);
        Question question3 = new Question("Which car feature allows the vehicle to stop safely during emergencies?",
                List.of("A. ABS (Anti-lock Braking System)", "B. ESP (Electronic Stability Program)",
                        "C. Cruise Control", "D. Airbags"), 0);

        // Create a quiz and add questions
        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        // Create a user
        User user = new User("Car Enthusiast");

        // Start the quiz
        startQuiz(quiz, user);
    }

    public static void startQuiz(Quiz quiz, User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Car Quiz!");
        System.out.println("User: " + user.getName());

        int questionNumber = 1;
        for (Question question : quiz.getQuestions()) {
            System.out.println("\nQuestion " + questionNumber + ": " + question.getQuestionText());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }

            System.out.print("Your answer (enter option number): ");
            int userChoice = scanner.nextInt();

            if (question.isCorrect(userChoice - 1)) {
                System.out.println("Correct!");
                user.increaseScore();
            } else {
                System.out.println("Incorrect!");
            }

            questionNumber++;
        }

        System.out.println("\nQuiz completed! Your score: " + user.getScore() + "/" + quiz.getQuestions().size());
    }
}
