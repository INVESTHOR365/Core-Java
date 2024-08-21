public class ifElse {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
//        int z = 25;
//
//        if (x < y || z > y) {
//            System.out.println("Yes, I am");
//        }
//        else {
//            System.out.println("No, I am not");
//        }

        // Ternary Operator
        int result = (x > y) ? x : y;

        System.out.println(result);
    }

}
