package _03_project_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project_03_Final {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        Actions action = new Actions();
        action.description.add(0, "Para_Yatir");
        action.description.add(1, "Para_Cek");
        action.description.add(2, "Transfer");
        action.description.add(3, "Cikis");

        Account hesap1 = new Account();
        hesap1.number = "1234";
        hesap1.fund = 100;

        Account hesap2 = new Account();
        hesap2.number = "4321";
        hesap2.fund = 200;

        Account hesap3 = new Account();
        hesap3.number = "5678";
        hesap3.fund = 1000;

        Account hesap4 = new Account();
        hesap4.number = "8765";
        hesap4.fund = 2000;

        Account hesap5 = new Account();
        hesap5.number = "9999";
        hesap5.fund = 500;

        Account hesap6 = new Account();
        hesap6.number = "1111";
        hesap6.fund = 400;

        ArrayList<Customer> musteriler = new ArrayList<>();

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        customer1.username = "User1";
        customer1.password = "password1";
        customer1.accounts.add(hesap1);
        customer1.accounts.add(hesap2);
        musteriler.add(customer1);

        customer2.username = "User2";
        customer2.password = "password2";
        customer2.accounts.add(hesap3);
        customer2.accounts.add(hesap4);
        musteriler.add(customer2);

        customer3.username = "User3";
        customer3.password = "password3";
        customer3.accounts.add(hesap5);
        customer3.accounts.add(hesap6);
        musteriler.add(customer3);

        Customer aktifKullanici;
        Account secilenHesap;

        while (true) {
            System.out.print("Please enter your username: ");
            String username = scanStr.nextLine();
            System.out.print("Please enter your password: ");
            String password = scanStr.nextLine();

            aktifKullanici = confirmUsernameAndPassword(musteriler, username, password);

            if (aktifKullanici != null) {
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        while (true) {
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < action.description.size(); i++) {
                System.out.println(action.description.get(i) + " - " + (i + 1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice) {

                case 1: {

                    while (true) {
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }
                        System.out.print("Lutfen para yatırmak istediginiz hesap numarasini giriniz...: ");
                        String secim = scanStr.nextLine();

                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);

                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.print("Lutfen yatirmak istediginiz para miktarini giriniz...: ");
                        int yatirilacakPara = scan.nextInt();
                        secilenHesap.fund += yatirilacakPara;
                        System.out.println(secilenHesap.number + " numaralı hesap; guncel bakiyeniz " + secilenHesap.fund + " €...");
                        break;
                    }
                    break;
                }

                case 2: {

                    while (true) {

                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }

                        System.out.print("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        String secim = scan.next();

                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);

                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.print("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        int cekilecekPara = scan.nextInt();

                        if (!withdraw(secilenHesap, cekilecekPara)) {
                            System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir...");
                            break;
                        }
                        secilenHesap.fund -= cekilecekPara;
                        System.out.println("Lutfen paranizi aliniz. " + secilenHesap.number + " numaralı hesabinizda toplam " + secilenHesap.fund + " € kalmistir...");
                        break;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                }
                case 4:
                    System.exit(1);

                default: {
                    System.out.println("Basarili bir secim yapmadiniz...");
                }

            }
        }
    }

    public static Customer confirmUsernameAndPassword(List<Customer> users, String username, String password) {

        for (Customer user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static Account confirmAccountNumber(Customer currentUser, String chosenAccount) {

        for (Account account : currentUser.accounts) {
            if (account.number.equals(chosenAccount)) {
                return account;
            }
        }
        return null;
    }

    public static boolean withdraw(Account chosenAccount, int amountToWithdraw) {
        for (int i = 0; i < 2; i++) {
            if (amountToWithdraw <= chosenAccount.fund) {
                return true;
            }
        }
        return false;
    }

}