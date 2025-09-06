package com.google.firebase.installations;

import com.google.firebase.installations.remote.TokenResult.ResponseCode;

public abstract class e {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] arr_v = new int[ResponseCode.values().length];
        e.b = arr_v;
        try {
            arr_v[ResponseCode.OK.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ResponseCode.BAD_CONFIG.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ResponseCode.AUTH_ERROR.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values().length];
        e.a = arr_v1;
        try {
            arr_v1[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

