package async;

public class GithubAI implements AI{
    @Override
    public void notifyMe() {
        if(new Event().haveABug){
            System.out.println("ah sh*t, have a bug, come back now");
        }
    }
}
