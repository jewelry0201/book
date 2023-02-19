import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(List<Book> books){
        this.books=books;
    }
    public void borrow(int number){
        if(number==1){
            if (books.get(0).isBorrowed()==false){

                books.get(0).setBorrowed(true);
                System.out.println("정상적으로 대여가 완료되었습니다.");

            }
            else{
                System.out.println("대여중인 책은 빌릴 수 없습니다.");
            }
        }
        else if(number==2){
            if (books.get(1).isBorrowed()==false){

                books.get(1).setBorrowed(true);
                System.out.println("정상적으로 대여가 완료되었습니다.");

            }
            else{
                System.out.println("대여중인 책은 빌릴 수 없습니다.");
            }
        }
        else if(number==3){
            if (books.get(2).isBorrowed()==false){

                books.get(2).setBorrowed(true);
                System.out.println("정상적으로 대여가 완료되었습니다.");

            }
            else{
                System.out.println("대여중인 책은 빌릴 수 없습니다.");
            }
        }


    }
    public void print(){
        System.out.println("1. "+books.get(0).getName()+"-"+books.get(0).printstate());
        System.out.println("2. "+books.get(1).getName()+"-"+books.get(1).printstate());
        System.out.println("3. "+books.get(2).getName()+"-"+books.get(2).printstate());

    }
}