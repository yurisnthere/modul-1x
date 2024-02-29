import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nim,input, username, password;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("=========Library System========");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");

         input = keyboard.nextLine();

        if (input.equals("1")) {
            System.out.print("Enter your NIM: ");
             nim = keyboard.nextLine();
            if (nim.length() == 15) {
                System.out.println("Student login successful.");
            } else {
                System.out.println("User not found");
            }
        } else if (input.equals("2")) {
            boolean AdminAuthenticated = false;
            while (!AdminAuthenticated) {
                System.out.print("Enter admin username: ");
                 username = keyboard.nextLine();
                System.out.print("Enter admin password: ");
                 password = keyboard.nextLine();
                if (username.equals("admin") && password.equals("admin")) {
                    AdminAuthenticated = true;
                    System.out.println("Admin login successful.");
                } else {
                    System.out.println("Admin User not found");
                }
            }
        } else if (input.equals("3")) {
            System.out.println("adios");
        } else {
            System.out.println("Salah");
        }

        keyboard.close();
    }
}