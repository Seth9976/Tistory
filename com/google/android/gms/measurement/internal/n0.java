package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class n0 implements Application.ActivityLifecycleCallbacks {
    public final zzhx a;

    public n0(zzhx zzhx0) {
        this.a = zzhx0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        zzfr zzfr0;
        zzhx zzhx0;
        try {
            try {
                zzhx0 = this.a;
                zzhx0.zzt.zzay().zzj().zza("onActivityCreated");
                Intent intent0 = activity0.getIntent();
                if(intent0 == null) {
                    zzfr0 = zzhx0.zzt;
                }
                else {
                    Uri uri0 = intent0.getData();
                    if(uri0 != null && uri0.isHierarchical()) {
                        zzhx0.zzt.zzv();
                        String s = intent0.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String s1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(s) || "https://www.google.com".equals(s) || "android-app://com.google.appcrawler".equals(s) ? "gs" : "auto";
                        String s2 = uri0.getQueryParameter("referrer");
                        zzhx0.zzt.zzaz().zzp(new j0(this, bundle0 == null, uri0, s1, s2));
                    }
                    goto label_19;
                }
                goto label_24;
            }
            catch(RuntimeException runtimeException0) {
                zzhx0.zzt.zzay().zzd().zzb("Throwable caught in onActivityCreated", runtimeException0);
            }
        label_19:
            zzfr0 = zzhx0.zzt;
        }
        catch(Throwable throwable0) {
            zzhx0.zzt.zzs().zzr(activity0, bundle0);
            throw throwable0;
        }
    label_24:
        zzfr0.zzs().zzr(activity0, bundle0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.a.zzt.zzs().zzs(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.a.zzt.zzs().zzt(activity0);
        zzkc zzkc0 = this.a.zzt.zzu();
        long v = zzkc0.zzt.zzav().elapsedRealtime();
        zzkc0.zzt.zzaz().zzp(new e1(zzkc0, v, 1));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        zzkc zzkc0 = this.a.zzt.zzu();
        long v = zzkc0.zzt.zzav().elapsedRealtime();
        zzkc0.zzt.zzaz().zzp(new e1(zzkc0, v, 0));
        this.a.zzt.zzs().zzu(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.a.zzt.zzs().zzv(activity0, bundle0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

