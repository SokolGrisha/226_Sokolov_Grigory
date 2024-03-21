package com.example.GriSok226;

class PlayMu{
    private Music m;
    public PlayMu(Music letsplaythis){
        this.m=letsplaythis;
    }
    public void playM(){
        System.out.println("Playing now: "+m.toString());
    }
}
