package _02_Batch3_Project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project_02_Final {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));
        List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> accounts = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> funds = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("Kullanici adinizi giriniz : ");
            String username = scanStr.nextLine();
            System.out.print("Sifrenizi giriniz : ");
            String password = scanStr.nextLine();

            isCorrect = confirmUsernameAndPassword(users, passwords, username, password);

            if (!isCorrect) {
                System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Lütfen tekrar deneyin.. ");
            } else {
                System.out.println("Basarili bir sekilde giris yaptiniz.");
            }
        }

        while (true) {
            System.out.println("Yapmak istediginiz islemi seciniz..:");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }

            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz");
                    break;
                case 2:
                    System.out.println("accounts = " + accounts);
                    System.out.print("Hangi hesaptan para cekmek istiyorsunuz?\nPara cekmek istediginiz hesap numarasını tuslayiniz : ");
                    String choosenAccount = scanStr.nextLine();
                    System.out.println("Cekmek istediginiz miktari giriniz : ");
                    int amountToWithdraw = scan.nextInt();
                    withdraw(accounts, funds, choosenAccount, amountToWithdraw);
                    break;
                case 3:
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Basarili bir secim yapmadiniz...");
            }
        }
    }

    private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {

        boolean flag = false;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(chosenAccount) && funds.get(i) >= amountToWithdraw) {
                flag = true;
                funds.set(i, funds.get(i) - amountToWithdraw);
                System.out.println("Isleminiz gerceklestirilmistir. Mevcut bakiyeniz = " + funds.get(i));
                break;
            }
        }

        if (!flag) {
            System.out.println("Beklenmedik bir hata olustu...Iyi gunler dileriz...");
        }
    }

    private static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String username, String password) {

        boolean isCorrect = false;

        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i)) && password.equals(passwords.get(i))) {
                isCorrect = true;
                break;
            }
        }
        return isCorrect;
    }
}