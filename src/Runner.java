import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        fillTheList(list);
        System.out.println(list.element()); //возвращает первый элемент
        list.removeFirst(); //ремувит первый элемент
        System.out.println(list.element());
        list.remove(0); // удаление по индексу
        System.out.println(list.get(5)); // получение по индексу
        //сравниваем скорость работы при добавление в начало списка
        printTimeInMs(new ArrayList());
        printTimeInMs(new LinkedList());


    }

    public static void printTimeInMs(List list) {
        Date currentTime = new Date();
        insert100Thousands(list);
        Date newTime = new Date();
        long delay = newTime.getTime() - currentTime.getTime();
        System.out.println("Добавление в начало выполнено за " + delay);
    }


    public static void fillTheList(LinkedList<Integer> a) {
        for(int i = 1; i < 50; i++) {
           if(i % 2 == 0) {
               a.addLast(i);
           }
           else a.addFirst(i);
        }
    }

    public static void insert100Thousands(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }

    }


}
