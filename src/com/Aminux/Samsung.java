package com.Aminux;

class Samsung extends Mobile implements CameraHD{

    Samsung(String model, String EIMICode, String SIMCard, int internalMemory, boolean isSingleCard) {
        super(model, EIMICode, SIMCard, internalMemory, isSingleCard);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receive calls on Samsung!!");
    }

    void noteTen(){
        System.out.println("This is the last note version Note-12 brought to you by Samsung!!");
    }

    @Override
    public void shoot() {
            System.out.println("Congrats! Your Phone has HD Camera");
    }
}
