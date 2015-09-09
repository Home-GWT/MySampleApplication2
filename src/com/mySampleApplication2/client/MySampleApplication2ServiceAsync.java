package com.mySampleApplication2.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MySampleApplication2ServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
