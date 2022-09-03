public class Plymorphism {
    // method overloading
    int a, b;

    void sum(int a, int b) {
        System.out.println("Plymorphism-> " + a + b);
        System.out.println("Plymorphism-> " + this);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Plymorphism sum = new Plymorphism();
        sum.sum(1, 2);
        sum.sum(1, 2, 3);

        A a = new A();
        a.sum(1, 3);
    }
}

// overrding
class A extends Plymorphism {
    void sum(int a, int b) {
        System.out.println("A -> " + a + b);
    }
}