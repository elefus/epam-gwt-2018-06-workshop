package com.epam.gwt.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("accounts")
public interface AccountService extends RemoteService {

    boolean login(String userName, String password);
}
