package Sync;

public class SyncThreadDemo {
    public static void main(String[] args) {
        int n = 100, count = 10, time = 1000, dt = 200;
        MyNumber obj = new MyNumber();
        obj.number = n;
        MyThreaed Alpha = new MyThreaed("Alpha ", obj, time + dt , count, true);
        MyThreaed Bravo = new MyThreaed("Bravo ", obj, time - dt, count , false);

        try{
            if(Alpha.isAlive()) Alpha.join();
            if(Bravo.isAlive()) Bravo.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
