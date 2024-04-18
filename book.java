import java.util.*;
class book {
    private int bid,price;
    private String bname,author,publication; 
    
    public book() {
        bid = 420;
        price = 150;
        bname = "rich dad poor dad";
        author = "harshil";
        publication = "harshil";
    }
    public book(int bid, int price, String bname, String author, String publication) {
        this.bid = bid;
        this.price = price;
        this.bname = bname;
        this.author = author;
        this.publication = publication;
    }
    public book(book b)
    {
        bid = b.bid;
        price = b.price;
        bname = b.bname;
        author = b.author;
        publication = b.publication;
    }
    public void show()
    {
        System.out.println("book id: "+bid);
        System.out.println("book price: "+price);
        System.out.println("book name :"+bname);
        System.out.println("Author Name :"+author);
        System.out.println("Publication :"+publication+"\n");

    }

    public static void main(String args[]) {
        book b1 = new book();
        b1.show();
        book b2 = new book(11,300, "rich dad", "krishiv", "self published");
        b2.show();
        //creating object of class book using another object of the same class
        book b3 = new book(b2);
        System.out.println("\nDetails after creating object using another objects data:\n");
        b3.show();
    }
}