package com.google.firebase.crashlytics.internal.common;

import androidx.appcompat.app.w0;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class h implements Callable {
    public final long a;
    public final Throwable b;
    public final Thread c;
    public final SettingsProvider d;
    public final boolean e;
    public final l f;

    public h(l l0, long v, Throwable throwable0, Thread thread0, SettingsProvider settingsProvider0, boolean z) {
        this.f = l0;
        this.a = v;
        this.b = throwable0;
        this.c = thread0;
        this.d = settingsProvider0;
        this.e = z;
    }

    @Override
    public final Object call() {
        long v = this.a;
        l l0 = this.f;
        String s = l0.f();
        if(s == null) {
            Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
            return Tasks.forResult(null);
        }
        l0.c.b();
        l0.l.persistFatalEvent(this.b, this.c, s, v / 1000L);
        l0.d(v);
        SettingsProvider settingsProvider0 = this.d;
        l0.c(false, settingsProvider0);
        new c(l0.f);
        l.a(l0, c.b);
        if(!l0.b.isAutomaticDataCollectionEnabled()) {
            return Tasks.forResult(null);
        }
        Executor executor0 = l0.e.getExecutor();
        return settingsProvider0.getSettingsAsync().onSuccessTask(executor0, new w0(this, executor0, s));
    }
}

