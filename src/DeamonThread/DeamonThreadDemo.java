package DeamonThread;

import static javax.swing.JOptionPane.*;

public class DeamonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // Создание объекта для дочернего потока. Первый
        // аргумент конструктора является лямбда-выражением,
        // второй аргумент –– название потока
        Thread t = new Thread(()->{
            int k = 1, s = 0;
            while(true){
                System.out.println(Thread.currentThread().getName() + ": " + s);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                    s += k;
                    k++;
                }
            }, "Вычисление суммы");
            // Статус демонт-потока
        t.setDaemon(true);
        // Переменная для записи результата
        // выбора пользователя (нажатая кнопка)
        int res;
        // Запуск потока на выполнение:
        t.start();
        // Отображение диалогового окна:
        do{
            // Задержка в выполнении потока:
            Thread.sleep(3000);
            // Отображение окна запоминание
            // выбор пользователя:
            res = showConfirmDialog(null,
                    // Текст в окне
                    "Закончить вычисление суммы?",
                    // Название окна:
                    "Сумма чисел",
                    // Кнопки в окне:
                    YES_NO_OPTION);
        } while (res != YES_OPTION);
    }
}
