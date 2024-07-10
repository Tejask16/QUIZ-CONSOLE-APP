import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selections[] = new String[5];    

    public QuestionService() {
        questions[0] = new Question(1, "Size of int", "1", "2", "3", "4", "2");
        questions[1] = new Question(1, "Size of double", "1", "2", "3", "4", "4");
        questions[2] = new Question(1, "Size of char", "1", "2", "3", "4", "1");
        questions[3] = new Question(1, "Size of long", "1", "2", "8", "4", "8");
        questions[4] = new Question(1, "Size of bool", "1", "2", "3", "4", "1");

    }




    public void playQuiz(){

        int i = 0;
        for(Question q : questions){
            System.out.println("Question No. - " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            i++;
        } 

        System.out.println("------------------------");
        for(String s : selections){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;

        for(int i=0; i<questions.length; i++){
            Question q = questions[i];
            String answer = q.getAnswer();
            String userAnswer = selections[i];
            if(answer.equals(userAnswer)){
                score++;
            }
        }

        System.out.println("Your score is : " + score);
    }
}
