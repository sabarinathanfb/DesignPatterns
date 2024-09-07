package DesignPattern.Adapter.AdapterForBanks;

import DesignPattern.Adapter.Banks.Bank;
import DesignPattern.Adapter.Banks.ICICIBank;

public class ICICIBankAdapter implements Bank {
    private ICICIBank iciciBank;

    public ICICIBankAdapter(ICICIBank iciciBank) {
        this.iciciBank = iciciBank;
    }

    @Override
    public void pay(int amount) {
        iciciBank.makeTransaction(amount);  // Adapting ICICI's method to fit the expected interface
    }
}
