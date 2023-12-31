package Week_6;

// Define a class named Book
public class Book implements Comparable<Book>
{
   // Data fields
   private int pages;
   private String title;

   private static int count;
   
   // Constructor to initialize pages and title

   public Book(){
      pages = 0;
      title = "";
      count++;
   }
   public Book(int pages, String title)
   {
      this.pages = pages;
      this.title = title;
      count++;
   }
   public Book(String t){
      title = t;
      pages = 100;  //set default = 100
      count++;
   }

   public static int getCount(){

      return count;
   }
   
   // setter for pages
   // fill in here


   // setter for title
   // fill in here

   // getter for pages
   // fill in here
   public int getPages(){
      return pages;
   }
   
   // getter for title
   public String getTitle(){
      return title;
   }
   
   // toString method that returns book information
   public String toString()
   {
      String result = "";
      // fill in here
      return result;
   }
   
   // equal method that returns true if two books have the same title and pages
   public boolean equals(Book anotherBook)
   {
      // fill in here
      if (title.equals(anotherBook.getTitle()) && pages == anotherBook.getPages()){
         return true;
      }else{
         return false;
      }
    }
    // a compareTo method that compares two books
   @Override
   public int compareTo(Book anotherBook)
    {
       // if book1 has more pages than anotherbook, return 1
       if (pages > anotherBook.getPages()){
          return 1;
       }else{
          // if book1 has the same pages as anotherbook, rerturn 0
          if (pages == anotherBook.getPages()){
             return 0;
          }else{
             // if book1 has fewer pages than anotherbook, return -1
             return -1;
          }
       }

    }

}
   
