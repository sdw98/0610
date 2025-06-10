class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;

    }

    void hello() {
        System.out.println("hello " + name + " "+ age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("h662", 20);

        person.hello();

    }
}