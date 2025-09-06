package com.google.android.play.core.appupdate.internal;

import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Locale;
import kotlin.text.q;

public final class zzm {
    public final String a;

    public zzm(String s) {
        this.a = q.o("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ") + s;
    }

    public static String a(String s, String s1, Object[] arr_object) {
        if(arr_object.length > 0) {
            s1 = String.format(Locale.US, s1, arr_object);
        }
        return s + " : " + s1;
    }

    // 去混淆评级： 低(20)
    public final int zza(String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 3) ? Log.d("PlayCore", zzm.a(this.a, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzb(String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", zzm.a(this.a, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzc(Throwable throwable0, String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", zzm.a(this.a, s, arr_object), throwable0) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzd(String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 4) ? Log.i("PlayCore", zzm.a(this.a, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zze(String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 5) ? Log.w("PlayCore", zzm.a(this.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", arr_object)) : 0;
    }
}

