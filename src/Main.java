public class Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4};  //길이 변경 불가능
        String name = "h662";           //길이 변경 가능
        System.out.println(name.length());
        name = "h6662";                 // 다른 문자열 객체의 참조를 대입
        System.out.println(name.length());


        System.out.println(numbers.length); //미리 재논 길이의 값
    }
}