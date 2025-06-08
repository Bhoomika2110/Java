public class Book{
    static int totalNoOfbook;

    String author;
    String title;
    String isbn;
    boolean isBorrwed;
   static {
    totalNoOfbook =0;
  }
{
  totalNoOfbook++;
}
    Book(String isbn, String title,String author ){
    this.isbn= isbn;
    this.title= title;
    this.author=author;
   } 
   Book(String isbn){
        this(isbn , "unknown", "unknown");
    }
    static int gettotalNoOfbook(){
        return totalNoOfbook;
    }
    void borrwedbook(){
        if(isBorrwed){
            System.out.println("book is already borrowed");
        } else {
            this.isBorrwed= true;
            System.out.println( "enjoy the book "+ this.title);
        }
    } void returnBook(){
        if(isBorrwed){
            System.out.println("hope you enjoyed ,please leave a review");
        } else {
            System.out.println("this book is already in the library");
        }
    } 
    public static void main(String[] args) {
        Book designOfThing=new Book("1" , "Design", "Author"); 
        Book myBook =new Book("2");
        System.out.println(Book.gettotalNoOfbook());
        designOfThing.borrwedbook();
        myBook.borrwedbook(); 
        designOfThing.borrwedbook();
        designOfThing.returnBook();
        designOfThing.returnBook();
     }
}