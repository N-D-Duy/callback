package async;

public class Me {
    void setAI(AI ai) {
        ai.notifyMe();
    }
    void haveLunch(){
        System.out.println("yummy");
    }

    public static void main(String[] args) {
        AI githubAI = new GithubAI();
        Me duy = new Me();
        duy.setAI(githubAI);
        duy.haveLunch();
    }
}
