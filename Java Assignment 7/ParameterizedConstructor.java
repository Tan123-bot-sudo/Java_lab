class ParameterizedConstructor {
    int x;

    ParameterizedConstructor(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        ParameterizedConstructor d = new ParameterizedConstructor(10);
        System.out.println(d.x);
    }
}