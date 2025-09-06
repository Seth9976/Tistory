package androidx.core.provider;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.o;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import androidx.work.impl.utils.PackageManagerHelper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;
import com.google.android.gms.common.api.internal.zzd;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.b;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import r8.c;

public final class q implements Runnable {
    public final int a;
    public Object b;
    public Object c;
    public Object d;

    public q() {
        this.a = 0;
        super();
    }

    public q(Intent intent0, Context context0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        this.a = 1;
        super();
        this.b = intent0;
        this.c = context0;
        this.d = broadcastReceiver$PendingResult0;
    }

    public q(Object object0, Object object1, int v, Object object2) {
        this.a = v;
        this.d = object0;
        this.b = object1;
        this.c = object2;
        super();
    }

    @Override
    public final void run() {
        Object object0;
        switch(this.a) {
            case 0: {
                try {
                    object0 = null;
                    object0 = ((j)this.b).call();
                }
                catch(Exception unused_ex) {
                }
                o o0 = new o(3, ((k)this.c), object0);
                ((Handler)this.d).post(o0);
                return;
            }
            case 1: {
                BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = (BroadcastReceiver.PendingResult)this.d;
                Context context0 = (Context)this.c;
                Intent intent0 = (Intent)this.b;
                try {
                    boolean z = intent0.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean z1 = intent0.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean z2 = intent0.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean z3 = intent0.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    Logger.get().debug("WM-ConstrntProxyUpdtRec", "Updating proxies: (BatteryNotLowProxy (" + z + "), BatteryChargingProxy (" + z1 + "), StorageNotLowProxy (" + z2 + "), NetworkStateProxy (" + z3 + "), ");
                    PackageManagerHelper.setComponentEnabled(context0, ConstraintProxy.BatteryNotLowProxy.class, z);
                    PackageManagerHelper.setComponentEnabled(context0, ConstraintProxy.BatteryChargingProxy.class, z1);
                    PackageManagerHelper.setComponentEnabled(context0, ConstraintProxy.StorageNotLowProxy.class, z2);
                    PackageManagerHelper.setComponentEnabled(context0, ConstraintProxy.NetworkStateProxy.class, z3);
                }
                finally {
                    broadcastReceiver$PendingResult0.finish();
                }
                return;
            }
            case 2: {
                zzb zzb0 = (zzb)this.d;
                int v1 = zzb0.b;
                LifecycleCallback lifecycleCallback0 = (LifecycleCallback)this.b;
                if(v1 > 0) {
                    lifecycleCallback0.onCreate((zzb0.c == null ? null : zzb0.c.getBundle(((String)this.c))));
                }
                if(zzb0.b >= 2) {
                    lifecycleCallback0.onStart();
                }
                if(zzb0.b >= 3) {
                    lifecycleCallback0.onResume();
                }
                if(zzb0.b >= 4) {
                    lifecycleCallback0.onStop();
                }
                if(zzb0.b >= 5) {
                    lifecycleCallback0.onDestroy();
                }
                return;
            }
            case 3: {
                zzd zzd0 = (zzd)this.d;
                int v2 = zzd0.A;
                LifecycleCallback lifecycleCallback1 = (LifecycleCallback)this.b;
                if(v2 > 0) {
                    lifecycleCallback1.onCreate((zzd0.B == null ? null : zzd0.B.getBundle(((String)this.c))));
                }
                if(zzd0.A >= 2) {
                    lifecycleCallback1.onStart();
                }
                if(zzd0.A >= 3) {
                    lifecycleCallback1.onResume();
                }
                if(zzd0.A >= 4) {
                    lifecycleCallback1.onStop();
                }
                if(zzd0.A >= 5) {
                    lifecycleCallback1.onDestroy();
                }
                return;
            }
            case 4: {
                Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can\'t be executed in the main thread");
                Bitmap bitmap0 = null;
                Uri uri0 = (Uri)this.b;
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)this.c;
                if(parcelFileDescriptor0 != null) {
                    try {
                        bitmap0 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor0.getFileDescriptor());
                    }
                    catch(OutOfMemoryError outOfMemoryError0) {
                        Log.e("ImageManager", "OOM while loading bitmap for uri: " + uri0, outOfMemoryError0);
                    }
                    try {
                        parcelFileDescriptor0.close();
                    }
                    catch(IOException iOException0) {
                        Log.e("ImageManager", "closed failed", iOException0);
                    }
                }
                CountDownLatch countDownLatch0 = new CountDownLatch(1);
                ((ImageManager)this.d).b.post(new b(((ImageManager)this.d), uri0, bitmap0, countDownLatch0));
                try {
                    countDownLatch0.await();
                }
                catch(InterruptedException unused_ex) {
                    Log.w("ImageManager", "Latch interrupted while posting " + uri0);
                }
                return;
            }
            case 5: {
                ((BadgeDrawable)this.d).updateBadgeCoordinates(((View)this.b), ((FrameLayout)this.c));
                return;
            }
            default: {
                c c0 = (c)this.d;
                CrashlyticsReportWithSessionId crashlyticsReportWithSessionId0 = (CrashlyticsReportWithSessionId)this.b;
                c0.b(crashlyticsReportWithSessionId0, ((TaskCompletionSource)this.c));
                c0.h.resetDroppedOnDemandExceptions();
                double f = (double)c0.a();
                double f1 = Math.min(3600000.0, Math.pow(c0.b, f) * (60000.0 / c0.a));
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Delay for: " + String.format(Locale.US, "%.2f", ((double)(f1 / 1000.0))) + " s for report: " + crashlyticsReportWithSessionId0.getSessionId());
                try {
                    Thread.sleep(((long)f1));
                }
                catch(InterruptedException unused_ex) {
                }
            }
        }
    }
}

