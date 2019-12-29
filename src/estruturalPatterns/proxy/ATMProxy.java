package estruturalPatterns.proxy;

import behavioralPatterns.ATMMachine;
import behavioralPatterns.ATMState;

public class ATMProxy implements GetATMData{


    @Override
    public ATMState getATMData() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getATMData();
    }

    @Override
    public int getCashInMachine() {

        ATMMachine realATMMachine = new ATMMachine();

        return  realATMMachine.getCashInMachine();

    }
}
