package sync;

public class CheckEvenNumber implements Callback{
    @Override
    public Boolean check(Integer number) {
        return number % 2 == 1;
    }
}
