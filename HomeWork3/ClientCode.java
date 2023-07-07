package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*Создать класс Контейнер - Container.
В контейнере могут быть ящики (класс Box).

У каждого ящика есть вес.
У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.

Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.

Container c = new Container(...);
// ...
for (Box box: c) {
box - это контейнер
}

* */
public class ClientCode {
    public static void main(String[] args) {
        // Box box1 = new Box(86);
        // box1.setWeight(1555);
        Container container1 = new Container("ChinaContainar");
        container1.addBox(new Box(66));
        container1.addBox(new Box(44));
        container1.addBox(new Box(33));
        container1.addBox(new Box(77));
        // container1.addBox(box1);
//        System.out.println(container1);
        Container container2 = new Container("UsaContainar");
        container2.addBox(new Box(322));
        container2.addBox(new Box(876));
//        System.out.println(container2);
        Container container3 = new Container("RussiaContainar");
        container3.addBox(new Box(564));
        container3.addBox(new Box(251));
        container3.addBox(new Box(465));
//        System.out.println(container3);
        List<Container> containers = new ArrayList<>();
        containers.add(container1);
        containers.add(container2);
        containers.add(container3);
        for (Container container: containers) {
            System.out.println(container);
        }
        System.out.println("СРАВНИВАНИЕ КОНТЕЙНЕРОВ ЧЕРЕЗ ContainerCountComparator (по числу коробок):");
        containers.sort(new ContainerCountComparator()); // через экземпляр класса ContainerCountComparator сравнивание по числу Box
        for (Container container: containers) {
            System.out.println(container); }
        System.out.println("СРАВНИВАНИЕ КОНТЕЙНЕРОВ ЧЕРЕЗ Comparable класса Container (по общему весу контейнеров):");
        Collections.sort(containers); // через экземпляр класса контейнер сравнивание по весу
//        containers.sort((o1, o2) -> Integer.compare(o1.getWeight(),o2.getWeight())); //сокращенная форма сортировки контейнеров по весу
//        containers.sort((o1, o2) -> Integer.compare(o1.getNumberBox(),o2.getNumberBox())); //сокращенная форма сортировки контейнеров по количеству ящиков
        for (Container container: containers) {
            System.out.println(container);
        }

        }

    }
