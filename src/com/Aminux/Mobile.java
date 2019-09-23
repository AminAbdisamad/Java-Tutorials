package com.Aminux;

public abstract class Mobile {
    private String model;
    private String EIMICode;
    private String SIMCard;
    private int internalMemory;
    private  boolean isSingleCard;
    Mobile(String model, String EIMICode, String SIMCard, int internalMemory, boolean isSingleCard){
        this.model = model;
        this.EIMICode = EIMICode;
        this.SIMCard = SIMCard;
        this.internalMemory = internalMemory;
        this.isSingleCard = isSingleCard;
    }
    public void mobileInfo(){
        final String Card = isSingleCard ? "Single SIMCard" : "Double SIMCard";
//        String Card;
//        if(isSingleCard){
//        Card = "Single SIM";
//        }else{
//            Card = "Double SIM";
//        }

        System.out.println("Mobile Information \n Model  "+model+" EIMICode "+EIMICode+" SIMCard Number "+SIMCard+" And has an internal memory of "+internalMemory+ "GB And it's "+Card );
    }
    public void WIFI(){
        System.out.println("Internet Connected!!");
    }
    public void sendMessage(){
        System.out.println("Message Sent!");
    }
    public void receiveMessage(){
        System.out.println("Message Received!");
    }
    public void shutDown(){
        System.out.println("1 2 3 shutting down!!!");
    }
    public abstract void receiveCall();


}
