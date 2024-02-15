package _03_Batch3_BankProject02_Solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje_03 {

    public static void main(String[] args) {

        // Scanner Class tanimlayin...
        Scanner scan = new Scanner(System.in);

        // Banka Islemleri Listesi tanimlayin..."Para_Yatir", "Para_Cek", "Transfer", "Hesap_Ac"...
        Action action1 = new Action("Para_Yatir");
        Action action2 = new Action("Para_Cek");
        Action action3 = new Action("Transfer");
        Action action4 = new Action("Cikis");
        List<Action> actions = new ArrayList<>(Arrays.asList(action1,action2,action3,action4));

        // Hesap Numaralari
        Account user_1_account1 = new Account(1234, 200);
        Account user_1_account2 = new Account(4321, 20);
        Account user_2_account1 = new Account(5678, 1000);
        Account user_2_account2 = new Account(8765, 100);
        Account user_3_account1 = new Account(9999, 5000);
        Account user_3_account2 = new Account(1111, 500);

        // Banka musterileri kullanici adi listesi tanimlayin..."User1", "User2", "User3"...
        Customer customer1 = new Customer("User1", "password1", Arrays.asList(user_1_account1, user_1_account2));
        Customer customer2 = new Customer("User2", "password2", Arrays.asList(user_2_account1, user_2_account2));
        Customer customer3 = new Customer("User3", "password3", Arrays.asList(user_3_account1, user_3_account2));
        List<Customer> customers = new ArrayList<>(Arrays.asList(customer1,customer2,customer3));

        // Kod burada basliyor...
        Customer currentUser;
        Account chosenAccount;

        while (true){
            System.out.println("Please enter your username: ");
            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            currentUser = confirmUsernameAndPassword(customers, username, password);
            if ( currentUser != null){
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        // Actions starts here
        while (true){
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i).description+ " - " + (i+1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice){

                case 1:{

                    while (true){
                        System.out.println("Lutfen para yatirmak istediginiz hesap numarasini giriniz...: ");
                        for (Account account : currentUser.accounts) {
                            System.out.println(account.number);
                        }
                        String chosen = scan.next();
                        chosenAccount = confirmAccountNumber(currentUser, chosen);
                        if (chosenAccount == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        break;
                    }
                    System.out.println("Lutfen yatirilacak para miktarini giriniz...: ");
                    int amountToAdd = scan.nextInt();
                    chosenAccount.funds += amountToAdd;
                    break;
                }

                case 2: {

                    while (true){
                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (Account account : currentUser.accounts) {
                            System.out.println(account.number);
                        }
                        String chosen = scan.next();
                        chosenAccount = confirmAccountNumber(currentUser, chosen);
                        if (chosenAccount == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        int amountToWithdraw = scan.nextInt();
                        if (!withdraw(chosenAccount, amountToWithdraw)){
                            break;
                        }
                    }
                    break;
                }

                case 3:{
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                }

                case 4: System.exit(1);

                default:{
                    System.out.println("Basarili bir secim yapmadiniz...");
                }

            }
        }
    }

    private static boolean withdraw(Account chosenAccount, int amountToWithdraw ) {

        if (chosenAccount.funds < amountToWithdraw){
            System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir...");
            return true;
        }
        chosenAccount.funds -= amountToWithdraw;
        System.out.println("Lutfen paranizi aliniz, hesabinizda toplam "+chosenAccount.funds+" euro kalmistir...");
        return false;
    }

    public static Account confirmAccountNumber(Customer currentUser, String chosenAccount){
        Integer chosen = Integer.parseInt(chosenAccount);
        for (Account account : currentUser.accounts) {
            if (account.number == chosen) return account;
        }
        return null;
    }

    private static Customer confirmUsernameAndPassword(List<Customer> users, String username, String password) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userName.equals(username) && users.get(i).password.equals(password)){
                return users.get(i);
            }
        }
        return null;
    }
}
