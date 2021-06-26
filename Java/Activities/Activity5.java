package activities;

public class Activity5 {


	    public static void main(String []args) {
	        //Initialize title of the book
	        String title = "Book Title";
	        //Create object for MyBook
	        Book newNovel = new MyBook();
	        //Set title
	        newNovel.setTitle(title);
	        
	        //Print result
	        System.out.println("The title is: " + newNovel.getTitle());
	    }
	}
