package DesignPattern.Adapter.AdapterForBanks;

import DesignPattern.Adapter.Banks.Bank;
import DesignPattern.Adapter.Banks.YesBank;

public class YesBankAdapter implements Bank {

    private YesBank yesBank;

    public YesBankAdapter(YesBank yesBank) {
        this.yesBank = yesBank;
    }

    @Override
    public void pay(int amount) {
        yesBank.sendPayment(amount);  // Adapting YesBank's method to fit the expected interface
    }
}
