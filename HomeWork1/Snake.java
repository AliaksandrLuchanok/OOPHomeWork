package HomeWork1;

public class Snake extends Dog{
    /**
     * Наследованный от Pet конструктор c 4 параметрами
     * @param name
     * @param color
     * @param old
     * @param weight
     */
    public Snake(String name, String color, int old, double weight) {
        super(name, color, old, weight);
        this.portion = 0.5;
        numberSnake++;
    }
    /**
     * Наследованный от Pet конструктор c 3 параметрами
     * @param name
     * @param color
     * @param old
     */

    public Snake(String name, String color, int old) {
        this(name, color, old,-1);
    }
    /**
     * Наследованный от Pet конструктор c 2 параметрами
     * @param name
     * @param color
     */

    public Snake(String name, String color) {
        this(name, color,-1);
    }
    /**
     * Наследованный от Pet конструктор c 1 параметром
     * @param name
     */

    public Snake(String name) {
        this(name,"not defained");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Статическое поле "Количество змей" */
    private static int numberSnake = 0;
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Геттер "количество змей" */
    public static int getNumberSnake() { return numberSnake; }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Имплементированный метод "Подать голос" */
    @Override
    public String getVoice() {
        return "Sh-sh-sh-sh";
    }
    /** Имплементированный метод "Играть" */
    @Override
    public String getPlay() {
        return "Snake plays a not lot";
    }
    /**
     * Имплементированный метод "Двигаться"
     */
    @Override
    public String getMoving() {
        return "5 km/h";
    }

}
