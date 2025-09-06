package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.FormatMethod;
import com.google.errorprone.annotations.FormatString;

@KeepForSdk
public final class GmsLogger {
    public final String a;
    public final String b;

    @KeepForSdk
    public GmsLogger(@NonNull String s) {
        this(s, null);
    }

    @KeepForSdk
    public GmsLogger(@NonNull String s, @Nullable String s1) {
        Preconditions.checkNotNull(s, "log tag cannot be null");
        Preconditions.checkArgument(s.length() <= 23, "tag \"%s\" is longer than the %d character maximum", new Object[]{s, 23});
        this.a = s;
        if(s1 != null && s1.length() > 0) {
            this.b = s1;
            return;
        }
        this.b = null;
    }

    public final String a(String s) {
        return this.b == null ? s : this.b + s;
    }

    @KeepForSdk
    public boolean canLog(int v) {
        return Log.isLoggable(this.a, v);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(@NonNull String s, @NonNull String s1) {
        if(this.canLog(3)) {
            Log.d(s, this.a(s1));
        }
    }

    @KeepForSdk
    public void d(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(3)) {
            Log.d(s, this.a(s1), throwable0);
        }
    }

    @KeepForSdk
    public void e(@NonNull String s, @NonNull String s1) {
        if(this.canLog(6)) {
            Log.e(s, this.a(s1));
        }
    }

    @KeepForSdk
    public void e(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(6)) {
            Log.e(s, this.a(s1), throwable0);
        }
    }

    @KeepForSdk
    @FormatMethod
    public void efmt(@NonNull String s, @NonNull @FormatString String s1, @NonNull Object[] arr_object) {
        if(this.canLog(6)) {
            String s2 = String.format(s1, arr_object);
            String s3 = this.b;
            if(s3 != null) {
                s2 = s3 + s2;
            }
            Log.e(s, s2);
        }
    }

    @KeepForSdk
    public void i(@NonNull String s, @NonNull String s1) {
        if(this.canLog(4)) {
            Log.i(s, this.a(s1));
        }
    }

    @KeepForSdk
    public void i(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(4)) {
            Log.i(s, this.a(s1), throwable0);
        }
    }

    @KeepForSdk
    public void pii(@NonNull String s, @NonNull String s1) {
    }

    @KeepForSdk
    public void pii(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
    }

    @KeepForSdk
    public void v(@NonNull String s, @NonNull String s1) {
        if(this.canLog(2)) {
            Log.v(s, this.a(s1));
        }
    }

    @KeepForSdk
    public void v(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(2)) {
            Log.v(s, this.a(s1), throwable0);
        }
    }

    @KeepForSdk
    public void w(@NonNull String s, @NonNull String s1) {
        if(this.canLog(5)) {
            Log.w(s, this.a(s1));
        }
    }

    @KeepForSdk
    public void w(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(5)) {
            Log.w(s, this.a(s1), throwable0);
        }
    }

    @KeepForSdk
    @FormatMethod
    public void wfmt(@NonNull String s, @NonNull @FormatString String s1, @NonNull Object[] arr_object) {
        if(this.canLog(5)) {
            String s2 = String.format(s1, arr_object);
            String s3 = this.b;
            if(s3 != null) {
                s2 = s3 + s2;
            }
            Log.w(this.a, s2);
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
        if(this.canLog(7)) {
            Log.e(s, this.a(s1), throwable0);
            Log.wtf(s, this.a(s1), throwable0);
        }
    }
}

