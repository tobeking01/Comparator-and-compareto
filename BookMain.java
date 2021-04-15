import java.util.ArrayList;
import java.util.Collections;

public class BookMain {

			public static void main(String[] args)
			{
				ArrayList<BookSorter> book = new ArrayList<BookSorter>();
				
				book.add(new BookSorter("Susan", "Godzilla" , 20));
				book.add(new BookSorter( "Adam", "Napoleon", 15));
				book.add(new BookSorter("Jake", "Washinton", 12));
				book.add(new BookSorter("Bob", "Hamilton", 30));
				book.add(new BookSorter("Drake", "Equations", 28));


				System.out.println("Unsorted");
				for (int i = 0; i < book.size(); i++)
					System.out.println(book.get(i));

				Collections.sort(book, new Sortbyauthor());

				System.out.println("\nSorted by author");
				for (int i = 0; i < book.size(); i++)
					System.out.println(book.get(i));

				Collections.sort(book, new Sortbytitle());

				System.out.println("\nSorted by title");
				for (int i = 0; i < book.size(); i++)
					System.out.println(book.get(i));
				
				Collections.sort(book, new Sortbycost());

				System.out.println("\nSorted by cost");
				for (int i = 0; i < book.size(); i++)
					System.out.println(book.get(i));
			}
		
	}


