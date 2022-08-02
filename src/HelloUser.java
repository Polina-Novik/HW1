public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Enter your name ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String user=scanner.nextLine();
        System.out.println("Hello " + user);
    }
}

