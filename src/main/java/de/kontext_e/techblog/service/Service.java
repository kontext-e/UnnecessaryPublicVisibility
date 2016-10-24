package de.kontext_e.techblog.service;

public class Service {

    public void calledFromDifferentPackage(){
        onlyCalledInPackage();
    }

    public void onlyCalledInPackage(){}
}
