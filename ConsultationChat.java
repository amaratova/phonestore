package com.phonestore;

import java.util.HashMap;
import java.util.Map;

public class ConsultationChat implements IConsultationChat{
    private Map<String, Client> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId)
    {
        Client u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(Client user) {
        this.usersMap.put(user.getId(), user);
    }
}
