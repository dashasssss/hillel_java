package hw2;

class Dog extends Animal {

    static int dogCount = 0;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    void sound() {
        System.out.println("Гав гав");
    }

    @Override
    void swim(int sDistance) {
        if (sDistance > MAX_RUN_DISTANCE) {
            System.out.println(name + " can't run more than " + MAX_RUN_DISTANCE + " meters.");
        } else {
            super.run(sDistance);
        }
    }

    @Override
    void run(int rDistance) {
        if (rDistance > MAX_RUN_DISTANCE) {
            System.out.println(name + " can't run more than " + MAX_RUN_DISTANCE + " meters.");
        } else {
            super.run(rDistance);
        }
    }
}
