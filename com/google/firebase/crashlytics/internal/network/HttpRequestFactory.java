package com.google.firebase.crashlytics.internal.network;

import java.util.Collections;
import java.util.Map;

public class HttpRequestFactory {
    public HttpGetRequest buildHttpGetRequest(String s) {
        return this.buildHttpGetRequest(s, Collections.emptyMap());
    }

    public HttpGetRequest buildHttpGetRequest(String s, Map map0) {
        return new HttpGetRequest(s, map0);
    }
}

