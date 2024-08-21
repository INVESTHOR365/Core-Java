public class logicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int x = 30;
        int y = 40;

        boolean result = (a < b) && (x > y);
        System.out.println(result);
        boolean result1 = (a < b) || (x > y);
        System.out.println(result1);
        boolean result2 = !(a < b);
        System.out.println(result2);
        boolean result3 = (x > y);
        System.out.println(!result3);

//        &&
//        T T = T;
//        T F = F;
//        F T = F;
//        F F = F;
//
//        ||
//        T T = T;
//        T F = T;
//        F T = T;
//        F F = F;
//
//        !

    }
}
