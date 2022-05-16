package ak;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {


		    public List<String> favoriteBooks=new ArrayList<>();
		    public void addFavoriteBook(String bookname) {
		        if (bookname.indexOf("Great") == -1) {
		            favoriteBooks.add(bookname);
		        }
		    }


		        public void printFavoriteBooks(){

		            System.out.println("Favorite Books:.."+favoriteBooks.size());

		            for(String book : favoriteBooks ){

		                System.out.println(book);

		            }

		            }

		    public static void main(String[] args) {
		        Exercise1 obj=new Exercise1();
		        obj.addFavoriteBook("India is a Great");
		        obj.addFavoriteBook("pakistan");
		        obj.addFavoriteBook("alchemist 21");
		        obj.addFavoriteBook("rich dad poor dad");
		        obj.printFavoriteBooks();
		    }

		    }

	


