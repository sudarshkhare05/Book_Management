package pack;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;

class ref{
	public static final HashMap<Integer, String> Book = new LinkedHashMap<Integer, String>();
}
public class Java_project {
	
	public static void addBook(int a)
	{
		Scanner Sc = new Scanner(System.in);
		if(ref.Book.containsKey(a))
		{
			System.out.println("Book Already Exist" + "\n");
		}
		else
		{
			System.out.println("Enter Book name - ");
			String b = Sc.nextLine();
			ref.Book.put(a, b);
			System.out.println("\n");
		}
	}
	public static void findBook(int a)
	{
		if(ref.Book.containsKey(a))
		{
			String name = ref.Book.get(a);
			System.out.println("The book refering to the BookID is - " + name + "\n");
		}
		else
		{
			System.out.println("The Book does not exist in the records" + "\n");
		}
	}
	public static void updateBook(int a)
	{
		if(ref.Book.containsKey(a))
		{
			System.out.println("Enter the New Name - ");
			Scanner Sc = new Scanner(System.in);
			String nname = Sc.nextLine();
			ref.Book.put(a,nname);
			System.out.println("\n");
		}
		else
		{
			System.out.println("The Book does not exist in the records" + "\n");
		}
	}
	public static void deleteBook(int a)
	{
		if(ref.Book.containsKey(a))
		{
			ref.Book.remove(a);
			System.out.println("\n");

		}
		else
		{
			System.out.println("The Book does not exist in the records");
			System.out.println("\n");
		}
	}
	public static void displayBook()
	{
		for (HashMap.Entry<Integer,String> entry : ref.Book.entrySet()) 
            System.out.println("BookID = " + entry.getKey() +
                             ", Book Name = " + entry.getValue() + "\n");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
		do {
				System.out.println("Select Your Choice"+"\n" 
				+ "1. Add Book" + "\n" 
				+ "2. Find Book" + "\n" 
				+ "3. Update Book" + "\n" 
				+ "4. Delete Book" +"\n" 
				+ "5. Display Book" +"\n" 
				+"6. EXIT");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter Book ID - ");
					int bookid = sc.nextInt();
					addBook(bookid);
					break;
				case 2:
					System.out.println("Enter Book ID to be Found - ");
					int fbookid = sc.nextInt();
					findBook(fbookid);
					break;
				case 3:
					System.out.println("Enter BookID of the book to be updated - ");
					int ubookid = sc.nextInt();
					updateBook(ubookid);
					break;
				case 4:
					System.out.println("Enter the BookID needed to be deleted - ");
					int dbookid = sc.nextInt();
					deleteBook(dbookid);
					break;
				case 5:
					displayBook();
					break;
				case 6:
					//exit;
					break;
				default:
					System.out.println("Enter Valid Values");
					break;
				}
		}while(choice!=6);
	}
}
