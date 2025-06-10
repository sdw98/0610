class Person {
    String name; // 필드(클래스의 변수)
    int age;

    public void sayHello() {
        System.out.println("안녕하세요? 저는 " + name + "입니다. 저의 나이는 " + age + "세 입니다. ");
    }

    public void work() {
        System.out.println("일하는중");
    }
}


public class Main {
    public static void main(String[] args) {
        Person person = new Person(); //객체 or  인스턴스

        person.name = "신동원";
        person.age = 28;

        person.sayHello();
        person.work();
    }
}