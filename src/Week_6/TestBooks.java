import java.util.*;
public class TestBooks
{
   public static void main(String[] args)
   {

      Book mybook1 = new Book(56, "Harry Portter part 1");
      Book mybook2 = new Book(67, "Harry Portter part 2");
      Book mybook3 = new Book(56, "Harry Portter part 1");

      if(mybook1.compareTo(mybook2)>0){
         System.out.println("mybook1 has more pages");
      }else {
         if (mybook1.compareTo(mybook2)==0){
            System.out.println("mybook1 has the same pages as mybook2");
         }else{
            System.out.println("mybook1 has less pages than mybook2");
         }
      }



      if(mybook1.equals(mybook2)){
         System.out.println("Same book");
      }else{
         System.out.println("Not same book");
      }

      if(mybook3.equals(mybook1)){
         System.out.println("Same book");
      }else{
         System.out.println("Not same book");
      }


//      int pageSum = 0;
//      int numBooks = 0;
//      Scanner scan = new Scanner(System.in);
//
//
//      System.out.print("How many books did you read this summer? ");
//      numBooks = scan.nextInt();
//
//      ArrayList<Book> books = new ArrayList<Book>();
//
//      // for loop to get each book's pages and title
//      for (int i = 0; i < numBooks; i++)
//      {
//         System.out.print("How many pages are in book " + (i+1) + "? ");
//         // fill in here
//
//         System.out.print("What is the title of book " + (i+1) + "? ");
//         // fill in here
//
//         // add this book to the books list
//         // fill in here
//      }
//
//      // create the book with the smallest number of pages
//      Book smallest = books.get(0);
//
//      for (int i = 0; i < numBooks; i++)
//      {
//         // compare each book with the smallest book
//         // update the smallest book if a book's number of pages is smaller
//         // fill in here
//      }
//      System.out.println("The smallest book you read was " + smallest.getTitle());

      // calculate the avg number of pages of all books, defined as avgPages
      // fill in here
//      System.out.println("The average number of pages you read was " + avgPages);
   }
}      
      
      
         
         
 
