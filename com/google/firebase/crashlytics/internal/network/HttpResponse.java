package com.google.firebase.crashlytics.internal.network;

public class HttpResponse {
    public final int a;
    public final String b;

    public HttpResponse(int v, String s) {
        this.a = v;
        this.b = s;
    }

    public String body() {
        return this.b;
    }

    public int code() {
        return this.a;
    }
}

