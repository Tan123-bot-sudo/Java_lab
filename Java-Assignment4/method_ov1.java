public class method_ov1 {
    void print(int a) {
        System.out.println("Method 1");
}
void print(int a, int b) {
        System.out.println("Method 2");
}
 
public static void main(String[] args) {
    method_ov1 obj = new method_ov1();
    obj.print(10 );
    obj.print(10, 20);
}
}
