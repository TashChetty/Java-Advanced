package lesson13;

import java.io.Console;

public class SystemConsoleTest {

    public static void main(String[] args) {
        String username = "oracle";
        String password = "tiger";
        boolean userValid = false;
        Console cons = null;
        
        //get a console instance
        if(cons !=null){
            String userTyped;
            String pwdTyped;
            do{
                userTyped = cons.readLine("%s","User name: ");
                pwdTyped = new String(cons.readPassword("%s", "Password:"));
                if(userTyped.equals(username)&& pwdTyped.equals(password)){
                    userValid= true;

                }else {
                    System.out.println("User name and password dont match credentials.\n try again.\n ");
                }
            }while (!userValid);
            System.out.println("Success you are now logged on");
        } else{
            System.out.println("The console is not attached to this VM. Try running this application at the command-line.");
        }
    }
}
