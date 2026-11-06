public class Question {
    
    private int id ;
    private String question;
    private String OptA;
    private String OptB;
    private String OptC;
    private String OptD;
    private String answer;



    
    public Question(int id, String question, String optA, String optB, String optC, String optD, String answer) {
        this.id = id;
        this.question = question;
        OptA = optA;
        OptB = optB;
        OptC = optC;
        OptD = optD;
        this.answer = answer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOptA() {
        return OptA;
    }
    public void setOptA(String optA) {
        OptA = optA;
    }
    public String getOptB() {
        return OptB;
    }
    public void setOptB(String optB) {
        OptB = optB;
    }
    public String getOptC() {
        return OptC;
    }
    public void setOptC(String optC) {
        OptC = optC;
    }
    public String getOptD() {
        return OptD;
    }
    public void setOptD(String optD) {
        OptD = optD;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", OptA=" + OptA + ", OptB=" + OptB + ", OptC=" + OptC
                + ", OptD=" + OptD + ", answer=" + answer + "]";
    }

    

}
