package HomeWork1;

public class Cat extends Dog {
    /**
     * Наследованный от Pet конструктор c 4 параметрами
     *
     * @param name
     * @param color
     * @param old
     * @param weight
     */
    public Cat(String name, String color, int old, double weight) {
        super(name, color, old, weight);
        this.portion = 1.5;
        numberCat++;
    }

    /**
     * Наследованный от Pet конструктор c 3 параметрами
     *
     * @param name
     * @param color
     * @param old
     */

    public Cat(String name, String color, int old) {
        this(name, color, old, -1);
    }

    /**
     * Наследованный от Pet конструктор c 2 параметрами
     *
     * @param name
     * @param color
     */

    public Cat(String name, String color) {
        this(name, color, -1);
    }

    /**
     * Наследованный от Pet конструктор c 1 параметром
     *
     * @param name
     */
    public Cat(String name) {
        this(name, "not defained");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Статическое поле "Количество котов"
     */
    private static int numberCat = 0;
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Геттер "количество котов"
     */
    public static int getNumberCat() {
        return numberCat;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Имплементированный метод "Подать голос"
     */
    @Override
    public String getVoice() {
        return "Myau-myau";
    }

    /**
     * Имплементированный метод "Играть"
     */
    @Override
    public String getPlay() {
        return "Cat plays a lot";
    }

    /**
     * Имплементированный метод "Двигаться"
     */
    @Override
    public String getMoving() {
        return "15 km/h";
    }

}
