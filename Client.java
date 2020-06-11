package com.phonestore;

public abstract class Client {
    private IConsultationChat mediator;

    private String id;
    private String name;

    public Client(IConsultationChat room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public IConsultationChat getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
