package estruturalPatterns.proxy;

import behavioralPatterns.state.ATMState;

public interface GetATMData {

    public ATMState getATMData();
    public int getCashInMachine();



}
