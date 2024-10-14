class somesh{
    static int c;

    static void add (int x, int y) {

        c = x + y;
        // System.out.printf("%d", c);

    }
    static int getsum(){
        return c;
    }
}

public class suchitclass {

    public static void main(String[] args) {
        // somesh obj = new somesh();
        // obj.add(22, 22);
        // string
        somesh.add(2,2);
        System.out.printf("%d", somesh.getsum());
        // int c = obj.add(2, 2);

    }
}
