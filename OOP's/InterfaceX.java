public class InterfaceX implements x {
    public static void main(String[] args) {
        InterfaceX ix = new InterfaceX();
        ix.show();
        ix.a();
    }

    @Override
    public void show() {
        System.out.println("public abstract void show()");
    }
}

interface x {
    int x = 10;

    public abstract void show();

    default void a() {
        System.out.println("default void a()");
    }

    public static void b() {
        System.out.println("public static void b()");
    }

    private void c() {
        System.out.println("private void c()" + x);
    }
}
