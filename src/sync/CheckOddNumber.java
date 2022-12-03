package sync;

public class CheckOddNumber implements Callback{

    @Override
    public Boolean check(Integer number) {
        return number % 2 == 0;
    }
}
