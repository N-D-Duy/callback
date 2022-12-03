package sync;

public class Caller {
    public void hienThi(int a[], Callback callback){
        for(int i = 0; i < 10; ++i){
            if(callback.check(i)){
                System.out.print(i + " ");
            }
        }
    }
}
