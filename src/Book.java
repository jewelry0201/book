import java.util.List;

public class Book {
    private String name;
    private boolean isBorrowed;

    public Book(String name){
        this.name=name;
        this.isBorrowed=false;
    }

    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
    public String printstate(){
        if(isBorrowed()==true)
            return "대여 중";
        else
            return "대여 가능";
    }





}
