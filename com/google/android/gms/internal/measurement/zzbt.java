package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
public final class zzbt {
    public static final Method a;
    public static final Method b;

    static {
        Method method1;
        Method method0 = null;
        try {
            method1 = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        }
        catch(NoSuchMethodException unused_ex) {
            if(Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method1 = null;
        }
        try {
            zzbt.a = method1;
            method0 = UserHandle.class.getDeclaredMethod("myUserId", null);
        }
        catch(NoSuchMethodException unused_ex) {
            if(Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        zzbt.b = method0;
    }

    public static int zza(Context context0, JobInfo jobInfo0, String s, String s1) {
        int v;
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        jobScheduler0.getClass();
        Method method0 = zzbt.a;
        if(method0 != null && context0.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            Method method1 = zzbt.b;
            if(method1 == null) {
                v = 0;
            }
            else {
                try {
                    Integer integer0 = (Integer)method1.invoke(UserHandle.class, null);
                    v = integer0 == null ? 0 : ((int)integer0);
                }
                catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                    if(Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", illegalAccessException0);
                    }
                    v = 0;
                }
            }
            if(method0 != null) {
                try {
                    Integer integer1 = (Integer)method0.invoke(jobScheduler0, jobInfo0, "com.google.android.gms", v, "UploadAlarm");
                    return integer1 == null ? 0 : ((int)integer1);
                }
                catch(IllegalAccessException | InvocationTargetException illegalAccessException1) {
                    Log.e("UploadAlarm", "error calling scheduleAsPackage", illegalAccessException1);
                }
            }
            return jobScheduler0.schedule(jobInfo0);
        }
        return jobScheduler0.schedule(jobInfo0);
    }
}

