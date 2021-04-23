package animal;
/**
 *Конструкторы базовых класс
 * Сначала выполняется родительский класс потом дочерние
 * Если в базовом конструкторе есть параметры тогда дочерные класса не может быть дефаултовые конструкторы
 * super всегда должен стоять первым
 */
public class Animal {
    String brain;
    String hearth;
    Animal(String brain,String hearth){  // Animal
        this.brain = brain; // мозг
        this.hearth = hearth; // сердце
        System.out.println("This is " + brain);
        System.out.println("This is " + hearth);
    }

    public static void main(String[] args) {
        new Cat("brain","hearth","tail");

    }
}
class Cat extends Animal{
    String tail; // не у каждого животного есть хвост и поэтому создал хвост внутри класса Cat
    Cat(String brain,String hearth, String tail){
        super(brain,hearth);
        this.tail = tail;
        System.out.println("This is " + tail);
    }
}
