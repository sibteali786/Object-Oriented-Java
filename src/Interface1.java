interface AnimalInterface{
    public void makeSound();
}

class DogImplementation implements AnimalInterface {
    public void makeSound(){
        System.out.println("Bowwww");
    }
}