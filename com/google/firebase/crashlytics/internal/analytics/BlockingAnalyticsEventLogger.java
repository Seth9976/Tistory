package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class BlockingAnalyticsEventLogger implements AnalyticsEventLogger, AnalyticsEventReceiver {
    public final CrashlyticsOriginAnalyticsEventLogger a;
    public final int b;
    public final TimeUnit c;
    public final Object d;
    public CountDownLatch e;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger0, int v, TimeUnit timeUnit0) {
        this.d = new Object();
        this.a = crashlyticsOriginAnalyticsEventLogger0;
        this.b = v;
        this.c = timeUnit0;
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String s, @Nullable Bundle bundle0) {
        synchronized(this.d) {
            Logger.getLogger().v("Logging event " + s + " to Firebase Analytics with params " + bundle0);
            this.e = new CountDownLatch(1);
            this.a.logEvent(s, bundle0);
            Logger.getLogger().v("Awaiting app exception callback from Analytics...");
            try {
                if(this.e.await(((long)this.b), this.c)) {
                    Logger.getLogger().v("App exception callback received from Analytics listener.");
                }
                else {
                    Logger.getLogger().w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            }
            catch(InterruptedException unused_ex) {
                Logger.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.e = null;
        }
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String s, @NonNull Bundle bundle0) {
        CountDownLatch countDownLatch0 = this.e;
        if(countDownLatch0 == null) {
            return;
        }
        if("_ae".equals(s)) {
            countDownLatch0.countDown();
        }
    }
}

