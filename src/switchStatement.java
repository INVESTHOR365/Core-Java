public class switchStatement {
    public static void main(String[] args) {

        int z = 1;

        switch (z) {
            case 1: {
                System.out.println("I am 1");
                System.out.println("I am the first");
            }
            break;
            case 2:
                System.out.println("I am 2");
                break;
            case 3:
                System.out.println("I am 3");
                break;
            default:
                    System.out.println("I am not 1, 2, or 3");
        }
    }

}
