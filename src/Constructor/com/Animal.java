package Constructor.com;

public class Animal {
    public String animalName;
    public String animalFur;
    public String animalType;
    public double animalWeight;
    public boolean animalCanFly;
    public int animalAge;



 /*  public Animal(){
        name = "Lion";
        age = 3;
        fur = "Yellow";
        weight = 150;
        canFly = true;*/


   /* public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println(lion.name);
        System.out.println(lion.weight);

    }*/

    public Animal (String name, int age, String fur, String type, double weight){
        animalName = name;
        animalAge = age;
        animalFur = fur;
        animalType = type;
        animalWeight = weight;
    }
}
