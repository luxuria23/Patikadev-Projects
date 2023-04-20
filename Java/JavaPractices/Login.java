package Java.JavaPractices;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // declaring variables
        String userName, password, response;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // getting variables
        System.out.print("Username: ");
        userName = sc.nextLine();

        System.out.print("Password: ");
        password = sc.nextLine();

        // checking username and password
        if (userName.equals("patika") && password.equals("java")) {
            response = "Successfully logged in";
        } else {
            //if password not ture asking for change
            System.out.println("Password or Username is incorrect\nDo you want to change password\n1-Yes\n2-No");

            //checking for password change
            if (sc.nextInt() == 1) {
                sc.nextLine();  //its for skipping line because of nexInt dont do

                //asking for new password
                System.out.print("Enter new password: ");

                //checking for same password
                if (sc.nextLine().equals("java")) {
                    response = "Try another password";
                } else {
                    response = "Password changed.";
                }
            } else {
                response = "Can't login";
            }

        }
        System.out.println(response);

        sc.close();
    }
}
