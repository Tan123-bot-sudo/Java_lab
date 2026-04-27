public class Counter {
    static int cnt = 0;

    Counter() {
        cnt++;
    }

    void display() {
        System.out.println(cnt);
    }
}

class TestCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c3.display();
    }
} 

