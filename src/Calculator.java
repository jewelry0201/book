public class Calculator {
    private String owner;
     private double result;


    public Calculator(String owner){
        this.owner=owner;
    }
    public String getOwner(){
        return owner;
    }
    public int add(int a, int b){
        int result=a+b;
        return result;
    }
    public int minus(int a, int b){
        int  result=a-b;
        return result;
    }
    public int multiply(int a, int b){
        int result=a*b;
        return result;
    }
    public double divide(double a, double b){
        result=a/b;
        return result;
    }
    public double divide(String a, String b){
        double i=Double.parseDouble(a);
        double j=Double.parseDouble(b);
        result=i/j;
        return result;
    }
}
