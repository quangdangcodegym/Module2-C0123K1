package abstract_interface.animal_fruit;

public class Chicken extends Animal implements Edible{
    @Override
    public void makeSound() {
        System.out.println("Ò ó o");
    }

    @Override
    public void howtoEat() {
        System.out.println("Luộc rồi chấm muối tiêu");
    }
}
