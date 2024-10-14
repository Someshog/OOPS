public class strings{
    public static void main(String args[]){
        String s1 = "somesh"; 
        String s2 = new String("somesh");
        StringBuilder buffer1 = new StringBuilder("hello");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.printf("buffer1: %s",buffer1.append("somesh"));
        System.out.printf("buffer1: %n %s",buffer1); //prints hellosomesh
        buffer1.setLength(50);
        buffer1.append(22);
        System.out.printf("buffer1: %n %s",buffer1); //prints hellosomesh22


    }
}