public class computer {
    //Always call the name of a class in a static method..
    int a;
    double b;
    public void assign(int a, double b){
        this.a= a;
        this.b= b;
    }
    public static void main(String[] args) {
        computer x= new computer();
        x.assign(10, 20.5);
        System.out.println(x.a);
        System.out.println(x.b);
    }
}
