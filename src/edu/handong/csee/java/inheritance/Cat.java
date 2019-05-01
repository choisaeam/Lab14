package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
    	Animal dog = new Animal(); //polymorphism
    	dog.testInstanceMethod();
    	dog = new Dog();
    	dog.testInstanceMethod();//overriding
    	
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myCat.testClassMethod();
        Animal.testClassMethod();//hiding
        myAnimal.testInstanceMethod();
    }
}
