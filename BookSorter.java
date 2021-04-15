import java.util.*;


class BookSorter {

	String author, title;
	int cost;

	// Constructor
	public BookSorter(String _author, String _title, int _cost)
	{
		this.author = _author;
		this.title = _title;
		this.cost = _cost;
	}

	// Used to print student details in main()
	public String toString()
	{
		return this.author + " " + this.title + " "
			+ this.cost;
	}
}

class Sortbyauthor implements Comparator<BookSorter> {
	// Used for sorting in ascending order of
	// author
	public int compare(BookSorter a, BookSorter b)
	{
		return a.author.compareTo(b.author);
	}
}

class Sortbytitle implements Comparator<BookSorter> {
	// Used for sorting in ascending order of
	// title
	public int compare(BookSorter a, BookSorter b)
	{
		return a.title.compareTo(b.title);
	}
}
class Sortbycost implements Comparator<BookSorter> {
	// Used for sorting in ascending order of
	// cost
	public int compare(BookSorter a, BookSorter b)
	{
		return a.cost - b.cost;
	}
	
}
