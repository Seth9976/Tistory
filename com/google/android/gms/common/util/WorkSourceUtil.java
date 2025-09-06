package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
public class WorkSourceUtil {
    public static final int a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;

    static {
        Method method7;
        Method method6;
        Method method5;
        Method method4;
        Method method3;
        Method method2;
        Class class1;
        Method method1;
        Class class0 = WorkSource.class;
        WorkSourceUtil.a = Process.myUid();
        Method method0 = null;
        try {
            method1 = null;
            method1 = class0.getMethod("add", Integer.TYPE);
        }
        catch(Exception unused_ex) {
        }
        try {
            WorkSourceUtil.b = method1;
            class1 = String.class;
            method2 = null;
            method2 = class0.getMethod("add", Integer.TYPE, class1);
        }
        catch(Exception unused_ex) {
        }
        try {
            WorkSourceUtil.c = method2;
            method3 = null;
            method3 = class0.getMethod("size", null);
        }
        catch(Exception unused_ex) {
        }
        try {
            WorkSourceUtil.d = method3;
            method4 = null;
            method4 = class0.getMethod("get", Integer.TYPE);
        }
        catch(Exception unused_ex) {
        }
        try {
            WorkSourceUtil.e = method4;
            method5 = null;
            method5 = class0.getMethod("getName", Integer.TYPE);
        }
        catch(Exception unused_ex) {
        }
        try {
            WorkSourceUtil.f = method5;
            method6 = class0.getMethod("createWorkChain", null);
        }
        catch(Exception exception0) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", exception0);
            method6 = null;
        }
        try {
            WorkSourceUtil.g = method6;
            method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, class1);
        }
        catch(Exception exception1) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", exception1);
            method7 = null;
        }
        try {
            WorkSourceUtil.h = method7;
            method0 = class0.getMethod("isEmpty", null);
            method0.setAccessible(true);
        }
        catch(Exception unused_ex) {
        }
        WorkSourceUtil.i = method0;
    }

    @KeepForSdk
    public static void add(@NonNull WorkSource workSource0, int v, @NonNull String s) {
        Method method0 = WorkSourceUtil.c;
        if(method0 != null) {
            if(s == null) {
                s = "";
            }
            try {
                method0.invoke(workSource0, v, s);
            }
            catch(Exception exception0) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception0);
            }
            return;
        }
        Method method1 = WorkSourceUtil.b;
        if(method1 != null) {
            try {
                method1.invoke(workSource0, v);
            }
            catch(Exception exception1) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception1);
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackage(@NonNull Context context0, @NonNull String s) {
        ApplicationInfo applicationInfo0;
        if(context0 != null && context0.getPackageManager() != null && s != null) {
            try {
                applicationInfo0 = Wrappers.packageManager(context0).getApplicationInfo(s, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.e("WorkSourceUtil", "Could not find package: " + s);
                return null;
            }
            if(applicationInfo0 == null) {
                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: " + s);
                return null;
            }
            int v = applicationInfo0.uid;
            WorkSource workSource0 = new WorkSource();
            WorkSourceUtil.add(workSource0, v, s);
            return workSource0;
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(@NonNull Context context0, @NonNull String s, @NonNull String s1) {
        ApplicationInfo applicationInfo0;
        int v;
        if(context0 != null && context0.getPackageManager() != null && s1 != null && s != null) {
            try {
                v = -1;
                applicationInfo0 = Wrappers.packageManager(context0).getApplicationInfo(s, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.e("WorkSourceUtil", "Could not find package: " + s);
                goto label_10;
            }
            if(applicationInfo0 == null) {
                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: " + s);
            }
            else {
                v = applicationInfo0.uid;
            }
        label_10:
            if(v < 0) {
                return null;
            }
            WorkSource workSource0 = new WorkSource();
            Method method0 = WorkSourceUtil.g;
            if(method0 != null) {
                Method method1 = WorkSourceUtil.h;
                if(method1 != null) {
                    try {
                        Object object0 = method0.invoke(workSource0, null);
                        int v1 = WorkSourceUtil.a;
                        if(v != v1) {
                            method1.invoke(object0, v, s);
                        }
                        method1.invoke(object0, v1, s1);
                        return workSource0;
                    }
                    catch(Exception exception0) {
                    }
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", exception0);
                    return workSource0;
                }
            }
            WorkSourceUtil.add(workSource0, v, s);
            return workSource0;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    @KeepForSdk
    public static int get(@NonNull WorkSource workSource0, int v) {
        Method method0 = WorkSourceUtil.e;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(workSource0, v);
                Preconditions.checkNotNull(object0);
                return (int)(((Integer)object0));
            }
            catch(Exception exception0) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception0);
            }
        }
        return 0;
    }

    @NonNull
    @KeepForSdk
    public static String getName(@NonNull WorkSource workSource0, int v) {
        Method method0 = WorkSourceUtil.f;
        if(method0 != null) {
            try {
                return (String)method0.invoke(workSource0, v);
            }
            catch(Exception exception0) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception0);
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static List getNames(@NonNull WorkSource workSource0) {
        List list0 = new ArrayList();
        int v1 = workSource0 == null ? 0 : WorkSourceUtil.size(workSource0);
        if(v1 != 0) {
            for(int v = 0; v < v1; ++v) {
                String s = WorkSourceUtil.getName(workSource0, v);
                if(!Strings.isEmptyOrWhitespace(s)) {
                    Preconditions.checkNotNull(s);
                    ((ArrayList)list0).add(s);
                }
            }
        }
        return list0;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(@NonNull Context context0) {
        if(context0 == null) {
            return false;
        }
        return context0.getPackageManager() == null ? false : Wrappers.packageManager(context0).checkPermission("android.permission.UPDATE_DEVICE_STATS", "net.daum.android.tistoryapp") == 0;
    }

    @KeepForSdk
    public static boolean isEmpty(@NonNull WorkSource workSource0) {
        Method method0 = WorkSourceUtil.i;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(workSource0, null);
                Preconditions.checkNotNull(object0);
                return ((Boolean)object0).booleanValue();
            }
            catch(Exception exception0) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", exception0);
            }
        }
        return WorkSourceUtil.size(workSource0) == 0;
    }

    @KeepForSdk
    public static int size(@NonNull WorkSource workSource0) {
        Method method0 = WorkSourceUtil.d;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(workSource0, null);
                Preconditions.checkNotNull(object0);
                return (int)(((Integer)object0));
            }
            catch(Exception exception0) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception0);
            }
        }
        return 0;
    }
}

