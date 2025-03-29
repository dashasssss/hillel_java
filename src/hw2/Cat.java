package hw2;

class Cat extends Animal {

    static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;

    Cat (String name) {
        super(name);
        catCount++;
    }

    @Override
    void sound() {
        System.out.println("Мяу мяу");
    }

    @Override
    void run(int rDistance) {
        if (rDistance > MAX_RUN_DISTANCE) {
            System.out.println(name + " can't run more than " + MAX_RUN_DISTANCE + " meters.");
        } else {
            super.run(rDistance);
        }
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " can't swim!");
    }
}
