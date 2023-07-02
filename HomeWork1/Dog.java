package HomeWork1;
/**
 * класс собака;
 */
public class Dog extends Pet {

    /**
     * Наследованный от Pet конструктор c 4 параметрами
     *
     * @param name
     * @param color
     * @param old
     * @param weight
     */
    public Dog(String name, String color, int old, double weight) {
        super(name, color, old, weight);
        this.portion = 3;
        numberDog++;
    }

    /**
     * Наследованный от Pet конструктор c 3 параметрами
     *
     * @param name
     * @param color
     * @param old
     */

    public Dog(String name, String color, int old) {
        this(name, color, old, -1);
    }

    /**
     * Наследованный от Pet конструктор c 2 параметрами
     *
     * @param name
     * @param color
     */

    public Dog(String name, String color) {
        this(name, color, -1);
    }

    /**
     * Наследованный от Pet конструктор c 1 параметром
     *
     * @param name
     */

    public Dog(String name) {
        this(name, "not defained");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Статическое поле "Количество собак"
     */
    private static int numberDog = 0;
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Геттер "количество собак"
     */
    public static int getNumberDog() {
        return numberDog;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Имплементированный метод "Подать голос"
     */
    @Override
    public String getVoice() {
        return "Gav-gav";
    }

    /**
     * Имплементированный метод "Играть"
     */
    @Override
    public String getPlay() {
        return "Dog plays a lot";
    }

    /**
     * Имплементированный метод "Двигаться"
     */
    @Override
    public String getMoving() {
        return "45 km/h";
    }
    /**
     * Имплементированный метод "Кушать"
     */
    @Override
    protected double getEat(double eat) {
        double difference = eat - portion;
        if (difference == 0) {
            System.out.println("ID-" + this.ID + "(" + this.getName() + ")" + ": I'm full\n");
        } else if (difference > 0) {
            System.out.printf("ID-" + this.ID + "(" + this.getName() + ")" + ": I ate too much, there are still %f of food left\n", difference);
        } else {
            System.out.printf("ID-" + this.ID + "(" + this.getName() + ")" + ": I'm hungry, I need another %s kilograms of food\n", Math.abs(difference));
        }
        return difference;
    }


}

