package Sync;

public class MyThreaed extends Thread {
    private MyNumber obj;
    private int time;
    private int count;
    private boolean state;

    MyThreaed (String name, MyNumber obj, int time, int count, boolean state){
        super(name);
        this.obj = obj;
        this.time = time;
        this.count = count;
        this.state = state;
        start();
    }

    private void line(){
        char s;
        if (state) s = '-';
        else  s = '*';
        for (int k = 1; k <= 35 ; k++) {
            System.out.print(s);
        }
        System.out.println();
    }

    @Override
    public void run(){
        for (int k = 1; k <= count ; k++) {
            synchronized (obj){
                line();
                System.out.println("Поток " + getName()
                                    + " : исходное значение " + obj.number);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                if (state) obj.number++;
                else obj.number--;
                System.out.println("Поток " + getName()
                        + " : новое значение " + obj.number);
                line();
            }
        }
    }
}
