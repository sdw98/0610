class Car {
    String name;
    String brand;
    int year;

    public void displayInfo() {
        System.out.println(
                "이 차는 브랜드가 " + brand + "고 " +
                "연식은 " + year + "년식인 " + name + "입니다.");
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "벤츠";
        car.year = 2024;
        car.name = "G바겐";

        car.displayInfo();
    }
}