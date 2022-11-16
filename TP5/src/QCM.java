import java.util.Scanner;


//\\------------------------------------- Question -------------------------------------
class Question{
    private String[] qu; //question + answers
    private int correct; //index of the answer

    public Question(String[] in,int correct){
        this.qu = in;
        this.correct = correct;
    }

    public boolean isValidQu(){
        if(correct==0 || correct>=qu.length){return false;}
        return true;
    }

    //------------------------------------- Interaction -----------------------------------
    public boolean isRight(int answer){
        if(answer==correct){return true;}
        return false;
    }

    //------------------------------------- Affichage -------------------------------------
    public void printAll(){
        System.out.println("• "+qu[0]+" :");
        for(int i=1;i<qu.length;i++){
            System.out.println("    "+i+"- "+qu[i]);
        }
        System.out.println();
    }

    public void print_correct_answer(){
        System.out.println(qu[correct+1]); //+1 to account for the question in index 0
    }
}




//\\------------------------------------- QCM -------------------------------------
public class QCM {

    //v.0
    //private String[] questions; // store for each index (meaning question) both the number of answers (as a string)
    // and the answers themselves alongside the question (always in the 0th spot).
    //private int[] correct_answers; // store the number of the correct answer at the index of the corresponding question.
    //private int nbqu;


    private int nbqu =0;
    private Question[] QA;

    public QCM(int len){
        Scanner sc = new Scanner(System.in);
        Utils enter = new Utils();
        for(int i=0;i<len;i++){
            addQ(sc.nextLine(),Utils.enterPositiveInt(10)); // FIND A WAY TO INPUT PROPERLY THE String[] NEEDED
        }
    }

    public void addQ(String[] question,int correct){
        Question qu = new Question(question,correct);
        QA[nbqu] = qu;
        nbqu++;
    }


    public boolean isValid(){
        for(Question qu : QA){
            if(!qu.isValidQu()){return false;}
        }
        return true;
    }

    //------------------------------------- Affichage -------------------------------------
    public void printQCM(){
        for(Question qu : QA){qu.printAll();}
    }

    //------------------------------------- Interaction -------------------------------------

    public boolean Answer(int nbquestion,int answer) {
        return QA[nbquestion].isRight(answer);
    }





//\\------------------------------------- Main -------------------------------------
    public static void main(String[] args){
        QCM qcm = new QCM(4);
        System.out.println(qcm.isValid());
        qcm.printQCM();
    }


}
