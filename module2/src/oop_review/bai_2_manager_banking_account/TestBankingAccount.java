package oop_review.bai_2_manager_banking_account;

public class TestBankingAccount {
    public static void main(String[] args) {
        BankingAccount khoaAccount = new BankingAccount(012254, "Khoa", 20000000);
        System.out.println(khoaAccount);

        khoaAccount.topUp();
        System.out.println(khoaAccount);
    }
}
