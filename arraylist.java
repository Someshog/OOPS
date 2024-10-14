import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new <String>ArrayList();
        arr.add("somesh");
        System.out.println("added: "+ arr.get(0));
        arr.remove(0);
        System.out.println("removed: "+arr.get(0));
    }
}
