package com.Aminux;

public class Nokia extends Mobile {
    Nokia(String model, String EIMICode, String SIMCard, int internalMemory, boolean isSingleCard) {
        super(model, EIMICode, SIMCard, internalMemory, isSingleCard);
    }

    @Override
    public void receiveCall() {

    }

}
