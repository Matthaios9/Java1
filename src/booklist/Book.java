/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booklist;


public class Book {
    
    private int id;
    private String name;
    private String authorName;
    
    static int idGenerator = 1;

    public Book(int id, String name, String authorName) {
        this.id = idGenerator;
        this.name = name;
        this.authorName = authorName;
    }

    Book(String bookName, String authorName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", authorName=" + authorName + '}';
    }

 
    
    
            
    
}
