package hw2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String type;
        while (true){
            System.out.println("Do you want a dog, a cat, or just an animal? ");
            Scanner scanner = new Scanner(System.in);
            type = scanner.nextLine().trim().toLowerCase();

            if (type.equals("dog") || type.equals("cat") || type.equals("animal")) {
                break;
            }
            System.out.println("Invalid input. Please enter 'dog', 'cat', or 'animal'.");
        }

        System.out.println( type);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the animal's name: ");
        String name = scanner.nextLine().trim();

        Animal animal;
        if(type.equals("dog")){
            animal = new Dog(name);
        } if(type.equals("cat")){
            animal = new Cat(name);
        } if(type.equals("animal")){
            animal = new Animal(name);
        }

        System.out.println();
    }
}
