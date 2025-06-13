import java.util.Scanner;

public class Class_object_basic {
    int x, y;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for x: ");
        x = sc.nextInt();
        System.out.print("Enter value for y: ");
        y = sc.nextInt();
    }

    void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    void add(Class_object_basic obj1, Class_object_basic obj2) {
        x = obj1.x + obj2.x;
        y = obj1.y + obj2.y;
    }

    public static void main(String[] args) {
        Class_object_basic ob1 = new Class_object_basic();
        Class_object_basic ob2 = new Class_object_basic();
        Class_object_basic ob3 = new Class_object_basic();

        ob1.input();
        ob1.display();

        ob2.input();
        ob2.display();

        ob3.add(ob1, ob2);
        System.out.println("Sum:");
        ob3.display();
    }
}