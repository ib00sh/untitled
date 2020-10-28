package OverTimHW;

public class multiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread A = new MyThread("Alpha",5);
        MyThread B = new MyThread("Beta",3);
        MyThread C = new MyThread("Charlie",7);

        for (int i = 1; i <=4; i++) {
            System.out.println("Сообщение от главного потока:\t " + i);
            Thread.sleep(2000);
        }
        if(A.isAlive()){
            A.join();
        }
        if(B.isAlive()){
            B.join();
        }
        if(C.isAlive()){
            C.join();
        }
        System.out.println("Главный поток завершен");
    }
}
