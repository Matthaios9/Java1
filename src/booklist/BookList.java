
package booklist;



        // CRUD = create, read, update, delate
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class BookList {

    static boolean loop = true;

    public static void main(String[] args) {

        while (loop){
        switchCase(menu());
        }
    }

    public static void switchCase(int val) {

        switch (val) {
            case 1:
                Library.addBook();
                break;
            case 2:
                Library.removeBookById();
                break;
            case 3:
                Library.removeBookByName();
                break;
            case 4:
                Library.showBookById();
                break;
            case 5:
                Library.showAllBooks();
                break;
            case 6:
                Library.updateBookName();
                break;
            case 7:
                Library.numberOfBooks();
                break;
            case 0:
                loop = false;
                
                break;
            default:
                System.out.println("Wrong Choice!");
        }

    }

    public static int menu() {
        System.out.println("\n\n1. Add book");
        System.out.println("2. Remove book by id");
        System.out.println("3. Remove book by name");
        System.out.println("4. Show book by id");
        System.out.println("5. Show all books");
        System.out.println("6. Update book name");
        System.out.println("7. Number of books in library");
        System.out.println("0. Exit");

        System.out.println("\nMake a choice");
        int choice = Library.sc.nextInt();
        Library.sc.nextLine();
        return choice;
    }
    
}
