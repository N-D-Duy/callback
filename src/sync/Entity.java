package sync;

public class Entity {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Callback checkEvenNumber = new CheckEvenNumber();
        Callback checkOddNumber = new CheckOddNumber();
        new Caller().hienThi(a, checkOddNumber);
        System.out.println();
        new Caller().hienThi(a, checkEvenNumber);
    }
}
