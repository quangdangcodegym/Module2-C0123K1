package abstract_interface.animal_fruit;

public class Tiger extends Animal implements Edible{
    @Override
    public void makeSound() {
        System.out.println("Gừ gừ gừ");
    }

    @Override
    public void howtoEat() {
        System.out.println("Không thể ăn vì là động vật quý hiếm");
    }
}
