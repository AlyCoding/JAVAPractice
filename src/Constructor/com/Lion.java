package Constructor.com;

public class Lion {

    public static void main(String[] args) {
     /*   Animal lion = new Animal();
        System.out.println(lion.animalName);
        System.out.println(lion.animalFur);*/

        Animal lion2 = new Animal ("Simba", 4, "Dark Yellow", "Male", 120);
        System.out.println(lion2.animalName);


        Animal dog = new Animal ("Rex", 5, "Brown", "Male", 54);
        Animal eagle = new Animal ("Rosie", 7, "Brown", "Female", 45);

        System.out.println(eagle.animalName);
    }

}
