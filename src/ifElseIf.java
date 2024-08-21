public class ifElseIf {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if(a < b || a > c)
        System.out.println("A is the greatest");

        else if(b < c)
        System.out.println("B is the greatest");

        else{
            System.out.println(c);
            System.out.println("C is the greatest");
       } 
    }
}
