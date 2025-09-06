package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class Logger {
    public static final String TAG = "FirebaseCrashlytics";
    public final String a;
    public static final Logger b;

    static {
        Logger.b = new Logger("FirebaseCrashlytics");
    }

    public Logger(String s) {
        this.a = s;
    }

    public final boolean a(int v) {
        return 4 <= v || Log.isLoggable(this.a, v);
    }

    public void d(String s) {
        this.d(s, null);
    }

    public void d(String s, Throwable throwable0) {
        if(this.a(3)) {
            Log.d(this.a, s, throwable0);
        }
    }

    public void e(String s) {
        this.e(s, null);
    }

    public void e(String s, Throwable throwable0) {
        if(this.a(6)) {
            Log.e(this.a, s, throwable0);
        }
    }

    public static Logger getLogger() {
        return Logger.b;
    }

    public void i(String s) {
        this.i(s, null);
    }

    public void i(String s, Throwable throwable0) {
        if(this.a(4)) {
            Log.i(this.a, s, throwable0);
        }
    }

    public void log(int v, String s) {
        this.log(v, s, false);
    }

    public void log(int v, String s, boolean z) {
        if(z || this.a(v)) {
            Log.println(v, this.a, s);
        }
    }

    public void v(String s) [...] // 潜在的解密器

    public void v(String s, Throwable throwable0) {
        if(this.a(2)) {
            Log.v(this.a, s, throwable0);
        }
    }

    public void w(String s) {
        this.w(s, null);
    }

    public void w(String s, Throwable throwable0) {
        if(this.a(5)) {
            Log.w(this.a, s, throwable0);
        }
    }
}

