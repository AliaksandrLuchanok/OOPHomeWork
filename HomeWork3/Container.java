package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Box>, Comparable<Container>{

    private List<Box> container;
    private int index;

    private String nameContainer;


    public Container(String nameContainer) {
        container = new ArrayList<Box>();
        index = 0;
        this.nameContainer = nameContainer;
    }
    public void addBox(Box use){
            container.add(use);
    }

    @Override
    public Iterator<Box> iterator() {
        Iterator<Box> iter = new Iterator<Box>() {
            private int indexIter = 0;
            @Override
            public boolean hasNext() {
                return indexIter < container.size();
            }

            @Override
            public Box next() {
                return container.get(indexIter++);
            }
        };
        return iter;

    }

    @Override
    public int compareTo(Container o) {
//        if (this.getWeight() > o.getWeight()) {
//            return 1;
//        } else if (this.getWeight() < o.getWeight()) {
//            return -1;
//        } else {return 0;}
        return Integer.compare(this.getWeight(),o.getWeight());
    }

    public Integer getWeight(){
        int Sum = 0;
        for (Box box: container) {
            Sum += box.getWeight();
        }
        return Sum;
    }
    public Integer getNumberBox() {
        return container.size();
    }
    @Override
    public String toString() {
        for (Box item : container) {
            System.out.println(item);
        }
        return String.format("Container %s: boxes is %d weight is %d\n", this.getNameContainer(),
                                        this.getNumberBox(), this.getWeight());
    }

    public String getNameContainer() {
        return nameContainer;
    }
}

