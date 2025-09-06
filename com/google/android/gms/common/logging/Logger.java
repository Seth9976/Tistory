package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
public class Logger {
    public final String a;
    public final String b;
    public final int c;

    @KeepForSdk
    public Logger(@NonNull String s, @NonNull String[] arr_s) {
        String s1;
        if(arr_s.length == 0) {
            s1 = "";
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append('[');
            for(int v = 0; v < arr_s.length; ++v) {
                String s2 = arr_s[v];
                if(stringBuilder0.length() > 1) {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(s2);
            }
            stringBuilder0.append("] ");
            s1 = stringBuilder0.toString();
        }
        super();
        this.b = s1;
        this.a = s;
        new GmsLogger(s);
        int v1;
        for(v1 = 2; v1 <= 7 && !Log.isLoggable(this.a, v1); ++v1) {
        }
        this.c = v1;
    }

    @KeepForSdk
    public void d(@NonNull String s, @NonNull Object[] arr_object) {
        if(this.isLoggable(3)) {
            String s1 = this.format(s, arr_object);
            Log.d(this.a, s1);
        }
    }

    @KeepForSdk
    public void e(@NonNull String s, @NonNull Throwable throwable0, @NonNull Object[] arr_object) {
        String s1 = this.format(s, arr_object);
        Log.e(this.a, s1, throwable0);
    }

    @KeepForSdk
    public void e(@NonNull String s, @NonNull Object[] arr_object) {
        String s1 = this.format(s, arr_object);
        Log.e(this.a, s1);
    }

    @NonNull
    @KeepForSdk
    public String format(@NonNull String s, @NonNull Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            s = String.format(Locale.US, s, arr_object);
        }
        return this.b + s;
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.a;
    }

    @KeepForSdk
    public void i(@NonNull String s, @NonNull Object[] arr_object) {
        String s1 = this.format(s, arr_object);
        Log.i(this.a, s1);
    }

    @KeepForSdk
    public boolean isLoggable(int v) {
        return this.c <= v;
    }

    @KeepForSdk
    public void v(@NonNull String s, @NonNull Throwable throwable0, @NonNull Object[] arr_object) {
        if(this.isLoggable(2)) {
            String s1 = this.format(s, arr_object);
            Log.v(this.a, s1, throwable0);
        }
    }

    @KeepForSdk
    public void v(@NonNull String s, @NonNull Object[] arr_object) {
        if(this.isLoggable(2)) {
            String s1 = this.format(s, arr_object);
            Log.v(this.a, s1);
        }
    }

    @KeepForSdk
    public void w(@NonNull String s, @NonNull Object[] arr_object) {
        String s1 = this.format(s, arr_object);
        Log.w(this.a, s1);
    }

    @KeepForSdk
    public void wtf(@NonNull String s, @NonNull Throwable throwable0, @NonNull Object[] arr_object) {
        String s1 = this.format(s, arr_object);
        Log.wtf(this.a, s1, throwable0);
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable throwable0) {
        Log.wtf(this.a, throwable0);
    }
}

