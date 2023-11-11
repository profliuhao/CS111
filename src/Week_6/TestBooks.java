package Week_6;

import java.util.*;
public class TestBooks
{
   public static void main(String[] args)
   {

      Book testbook = new Book();
      Book testbook2 = new Book("Happy porter part 7");

      Book mybook1 = new Book(156, "Harry Portter part 1");
      Book mybook2 = new Book(67, "Harry Portter part 2");
      Book mybook3 = new Book(156, "Harry Portter part 1");
      Book mybook4 = new Book(189, "Harry Portter part 3");

      System.out.println("Book.getCount() = " + Book.getCount());

      mybook1.getPages();
      mybook1.getTitle();
      int result = Math.abs(-5);



      ArrayList<Book> books = new ArrayList<Book>();
      if(books.isEmpty()){
         System.out.println("The book list is empty");
      }else{
         System.out.println("The book list is not empty");
      }

      books.add(mybook1);
      books.add(mybook2);
      books.add(mybook3);
      books.add(mybook4);

      int index=0;
      while(index < books.size()){
         Book tempBook = books.get(index);
         System.out.println(tempBook.getTitle() + "\t" + tempBook.getPages());
         index++;
      }

      for(int num =0 ; num<books.size(); num++){
         Book abook = books.get(num);
         System.out.println("abook = " + abook);
      }

      Collections.sort(books);


      for (Book myBook : books)
         System.out.println(myBook);




      if(books.isEmpty()){
         System.out.println("The book list is empty");
      }else{
         System.out.println("The book list is not empty");
      }

      System.out.println("books.get(0) = " + books.get(0).toString());

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

      // for loop to get each book's pages and title
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
      
      
         
         
 
