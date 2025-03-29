package hw2;

class Cat extends Animal {

    static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 5;

    Cat (String name) {
        super(name);
        catCount++;
    }

    @Override
    void sound() {
        System.out.println("Мяу мяу");
    }


}
