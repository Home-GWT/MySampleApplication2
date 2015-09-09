package com.mySampleApplication2.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication2.client.MySampleApplication2Service;

public class MySampleApplication2ServiceImpl extends RemoteServiceServlet implements MySampleApplication2Service {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi-2!\"";
    }
}