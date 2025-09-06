package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.PersistableBundle;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;

public final class zzkf extends m1 {
    public final AlarmManager b;
    public h1 c;
    public Integer d;

    public zzkf(zzkt zzkt0) {
        super(zzkt0);
        this.b = (AlarmManager)this.zzt.zzau().getSystemService("alarm");
    }

    public final int a() {
        if(this.d == null) {
            this.d = 0xB5E9638C;
        }
        return (int)this.d;
    }

    public final g b() {
        if(this.c == null) {
            this.c = new h1(this, this.zzf.l, 1);
        }
        return this.c;
    }

    public final void zza() {
        this.zzW();
        a.B(this.zzt, "Unscheduling upload");
        AlarmManager alarmManager0 = this.b;
        if(alarmManager0 != null) {
            Context context0 = this.zzt.zzau();
            alarmManager0.cancel(PendingIntent.getBroadcast(context0, 0, new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza));
        }
        this.b().a();
        JobScheduler jobScheduler0 = (JobScheduler)this.zzt.zzau().getSystemService("jobscheduler");
        if(jobScheduler0 != null) {
            jobScheduler0.cancel(this.a());
        }
    }

    @Override  // com.google.android.gms.measurement.internal.m1
    public final boolean zzb() {
        AlarmManager alarmManager0 = this.b;
        if(alarmManager0 != null) {
            Context context0 = this.zzt.zzau();
            alarmManager0.cancel(PendingIntent.getBroadcast(context0, 0, new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza));
        }
        JobScheduler jobScheduler0 = (JobScheduler)this.zzt.zzau().getSystemService("jobscheduler");
        if(jobScheduler0 != null) {
            jobScheduler0.cancel(this.a());
        }
        return false;
    }

    public final void zzd(long v) {
        this.zzW();
        Context context0 = this.zzt.zzau();
        if(!zzlb.x(context0)) {
            this.zzt.zzay().zzc().zza("Receiver not registered/enabled");
        }
        Preconditions.checkNotNull(context0);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                goto label_10;
            }
            else {
                ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementJobService"), 0);
                if(serviceInfo0 == null) {
                    goto label_10;
                }
                else if(!serviceInfo0.enabled) {
                    goto label_10;
                }
            }
            goto label_11;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    label_10:
        this.zzt.zzay().zzc().zza("Service not registered/enabled");
    label_11:
        this.zza();
        this.zzt.zzay().zzj().zzb("Scheduling upload, millis", v);
        this.zzt.zzav().elapsedRealtime();
        if(v < Math.max(0L, ((long)(((Long)zzdu.zzw.zza(null))))) && this.b().c == 0L) {
            this.b().c(v);
        }
        Context context1 = this.zzt.zzau();
        ComponentName componentName0 = new ComponentName(context1, "com.google.android.gms.measurement.AppMeasurementJobService");
        int v1 = this.a();
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzbt.zza(context1, new JobInfo.Builder(v1, componentName0).setMinimumLatency(v).setOverrideDeadline(v + v).setExtras(persistableBundle0).build(), "com.google.android.gms", "UploadAlarm");
    }
}

