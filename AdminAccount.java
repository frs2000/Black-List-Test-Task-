package TestTaskBlackList;

public class AdminAccount {
    private String login; //e-mail or username
    private String password;
    private int minLoginLength = 5; // 5 and more characters by default
    private int minPasswordLength = 8; // 8 and more characters by default

    public AdminAccount(String login, String password) {
        if (login.length() < minLoginLength || password.length() < minPasswordLength) {
            System.out.println("Account not created.\nThe length of the login "
                    + "or password is less than the allowed.\nTry again.");
        } else {
            this.login = login;
            this.password = password;
            System.out.println("You have successfully created an account!");
        }
    }
    
    public String getLogin(){
        return login;
    }
    
    public String getPassword(){
        return password ;
    }
}
