public class Student {
    private String name;
    private int kor;
    private int eng;

    public Student(String name,int kor,int eng){
        this.name= name;
        this.kor=kor;
        this.eng=eng;
    }

    public String getName(){
        return name;
    }
    public int getKor()
    {
        return kor;
    }
    public int getEng()
    {
        return eng;
    }
    public void printst(){
        System.out.println("이름: "+getName());
        System.out.println("국어: "+getKor());
        System.out.println("영어: "+getEng());

    }
}

