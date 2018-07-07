package com.epam.gwt.server;

import com.epam.gwt.client.services.AccountService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AccountServiceImpl extends RemoteServiceServlet implements AccountService {

    private final Map<String, String> users = new HashMap<String, String>() {{
        put("admin", "123");
        put("vasya", "321");
    }};

    @Override
    public boolean login(String userName, String password) {
        return Optional.ofNullable(users.get(userName))
                       .filter(password::equals)
                       .isPresent();
    }
}
