enum Book{
    book1("title1",200),book2("title2",500);
    private String title;
    private int price;
    Book(String title,int price){
        this.title = title;
        this.price = price;
    }
    public String gettitle(){
        return title;
    }
    public int getprice(){
        return price;
    }
}

public class enumtest{
    public static void main(String args[]){
        for(Book b: Book.values()){
           System.out.printf(b + ": %s %d %n",b.gettitle(),b.getprice()); 
        }
    }
}
