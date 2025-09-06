package com.google.firebase.messaging;

import java.util.Locale;

public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN;
    public final int a;

    public SendException(String s) {
        int v = 4;
        super(s);
        if(s == null) {
            v = 0;
        }
        else {
            String s1 = s.toLowerCase(Locale.US);
            s1.getClass();
            switch(s1) {
                case "invalid_parameters": {
                    break;
                }
                case "messagetoobig": {
                    v = 2;
                    this.a = v;
                    return;
                }
                case "missing_to": {
                    break;
                }
                case "service_not_available": {
                    v = 3;
                    this.a = v;
                    return;
                }
                case "toomanymessages": {
                    this.a = v;
                    return;
                }
                default: {
                    v = 0;
                    this.a = v;
                    return;
                }
            }
            v = 1;
        }
        this.a = v;
    }

    public int getErrorCode() {
        return this.a;
    }
}

