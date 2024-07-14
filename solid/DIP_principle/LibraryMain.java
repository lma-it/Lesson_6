package solid.DIP_principle;

/*
 * D - Dependency inversion principle
 * принцип инверсии зависимостей
 */
public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book(new ConsoleView());
        book.viewAuthor();

        book.viewCurrentPage();
        book.turnPage(13);
        book.viewCurrentPage();
    }
}
