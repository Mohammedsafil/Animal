package Animal;

public class main {
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
        a = new Cow();
        a.sound();
    }
}

class Animal{
    public void sound(){
        System.out.println("This animal makes sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("This dog barks");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("This cat meows");
    }
}

class Cow extends Animal{
    public void sound(){
        System.out.println("This cow moos");
    }
}
