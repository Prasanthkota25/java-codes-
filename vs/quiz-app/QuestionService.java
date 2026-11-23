import java.util.Scanner;

public class QuestionService {

    Question[] question = new Question[5];

    String[] selection = new String[5];

    public QuestionService() {

        question[0] = new Question(1, "Size of Int ", "2", "6", "4", "8", "4");
        question[1] = new Question(2, "Size of Double ", "2", "6", "4", "8", "8");
        question[2] = new Question(3, "Size of Float ", "2", "6", "4", "8", "2");
        question[3] = new Question(4, "Size of char", "2", "6", "4", "8", "8");
        question[4] = new Question(5, "Size of boolean", "1", "4", "1", "8", "1");
    }

public void playquiz()
{

    int i=0;
for(Question q: question)
{
    System.out.println("Questions no:"+q.getId());
        System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
                System.out.println(q.getOpt2());
                    System.out.println(q.getOpt3());
                        System.out.println(q.getOpt4());
                    
                        Scanner sc = new Scanner(System.in);
                     selection[i] = sc.nextLine();
                     i++;
}


for(String s: selection)
{
    System.out.println(s);


}
}

public void printscore()
{
    int score=0;
    for(int i=0;i<question.length;i++)
        {

        Question q = question[i];
        String actualanswer = q.getAnswer();

        String  userAnswer = selection[i];


        if(actualanswer.equals(userAnswer))
        {
            score++;
        }
    }
 System.out.println("Your score is:"+score);


}
}
