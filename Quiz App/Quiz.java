import java.util.*;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
        loadQuestions();
    }

    private void loadQuestions() {
        questions.add(new Question("What is the capital of France?", "A",
                "A. Paris", "B. London", "C. Berlin", "D. Madrid"));
        questions.add(new Question("What is 5 + 3?", "C",
                "A. 6", "B. 7", "C. 8", "D. 9"));
        questions.add(new Question("Which planet is known as the Red Planet?", "B",
                "A. Earth", "B. Mars", "C. Jupiter", "D. Saturn"));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", "C",
                "A. Charles Dickens", "B. J.K. Rowling", "C. William Shakespeare", "D. Mark Twain"));
        questions.add(new Question("What is the largest ocean on Earth?", "A",
                "A. Pacific Ocean", "B. Atlantic Ocean", "C. Indian Ocean", "D. Arctic Ocean"));
        questions.add(new Question("What is the square root of 64?", "C",
                "A. 6", "B. 7", "C. 8", "D. 9"));
        questions.add(new Question("Who painted the Mona Lisa?", "B",
                "A. Vincent van Gogh", "B. Leonardo da Vinci", "C. Pablo Picasso", "D. Claude Monet"));
        questions.add(new Question("What is the chemical symbol for water?", "A",
                "A. H2O", "B. CO2", "C. O2", "D. NaCl"));
        questions.add(new Question("Which country is known as the Land of the Rising Sun?", "D",
                "A. India", "B. China", "C. South Korea", "D. Japan"));
        questions.add(new Question("How many continents are there on Earth?", "B",
                "A. 5", "B. 7", "C. 6", "D. 8"));
        questions.add(new Question("What is the powerhouse of the cell?", "C",
                "A. Nucleus", "B. Ribosome", "C. Mitochondria", "D. Golgi Apparatus"));
        questions.add(new Question("What is the freezing point of water in Celsius?", "A",
                "A. 0", "B. 32", "C. 100", "D. -273"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");
        System.out.println("--------------------\n");

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            System.out.println(question.getOptions());
            System.out.print("Your answer: ");

            String userAnswer = scanner.nextLine().trim().toUpperCase();
            if (userAnswer.equals(question.getCorrectAnswer())) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + question.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("Quiz finished!");
        System.out.println("Your final score is: " + score + "/" + questions.size());

        scanner.close();
    }
}