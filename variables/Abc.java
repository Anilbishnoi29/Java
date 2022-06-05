class Abc {
    public int a;
    public static int b;

    Abc(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        int c = 5;
        System.out.println("Local " + c);
        Abc obj = new Abc(10); // create obj and set instance variable
        Abc.b = 99; // set static variable
        System.out.println("Instance : " + obj.a);
        System.out.println("static : " + Abc.b);

    }
};