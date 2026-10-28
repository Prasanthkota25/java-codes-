import java.util.Scanner;

public class QuestionService {

  Question[] question = new Question[5];

  String selection[] = new String[5];

  public QuestionService() {
    question[0] = new Question(1, "what is the OOP's full form ?", "Object", "Object-Oriented Programming",
        "Object-Oriented ", "Oriented Programming", "B");
    question[1] = new Question(2, "what is the JVM full form ?", "Object", "Object-Oriented Programming",
        "Java Runtime Environment ", "Java Virtual Machine", "D");
    question[2] = new Question(3, "what is the JDK full form ?", "Object", "Java Development Kit", "Object-Oriented ",
        "Java Runtime Environment", "B");
    question[3] = new Question(4, "what is the JRE full form ?", "Java Runtime Environment",
        "Object-Oriented Programming", "Object-Oriented ", " Programming lang", "A");
    question[4] = new Question(5, "what is java ?", "WORA", "Oriented Programming", "Object-Oriented ", "Oriented",
        "A");

  }

  public void playQuiz() {

    int i = 0;
    for (Question q : question) {
      System.out.println("Question Number :" + q.getId());
      System.out.println(q.getQuestion());
      System.out.println("A. " + q.getOptA());
      System.out.println("B. " + q.getOptB());
      System.out.println("C. " + q.getOptC());
      System.out.println("D. " + q.getOptD());

      Scanner sc = new Scanner(System.in);
      selection[i] = sc.nextLine().toUpperCase();
      i++;
    }
    for (String s : selection) {
      System.out.println(s);
    }
  }

  public void PrintScore() {
    int score = 0;

    for (int i = 0; i < question.length; i++) {

      Question que = question[i];
      String actualAnswer = que.getAnswer();
      String UserAnswer = selection[i];

      if (actualAnswer.equals(UserAnswer)) {
        score++;
      }
    }
    System.out.println("Your Score is : " + score);
  }

}