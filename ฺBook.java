public class Book{
    //Attribute
    private String title;
    private String author;
    private double price;

    //Constructor 
    public Book(String title,String author,double price) {
        this.title = title; // this.title หมายถึง attribute ของ class
        this.author = author;
        this.price = price;
    }

//Setter เพื่อแก้ไขค่าทีหลัง
public void setTitle(String title) {
    this.title = title; 
}
public void setAuthor(String author) {
    this.author = author; 
}
public void setPrice(double price) {
    this.price = price; 
}

//Getter ใช้เพื่อดึงค่าออกมา
public String getTitle() {
    return title;
}
public String getAuthor() {
    return author;
}



}
