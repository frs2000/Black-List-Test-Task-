package TestTaskBlackList;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {

    Scanner scanner = new Scanner(System.in);
    AdminAccount adminAccount;
    static ArrayList<AdminAccount> adminAccountList;
    private AdminPanel adminPanel;

    public LoginPage() {
        adminAccountList = new ArrayList<>();
        adminPanel = new AdminPanel();
        logic();
    }

    public void logic() {
        System.out.println("-----------------------------------------------");
        System.out.println("Do you have account? Do you want to log in? "
                + "\nPress 1 - if you want "
                + "to create account. \nPress 2 - if you have"
                + " account and want to log in. ");
        int numeral = scanner.nextInt();
        if (numeral == 1) {
            createAccount();
        }
        if (numeral == 2) {
            logInToTheAccount();
        }
//        else System.out.println("Try one more time!");    
    }

    public void createAccount() {
        String writeLogin;
        String writePasswor;

        while (true) {
            System.out.println("Write login (5 and more characters)");
            writeLogin = scanner.next();
            break;
        }
        while (true) {
            System.out.println("Write Password (8 and more characters)");
            writePasswor = scanner.next();
            break;
        }
        adminAccount = new AdminAccount(writeLogin, writePasswor);
        adminAccountList.add(adminAccount);
        logic();
    }

    public void logInToTheAccount() {
        System.out.println("Please write your Login and Password!");
        String writeLogin;
        String writePasswor;

        while (true) {
            System.out.println("Write login");
            writeLogin = scanner.next();
            break;
        }

        while (true) {
            System.out.println("Write Password");
            writePasswor = scanner.next();
            break;
        }

        AdminAccount temporarAdminAccount;
        for (int i = 0; i < adminAccountList.size(); i++) {
            temporarAdminAccount = adminAccountList.get(i);
            if (temporarAdminAccount.getLogin().equals(writeLogin)
                    && temporarAdminAccount.getPassword().equals(writePasswor)) {
                System.out.println("Everything is fine. You in occuunt");
                adminPanel.logic();
            } else {
                System.out.println("You wrote wrong Login or Password. Try one more time!");
            }
        }
    }


}
