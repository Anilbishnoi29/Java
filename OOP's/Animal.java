public class Animal {

    public void eat(Animal an) {
        System.out.println(an);
    }

    public void run() {
        eat(this);
    }

    public static void main(String args[]) {
        Animal buzo = new Animal();
        buzo.eat(buzo);
        buzo.run();
    }
}

// public class Animal {
// String name;
// int age;

// Animal(String name, int age) {
// this.name = name;
// this.age = age;
// }

// public void eat() {
// System.out.println(this.name + " is eating. and " + this.age + " years old");
// System.out.println(this);
// }

// public void run() {
// System.out.println(this.name + " is running. and " + this.age + " years
// old");
// }

// public static void main(String args[]) {
// Animal buzo = new Animal("Buzo", 3);
// buzo.eat();
// // buzo.run();
// }
// }
