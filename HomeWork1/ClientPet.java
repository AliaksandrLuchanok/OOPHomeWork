package HomeWork1;

import java.util.ArrayList;

public class ClientPet {
    public static void main(String[] args) {
        ArrayList<Pet> pet = new ArrayList<>();
        Dog dog = new Dog("Barbos");
        Dog dog1 = new Dog("Sharic");
        Cat cat = new Cat("Murka","gray");
        Snake snake = new Snake("Mamba","green", 5);
        Bird bird = new Bird("Musiya","blue",16,0.15);
        Bird bird1 = new Bird("Kuzya");
        pet.add(bird);
        pet.add(dog);
        pet.add(dog1);
        pet.add(cat);
        pet.add(bird1);
        pet.add(snake);
        System.out.println("ANIMALS");
        for (int i = 0; i < pet.size(); i++) {
            System.out.println(pet.get(i));
        }
        System.out.println();
        System.out.println("ACTIONS");
        for (int i = 0; i < pet.size(); i++) {
            System.out.printf("%S - %S - %S\n", pet.get(i).getVoice(), pet.get(i).getPlay(), pet.get(i).getMoving());
        }
        System.out.println();
        System.out.println("FEED THE ANIMALS");
        for (int i = 0; i < pet.size(); i++) {
            pet.get(i).getEat(2);
        }

    }
}
