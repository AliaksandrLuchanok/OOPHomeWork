package HomeWork1;

public class Bird extends Dog{
    /**
     * Наследованный от Pet конструктор c 4 параметрами
     * @param name
     * @param color
     * @param old
     * @param weight
     */
    public Bird(String name, String color, int old, double weight) {
        super(name, color, old, weight);
        this.portion = 0.15;
        numberBird++;
    }
    /**
     * Наследованный от Pet конструктор c 3 параметрами
     * @param name
     * @param color
     * @param old
     */

    public Bird(String name, String color, int old) {
        this(name, color, old,-1);
    }
    /**
     * Наследованный от Pet конструктор c 2 параметрами
     * @param name
     * @param color
     */
    public Bird(String name, String color) {
        this(name, color,-1);
    }
    /**
     * Наследованный от Pet конструктор c 1 параметром
     * @param name
     */
    public Bird(String name) {
        this(name, "not defained");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Статическое поле "Количество птиц" */
    private static int numberBird = 0;
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Геттер "количество птиц" */
    public static int getNumberBird() { return numberBird; }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Имплементированный метод "Подать голос" */
    @Override
    public String getVoice() {
        return "Chick-chirick))";
    }
    /** Имплементированный метод "Играть" */
    @Override
    public String getPlay() {
        return "Bird plays a small";
    }
    /**
     * Имплементированный метод "Двигаться"
     */
    @Override
    public String getMoving() {
        return "55 km/h";
    }
}

