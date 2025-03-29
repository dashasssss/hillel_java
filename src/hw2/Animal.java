package hw2;

class Animal {

    String name;
    static int animalCount = 0;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    Animal(String name) {
        this.name = name;
        animalCount++;
    }

    void sound() {
        System.out.println("Тварина видає звук");
    }

    void run (int rDistance) {
        System.out.println("Тварина" + name + "прибігла" + rDistance + "метрів");
    }

    void swim (int sDistance) {
        System.out.println("Тварина" + name + "проплила" + sDistance + "метрів");
    }

}
