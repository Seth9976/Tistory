package com.google.firebase.crashlytics.internal.common;

public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public static int parse(int v) {
        if(v >= 200 && v <= 299) {
            return 0;
        }
        if(v >= 300 && v <= 0x18F) {
            return 1;
        }
        return v < 400 || v > 0x1F3 ? 1 : 0;
    }
}

