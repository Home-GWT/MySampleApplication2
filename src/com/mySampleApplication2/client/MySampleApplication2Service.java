package com.mySampleApplication2.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("MySampleApplication2Service")
public interface MySampleApplication2Service extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use MySampleApplication2Service.App.getInstance() to access static instance of MySampleApplication2ServiceAsync
     */
    public static class App {
        private static MySampleApplication2ServiceAsync ourInstance = GWT.create(MySampleApplication2Service.class);

        public static synchronized MySampleApplication2ServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
