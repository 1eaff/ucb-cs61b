public class Dog {

    int size;
    String name;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        if (size < 10) {
            System.out.println("yipyipyip!");
        } else if (size < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woof. woof.");
        }
    }
}
