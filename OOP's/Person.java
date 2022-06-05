public class Person {
    public static void main(String[] args) {
        Factory p1 = new Factory();
        Factory p2 = new Factory();
        Factory p3 = new Factory();
        Factory p4 = new Factory();
        Factory p5 = new Factory();
    }
};

class Factory {
    public static int count = 1;

    Factory() {
        if (count <= 5) {
            System.out.println("Person " + count + " is created");
        }
        count++;
    };
};