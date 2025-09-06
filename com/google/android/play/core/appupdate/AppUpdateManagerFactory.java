package com.google.android.play.core.appupdate;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.play.core.appupdate.internal.zzz;
import i8.c;

public final class AppUpdateManagerFactory {
    @NonNull
    public static AppUpdateManager create(@NonNull Context context0) {
        synchronized(zzb.class) {
            if(zzb.a == null) {
                zzab zzab0 = new zzab();  // 初始化器: Ljava/lang/Object;-><init>()V
                zzab0.zzb(new c(zzz.zza(context0)));
                zzb.a = zzab0.zza();
            }
        }
        return zzb.a.zza();
    }
}

