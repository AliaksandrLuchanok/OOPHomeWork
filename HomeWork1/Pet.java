package HomeWork1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Родительский класс "Домашнее животное"
 */
public abstract class Pet {
    /** Имя животного"  */
    protected String name;
    /** Цвет животного" */
    protected String color;
    /** Возраст животного" */
    protected int old;
    /** Вес животного"  */
    protected double weight;
    /** ID домашнего животного"  */
    protected int ID;
    /** Рацион потребляемой пищи  */
    protected double portion;
    /** Количество всех животных" */
    private static int numberAnimals = 0;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Геттер "имя животного" */
    public String getName() {
        return name;
    }
    /** Геттер "цвет животного" */
    public String getColor() {
        return color;
    }
    /** Геттер "возраст животного" */
    public int getOld() {
        return old;
    }
    /** Геттер "вес животного" */
    public double getWeight() { return weight; }
    /** Геттер "количество питомцев" */
    public static int getNumberAnimals() { return numberAnimals; }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Сеттер "имя животного" */
    public void setName(String name) { this.name = name; }
    /** Cеттер "цвет животного" */
    public void setColor(String color) { this.color = color; }
    /** Cеттер "возраст животного" */
    public void setOld(int old) { this.old = old; }
    /** Cеттер "вес животного" */
    public void setWeight(double weight) { this.weight = weight; }

    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Конструктор с 4 параметрами и ID
     * @param name
     * @param color
     * @param old
     * @param weight
     */
    protected Pet(String name,String color, int old, double weight) {
        numberAnimals++;
        this.ID = numberAnimals;
        this.name = name;
        this.color = color;
        this.old = old;
        this.weight = weight;

    }
    /**
     * Перегруженный конструктор с 3 параметрами и ID
     * @param name
     * @param color
     * @param old
     */
    protected Pet(String name,String color, int old) {
        this(name,color,old,-1);
    }
    /**
     * Перегруженный конструктор с 2 параметрами и ID
     * @param name
     * @param color
     */
    protected Pet(String name,String color) {
        this(name,color,-1,-1);
    }
    /**
     * Перегруженный конструктор с 1 параметром и ID
     * @param name
     */
    protected Pet(String name) {
        this(name,"not defained",-1,-1);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Перегруженный метод toString
     * @return
     */
    @Override
    public String toString() {
        return "Pet{" +
                this.getClass().getName().toString() +
                " ID = " + ID +
                ", name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                ", old = " + old +
                ", weight = " + weight +
                '}';
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Метод "Подать голос" */
    public abstract String getVoice();
    /** Метод "Играть" */
    public abstract String getPlay();
    /** Метод "Двигаться" */
    public abstract String getMoving();
    /** Метод "Кушать"
     * возвращает количество лишней (недостающей) пищи
     */
    protected abstract double getEat(double eat);
    }

