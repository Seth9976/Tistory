package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent.OnFinished;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

public final class PendingIntentCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static int a(int v, boolean z) {
        if(z) {
            return Build.VERSION.SDK_INT < 0x1F ? v : v | 0x2000000;
        }
        return v | 0x4000000;
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context0, int v, @SuppressLint({"ArrayReturn"}) @NonNull Intent[] arr_intent, int v1, @Nullable Bundle bundle0, boolean z) {
        return PendingIntent.getActivities(context0, v, arr_intent, PendingIntentCompat.a(v1, z), bundle0);
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context0, int v, @SuppressLint({"ArrayReturn"}) @NonNull Intent[] arr_intent, int v1, boolean z) {
        return PendingIntent.getActivities(context0, v, arr_intent, PendingIntentCompat.a(v1, z));
    }

    @Nullable
    public static PendingIntent getActivity(@NonNull Context context0, int v, @NonNull Intent intent0, int v1, @Nullable Bundle bundle0, boolean z) {
        return PendingIntent.getActivity(context0, v, intent0, PendingIntentCompat.a(v1, z), bundle0);
    }

    @Nullable
    public static PendingIntent getActivity(@NonNull Context context0, int v, @NonNull Intent intent0, int v1, boolean z) {
        return PendingIntent.getActivity(context0, v, intent0, PendingIntentCompat.a(v1, z));
    }

    @Nullable
    public static PendingIntent getBroadcast(@NonNull Context context0, int v, @NonNull Intent intent0, int v1, boolean z) {
        return PendingIntent.getBroadcast(context0, v, intent0, PendingIntentCompat.a(v1, z));
    }

    @NonNull
    @RequiresApi(26)
    public static PendingIntent getForegroundService(@NonNull Context context0, int v, @NonNull Intent intent0, int v1, boolean z) {
        return r2.a(context0, v, intent0, PendingIntentCompat.a(v1, z));
    }

    @Nullable
    public static PendingIntent getService(@NonNull Context context0, int v, @NonNull Intent intent0, int v1, boolean z) {
        return PendingIntent.getService(context0, v, intent0, PendingIntentCompat.a(v1, z));
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent0, int v, @Nullable PendingIntent.OnFinished pendingIntent$OnFinished0, @Nullable Handler handler0) throws PendingIntent.CanceledException {
        s2 s20;
        try(t2 t20 = new t2(pendingIntent$OnFinished0)) {
            s20 = t20.b == null ? null : new s2(t20);
            pendingIntent0.send(v, s20, handler0);
        }
        t20.c = true;
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent0, @SuppressLint({"ContextFirst"}) @NonNull Context context0, int v, @NonNull Intent intent0, @Nullable PendingIntent.OnFinished pendingIntent$OnFinished0, @Nullable Handler handler0) throws PendingIntent.CanceledException {
        PendingIntentCompat.send(pendingIntent0, context0, v, intent0, pendingIntent$OnFinished0, handler0, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent0, @SuppressLint({"ContextFirst"}) @NonNull Context context0, int v, @NonNull Intent intent0, @Nullable PendingIntent.OnFinished pendingIntent$OnFinished0, @Nullable Handler handler0, @Nullable String s, @Nullable Bundle bundle0) throws PendingIntent.CanceledException {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        try {
            q2.a(pendingIntent0, context0, v, intent0, pendingIntent$OnFinished0, handler0, s, bundle0);
        }
        catch(Throwable throwable0) {
            try {
                countDownLatch0.countDown();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        countDownLatch0.countDown();
    }
}

