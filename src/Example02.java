// 메서드 (함수)
public class Example02 {
    public static void main(String[] args) {
        // Java는 함수가 없다 (지금은 해당 안함)
        // Java는 원칙적으로 모든 함수가 클래스에 소속되는 걸 권장.
        // 클래스 내부에 있는 인스턴스 혹은 static을 통해서 호출되는 함수 -> 메서드
        Animal animal = new Animal();
        animal.hello(); // 인스턴스.메서드()
        // 인스턴스.메서드 <- JS => 함수 => 일급객체 <-> 자바에서는 메서드는 객체 x.
        // 함수 객체가 없는 건 아닌데 JS처럼 바로바로 할 수 X.
    }
}

class Animal {
    // returnType name(param) {...}
    void hello() {
        System.out.println("Hello!");
    }
    // [접근제어자] [static] 반환타입 이름(매개변수) [throws 에러타입] {
        // 로직
    // }
}
