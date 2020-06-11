package com.phonestore;

public interface IConsultationChat {
    public void sendMessage(String msg, String userId);

    void addUser(Client user);
}
