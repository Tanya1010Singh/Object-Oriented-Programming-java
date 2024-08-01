import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean checkAnswer(String answer) {
        return correctAnswer.equals(answer);
    }
}

class Comprehension {
    private List<Question> questions;

    public Comprehension() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            System.out.print("Answer: ");
            String answer = in.nextLine();
            if (question.checkAnswer(answer)) {
                System.out.println("Score: 2/2");
            } else {
                System.out.println("Score: 0/2");
            }
        }
    }
}

class Compre {
    private List<Comprehension> comprehensions;

    public Compre() {
        comprehensions = new ArrayList<>();
        setupComprehensions();
    }

    private void setupComprehensions() {
        Comprehension animalsComprehension = new Comprehension();
        animalsComprehension.addQuestion(new Question("Question 1: What is the name of deer in the island?", "The name of the Deer was KOKO."));
        animalsComprehension.addQuestion(new Question("Question 2: What was he doing over there?", "He was drinking water over there."));
        animalsComprehension.addQuestion(new Question("Question 3: With whom did he use to live?", "He use to live with his mother and little brother."));
        animalsComprehension.addQuestion(new Question("Question 4: He ran faster than whom?", "he ran so fast than the Tiger."));
        comprehensions.add(animalsComprehension);
        Comprehension boatComprehension = new Comprehension();
        boatComprehension.addQuestion(new Question("Question 1: What were the names of the two kids in the story?", "Sam and Lily."));
        boatComprehension.addQuestion(new Question("Question 2: Where did Sam and Lily decide to explore on a sunny Saturday?", "They decided to explore the old, mysterious forest at the edge of their town."));
        boatComprehension.addQuestion(new Question("Question 3: What did people in town say about the forest?", "People in town said the forest was enchanted."));
        boatComprehension.addQuestion(new Question("Question 4: What did Sam and Lily hear and see as they walked deeper into the forest?", "They heard birds singing and saw squirrels playing in the trees."));
        comprehensions.add(boatComprehension);

        
    }

    public void menu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a valid option:");
            System.out.println("1. Animals");
            System.out.println("2. Boat");
            System.out.println("3. Forest");
            System.out.println("4. Exit");

            int opt = in.nextInt();
            in.nextLine();  // Consume the newline character
            if (opt >= 1 && opt <= comprehensions.size()) {
                comprehensions.get(opt - 1).start();
            } else if (opt == 4) {
                in.close();
                return;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

public class comp_solver {
    public static void main(String[] args) {
        Compre c1 = new Compre();
        c1.menu();
    }
}
