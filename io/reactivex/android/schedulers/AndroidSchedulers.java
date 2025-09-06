package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import cd.n;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import zc.d;

public final class AndroidSchedulers {
    public static final Scheduler a;

    static {
        AndroidSchedulers.a = RxAndroidPlugins.initMainThreadScheduler(new n(6));
    }

    public static Scheduler from(Looper looper0) {
        return AndroidSchedulers.from(looper0, false);
    }

    @SuppressLint({"NewApi"})
    public static Scheduler from(Looper looper0, boolean z) {
        if(looper0 == null) {
            throw new NullPointerException("looper == null");
        }
        return new d(new Handler(looper0), z);
    }

    public static Scheduler mainThread() {
        return RxAndroidPlugins.onMainThreadScheduler(AndroidSchedulers.a);
    }
}

