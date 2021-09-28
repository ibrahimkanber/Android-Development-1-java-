package com.ibrahim.landmarkbookjava;

public class Singleton {
    private Landmark sentLandmark;
    private  static Singleton singleton;
    private Singleton() {

    }

    public Landmark getSentLandmark(){
        System.out.println("sentLandmark====>"+this.sentLandmark.name);
        return sentLandmark;
    }

    public void setSentLandmark(Landmark setSentLandmark){
        this.sentLandmark=setSentLandmark;
        System.out.println("attt"+setSentLandmark.name);
    }

    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
