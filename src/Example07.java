// static
public class Example07 {
    // Java 메모리 구조
    // Method Area (MetaSpace) <- 최상위. 계속 유지 (코드가 끝날때까지...) <= 클래스, 메서드 코드 자체
    // Heap <- 객체. (new) - 인스턴스 변수 <= 메모리에 넣나뺐다가 GC(Garbage Collection)
    // Stack <- 메서드 {} => 지역변수, 매개변수

    // static은 heap을 거치지 않고도 클래스 자체가 변수와 메서드를 가질 수 있게 하는 기능 (블록, 클래스...) => Method Area.
    public static void main(String[] args) {
        // 접근제어자 public : 외부에서도 호출할 수 있게
        // static -> 객체를 생성하지 않고도 호출할 수 있게
        // void -> Return이 없다
        // ...

    }
}
