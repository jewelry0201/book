public class Person {
    private String name;
    private int age;
    private boolean student;
    private double weight;

    public Person(String name, int age, boolean student, double weight){
        this.name=name;
        this.age=age;
        this.student=student;
        this.weight=weight;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getStudent(){
        return student;
    }
    public double getWeight()
    {
        return weight;
    }
    public void printProfile(){
        System.out.println("이름: "+getName());
        System.out.println("나이: "+getAge());
        System.out.println("대학생인가요?: "+getStudent());
        System.out.println("몸무게: "+getWeight());
    }
}
