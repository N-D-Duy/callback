package async;

public class Event{
    boolean haveABug = (new Computer().getRandom() & 1) == 0;
}
