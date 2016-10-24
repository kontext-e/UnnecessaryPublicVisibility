package de.kontext_e.techblog.client;

import de.kontext_e.techblog.service.Service;

public class Client {

    public void call() {
        new Service().calledFromDifferentPackage();
    }
}
