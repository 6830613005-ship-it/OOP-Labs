public class BookDemo {
    public static void main(String[] args) {
        //สร้าง object
        Book myBook = new Book("Develop Java Software","Russel Winder",79.75);
    
    System.out.println("Book Title :" + myBook.getTitle());
    System.out.println("Author :" + myBook.getAuthor());
    
    }
}