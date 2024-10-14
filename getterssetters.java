
class Account {

    private String name;

    void setname(String x) // method to setname
    {
        name = x;
    }

    String getname() //method to getname
    {
        return name;
    }
}

public class getterssetters {

    public static void main(String[] args) {
        Account obj = new Account();
        //   obj.name = "somesh";
        obj.setname("hello-world");
        System.out.println(obj.getname());
    }
}
