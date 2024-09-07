package DesignPattern.Adapter;

import DesignPattern.Adapter.AdapterForBanks.ICICIBankAdapter;
import DesignPattern.Adapter.AdapterForBanks.YesBankAdapter;
import DesignPattern.Adapter.Banks.Bank;
import DesignPattern.Adapter.Banks.ICICIBank;
import DesignPattern.Adapter.Banks.YesBank;

public class PhonePe {

    private Bank bank;
    public PhonePe(Bank bank){
        this.bank = bank;
    }

    public void makePayment(int amount){
        bank.pay(amount);
    }

    public static void main(String[] args) {

        YesBank yesBank = new YesBank();
        Bank yesBankAdapter = new YesBankAdapter(yesBank);
        PhonePe phonePe = new PhonePe(yesBankAdapter);
        phonePe.makePayment(100);

        ICICIBank iciciBank = new ICICIBank();
        Bank iciciBankAdapter = new ICICIBankAdapter(iciciBank);
        PhonePe phonePeICICI = new PhonePe(iciciBankAdapter);
        phonePeICICI.makePayment(200);
    }
}
