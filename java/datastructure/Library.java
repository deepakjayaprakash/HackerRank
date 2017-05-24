import java.util.*;


class Book{
	String name;
	String Category;
	float pricePerDay;
	Book(){
		
	}
	Book(String name,String Category, float pricePerDay){
		this.name=name;
		this.Category=Category;
		this.pricePerDay=pricePerDay;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public float getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
}
class Students{
	String name;
	String ID;
	ArrayList<String> books=new ArrayList<String>();
	
	Students(){
		
	}
	Students(String name, String ID){
		this.name=name;
		this.ID=ID;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
}


public class Library {
	
	private static Scanner sc;
   
	
	public static void displayBooks(ArrayList<Book> b){
		Iterator<Book> i=b.iterator();
		while(i.hasNext()){
			Book b1=i.next();
			System.out.println("Name: "+b1.getName()+"\t Category:"+b1.getCategory()+"\t Price per day:"+b1.getPricePerDay());
		}
		
	}
	
public static void displayStudents(ArrayList<Students> s){
	
	Iterator<Students> i=s.iterator();
	while(i.hasNext()){
		Students s1=i.next();
		System.out.println("Name: "+s1.getName()+"\t ID:"+s1.getID());
		}
	}


	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		
		ArrayList<Students>s=new ArrayList<Students>();
		s.add(new Students("Deepak", "CS037"));
		s.add(new Students("Aman", "CS021"));
		s.add(new Students("Ayush", "CS034"));
		s.add(new Students("Bineet", "CS036"));
		
		
		ArrayList<Book> b=new ArrayList<Book>();
		
		b.add(new Book("Harry Potter","Fiction",(float) (3.50)));
		b.add(new Book("Space between us","Romedy",(float) (3.50)));
		b.add(new Book("50 first dates","Romedy",(float) (3.50)));
		
		System.out.println("Choose an operation");
		System.out.println(" 1. Display all registered students \n 2. Display all books \n 3. Add new Student \n 4. Add new Book");
		int choice=sc.nextInt();
		
		switch(choice){
		case 1: displayStudents(s);break;
		case 2: displayBooks(b);break;
		case 3: addStudent(s);displayStudents(s); break;
		case 4: addBook(b);displayBooks(b);break;
		case 5: System.out.println("More options");
			System.out.println("Choose an operation");
			System.out.println(" 1. Display all registered students in sorted order ");
			int choice2=sc.nextInt();
			switch(choice2){
			case 1: sortedStudents(s); break;
			case 2: break;
			}
		
		default: System.out.println("Wrong Option");
		}
		
	}

	private static void sortedStudents(ArrayList<Students> s) {
	//	Collections.sort(<Students> s);
		Iterator<Students> i=s.iterator();
		while(i.hasNext()){
			Students s1=i.next();
			System.out.println("Name: "+s1.getName()+"\t ID:"+s1.getID());
			}
		
	}

	private static void addBook(ArrayList<Book> b) {
		
		int input=1;
		while(input==1){
			sc.nextLine();
		System.out.println("Enter Book name:");
		String name=sc.nextLine();
		System.out.println("Enter Category:");
		String Category=sc.nextLine();
		System.out.println("Enter Price per day:");
		float pricePerDay=sc.nextFloat();
		b.add(new Book(name,Category,pricePerDay));
		System.out.println("Want to enter more?1 :0");
		input=sc.nextInt();
		
		}
		
	}

	private static void addStudent(ArrayList<Students> s) {
		int input=1;
		while(input==1){
			sc.nextLine();
		System.out.println("Enter student name:");
		String name=sc.nextLine();
		System.out.println("Enter student ID:");
		String ID=sc.nextLine();
		
		s.add(new Students(name,ID));
		System.out.println("Want to enter more?1 :0");
		input=sc.nextInt();
		
		}
		
	}

}
