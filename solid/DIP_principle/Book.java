package solid.DIP_principle;

public class Book {
    View view;

    public void setView(View view){
        this.view = view;
    }

    int indexPage;

    public Book(View view) {
        this.view  = view;
        indexPage = 1;
    }


    public void viewtitle(){
        view.print("заголовок книги");
    }

    public void viewAuthor(){
        view.print("Автор книги");
    }

    public void turnPage(int page){
        if(page >=1 && page <=300){
            this.indexPage = page;
        }
    }

    public void viewCurrentPage(){
        view.print(String.format("Page #: %s", this.indexPage));
    }
}
