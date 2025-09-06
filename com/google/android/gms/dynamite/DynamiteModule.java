package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import jeb.synthetic.TWR;

@KeepForSdk
public final class DynamiteModule {
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;

    }

    @KeepForSdk
    public static class LoadingException extends Exception {
    }

    public interface VersionPolicy {
        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context arg1, @NonNull String arg2);

            int zzb(@NonNull Context arg1, @NonNull String arg2, boolean arg3) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion;
            @KeepForSdk
            public int remoteVersion;
            @KeepForSdk
            public int selection;

            public SelectionResult() {
                this.localVersion = 0;
                this.remoteVersion = 0;
                this.selection = 0;
            }
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context arg1, @NonNull String arg2, @NonNull IVersions arg3) throws LoadingException;
    }

    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;
    @KeepForSdk
    public static final int REMOTE = 1;
    public final Context a;
    public static Boolean b = null;
    public static String c = null;
    public static boolean d = false;
    public static int e = -1;
    public static Boolean f;
    public static final ThreadLocal g;
    public static final m0 h;
    public static final a i;
    public static zzq j;
    public static zzr k;
    @NonNull
    public static final VersionPolicy zza;

    static {
        DynamiteModule.g = new ThreadLocal();
        DynamiteModule.h = new m0(1);
        DynamiteModule.i = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamiteModule.PREFER_REMOTE = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamiteModule.PREFER_LOCAL = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamiteModule.zza = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public DynamiteModule(Context context0) {
        Preconditions.checkNotNull(context0);
        this.a = context0;
    }

    public static int a(Context context0, String s, boolean z, boolean z1) {
        boolean z4;
        int v1;
        Cursor cursor1;
        boolean z2;
        Cursor cursor0 = null;
        try {
            long v = (long)(((Long)DynamiteModule.h.get()));
            ContentResolver contentResolver0 = context0.getContentResolver();
            String s1 = "api_force_staging";
            z2 = true;
            if(!z) {
                s1 = "api";
            }
            cursor1 = contentResolver0.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(s1).appendPath(s).appendQueryParameter("requestStartTime", String.valueOf(v)).build(), null, null, null, null);
        }
        catch(Exception exception0) {
            goto label_51;
        }
        catch(Throwable throwable0) {
            goto label_55;
        }
        try {
            if(cursor1 == null || !cursor1.moveToFirst()) {
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            boolean z3 = false;
            v1 = cursor1.getInt(0);
            if(v1 > 0) {
                synchronized(DynamiteModule.class) {
                    DynamiteModule.c = cursor1.getString(2);
                    int v3 = cursor1.getColumnIndex("loaderVersion");
                    if(v3 >= 0) {
                        DynamiteModule.e = cursor1.getInt(v3);
                    }
                    int v4 = cursor1.getColumnIndex("disableStandaloneDynamiteLoader2");
                    if(v4 >= 0) {
                        z4 = cursor1.getInt(v4) != 0;
                        DynamiteModule.d = z4;
                    }
                    else {
                        z4 = false;
                    }
                }
                f7.b b0 = (f7.b)DynamiteModule.g.get();
                if(b0 == null || b0.a != null) {
                    z2 = false;
                }
                else {
                    b0.a = cursor1;
                }
                if(!z2) {
                    cursor0 = cursor1;
                }
                z3 = z4;
            }
            else {
                cursor0 = cursor1;
            }
        }
        catch(Exception exception1) {
            cursor0 = cursor1;
            exception0 = exception1;
            goto label_51;
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(cursor1, throwable1);
            throw throwable1;
        }
        if(z1 && z3) {
            try {
                throw new LoadingException("forcing fallback to container DynamiteLoader impl");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            catch(Exception exception0) {
                try {
                label_51:
                    if(!(exception0 instanceof LoadingException)) {
                        throw new LoadingException("V2 version check failed", exception0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                    }
                    throw exception0;
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
            }
            catch(Throwable throwable0) {
            label_55:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return v1;
    }

    public static void b(ClassLoader classLoader0) {
        try {
            zzr zzr0 = null;
            IBinder iBinder0 = (IBinder)classLoader0.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzr0 = iInterface0 instanceof zzr ? ((zzr)iInterface0) : new zzr(iBinder0, "com.google.android.gms.dynamite.IDynamiteLoaderV2");  // 初始化器: Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
            }
            DynamiteModule.k = zzr0;
            return;
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException classNotFoundException0) {
        }
        throw new LoadingException("Failed to instantiate dynamite loader", classNotFoundException0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    public static boolean c(Context context0) {
        boolean z = false;
        if(Boolean.TRUE.equals(null)) {
            return true;
        }
        if(Boolean.TRUE.equals(DynamiteModule.f)) {
            return true;
        }
        if(DynamiteModule.f == null) {
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context0, 10000000) == 0 && providerInfo0 != null && "com.google.android.gms".equals(providerInfo0.packageName)) {
                z = true;
            }
            DynamiteModule.f = Boolean.valueOf(z);
            if(z && providerInfo0 != null && (providerInfo0.applicationInfo != null && (providerInfo0.applicationInfo.flags & 0x81) == 0)) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                DynamiteModule.d = true;
            }
        }
        if(!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static zzq d(Context context0) {
        zzq zzq1;
        synchronized(DynamiteModule.class) {
            zzq zzq0 = DynamiteModule.j;
            if(zzq0 != null) {
                return zzq0;
            }
            try {
                IBinder iBinder0 = (IBinder)context0.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if(iBinder0 == null) {
                    zzq1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq1 = iInterface0 instanceof zzq ? ((zzq)iInterface0) : new zzq(iBinder0, "com.google.android.gms.dynamite.IDynamiteLoader");  // 初始化器: Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                }
                if(zzq1 != null) {
                    DynamiteModule.j = zzq1;
                    return zzq1;
                }
            }
            catch(Exception exception0) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + exception0.getMessage());
            }
            return null;
        }
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context0, @NonNull String s) {
        try {
            Class class0 = context0.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + s + ".ModuleDescriptor");
            Field field0 = class0.getDeclaredField("MODULE_ID");
            Field field1 = class0.getDeclaredField("MODULE_VERSION");
            if(!Objects.equal(field0.get(null), s)) {
                Log.e("DynamiteModule", "Module descriptor id \'" + field0.get(null) + "\' didn\'t match expected id \'" + s + "\'");
                return 0;
            }
            return field1.getInt(null);
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(Exception exception0) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: " + exception0.getMessage());
            return 0;
        }
        Log.w("DynamiteModule", "Local module descriptor class for " + s + " not found.");
        return 0;
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.a;
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context0, @NonNull String s) {
        return DynamiteModule.zza(context0, s, false);
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String s) throws LoadingException {
        try {
            return (IBinder)this.a.getClassLoader().loadClass(s).newInstance();
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException classNotFoundException0) {
            throw new LoadingException("Failed to instantiate module class: " + s, classNotFoundException0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context0, @NonNull VersionPolicy dynamiteModule$VersionPolicy0, @NonNull String s) throws LoadingException {
        zzr zzr0;
        DynamiteModule dynamiteModule2;
        DynamiteModule dynamiteModule1;
        IObjectWrapper iObjectWrapper0;
        IObjectWrapper iObjectWrapper1;
        int v2;
        DynamiteModule dynamiteModule0;
        int v1;
        SelectionResult dynamiteModule$VersionPolicy$SelectionResult0;
        ThreadLocal threadLocal0 = DynamiteModule.g;
        f7.b b0 = (f7.b)threadLocal0.get();
        f7.b b1 = new f7.b();  // 初始化器: Ljava/lang/Object;-><init>()V
        threadLocal0.set(b1);
        m0 m00 = DynamiteModule.h;
        Long long0 = (Long)m00.get();
        long v = (long)long0;
        try {
            m00.set(SystemClock.elapsedRealtime());
            dynamiteModule$VersionPolicy$SelectionResult0 = dynamiteModule$VersionPolicy0.selectModule(context0, s, DynamiteModule.i);
            Log.i("DynamiteModule", "Considering local module " + s + ":" + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote module " + s + ":" + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion);
            v1 = dynamiteModule$VersionPolicy$SelectionResult0.selection;
            if(v1 == 0) {
                throw new LoadingException("No acceptable module " + s + " found. Local version is " + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote version is " + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion + ".");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            if(v1 == -1) {
                if(dynamiteModule$VersionPolicy$SelectionResult0.localVersion == 0) {
                    throw new LoadingException("No acceptable module " + s + " found. Local version is " + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote version is " + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion + ".");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                v1 = -1;
            }
            if(v1 == 1 && dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion == 0) {
                throw new LoadingException("No acceptable module " + s + " found. Local version is " + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote version is " + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion + ".");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            if(v1 == -1) {
                Log.i("DynamiteModule", "Selected local version of " + s);
                dynamiteModule0 = new DynamiteModule(context0.getApplicationContext());
                if(v == 0L) {
                    goto label_21;
                }
                else {
                    goto label_23;
                }
                goto label_24;
            }
            goto label_29;
        }
        catch(Throwable throwable0) {
            goto label_122;
        }
    label_21:
        m00.remove();
        goto label_24;
    label_23:
        m00.set(long0);
    label_24:
        Cursor cursor0 = b1.a;
        if(cursor0 != null) {
            cursor0.close();
        }
        threadLocal0.set(b0);
        return dynamiteModule0;
        try {
        label_29:
            if(v1 != 1) {
                throw new LoadingException("VersionPolicy returned invalid code:" + v1);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            try {
                v2 = dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion;
            }
            catch(LoadingException dynamiteModule$LoadingException0) {
                goto label_107;
            }
        }
        catch(Throwable throwable0) {
            goto label_122;
        }
        try {
            synchronized(DynamiteModule.class) {
                if(!DynamiteModule.c(context0)) {
                    throw new LoadingException("Remote loading disabled");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                Boolean boolean0 = DynamiteModule.b;
            }
            if(boolean0 == null) {
                throw new LoadingException("Failed to determine which loading route to use.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            if(boolean0.booleanValue()) {
                Log.i("DynamiteModule", "Selected remote version of " + s + ", version >= " + v2);
                synchronized(DynamiteModule.class) {
                    zzr0 = DynamiteModule.k;
                }
                if(zzr0 == null) {
                    throw new LoadingException("DynamiteLoaderV2 was not cached.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                f7.b b3 = (f7.b)threadLocal0.get();
                if(b3 == null || b3.a == null) {
                    throw new LoadingException("No result cursor");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                Context context1 = context0.getApplicationContext();
                Cursor cursor1 = b3.a;
                ObjectWrapper.wrap(null);
                synchronized(DynamiteModule.class) {
                    boolean z = DynamiteModule.e >= 2;
                }
                if(z) {
                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                    iObjectWrapper1 = zzr0.zzf(ObjectWrapper.wrap(context1), s, v2, ObjectWrapper.wrap(cursor1));
                }
                else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                    iObjectWrapper1 = zzr0.zze(ObjectWrapper.wrap(context1), s, v2, ObjectWrapper.wrap(cursor1));
                }
                Context context2 = (Context)ObjectWrapper.unwrap(iObjectWrapper1);
                if(context2 == null) {
                    throw new LoadingException("Failed to get module context");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                dynamiteModule1 = new DynamiteModule(context2);
            }
            else {
                Log.i("DynamiteModule", "Selected remote version of " + s + ", version >= " + v2);
                zzq zzq0 = DynamiteModule.d(context0);
                if(zzq0 == null) {
                    throw new LoadingException("Failed to create IDynamiteLoader.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                int v4 = zzq0.zze();
                if(v4 >= 3) {
                    f7.b b2 = (f7.b)threadLocal0.get();
                    if(b2 == null) {
                        throw new LoadingException("No cached result cursor holder");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    iObjectWrapper0 = zzq0.zzi(ObjectWrapper.wrap(context0), s, v2, ObjectWrapper.wrap(b2.a));
                }
                else if(v4 == 2) {
                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                    iObjectWrapper0 = zzq0.zzj(ObjectWrapper.wrap(context0), s, v2);
                }
                else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    iObjectWrapper0 = zzq0.zzh(ObjectWrapper.wrap(context0), s, v2);
                }
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                if(object0 == null) {
                    throw new LoadingException("Failed to load remote module.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                dynamiteModule1 = new DynamiteModule(((Context)object0));
            }
            goto label_131;
        }
        catch(RemoteException remoteException0) {
        }
        catch(LoadingException dynamiteModule$LoadingException1) {
            throw dynamiteModule$LoadingException1;
        }
        catch(Throwable throwable1) {
            goto label_104;
        }
        try {
            try {
                throw new LoadingException("Failed to load remote module.", remoteException0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            label_104:
                CrashUtils.addDynamiteErrorToDropBox(context0, throwable1);
                throw new LoadingException("Failed to load remote module.", throwable1);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            catch(LoadingException dynamiteModule$LoadingException0) {
            }
        label_107:
            Log.w("DynamiteModule", "Failed to load remote module: " + dynamiteModule$LoadingException0.getMessage());
            if(dynamiteModule$VersionPolicy$SelectionResult0.localVersion == 0 || dynamiteModule$VersionPolicy0.selectModule(context0, s, new i(dynamiteModule$VersionPolicy$SelectionResult0.localVersion)).selection != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", dynamiteModule$LoadingException0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            Log.i("DynamiteModule", "Selected local version of " + s);
            dynamiteModule2 = new DynamiteModule(context0.getApplicationContext());
            if(v == 0L) {
                goto label_113;
            }
            else {
                goto label_115;
            }
            goto label_116;
        }
        catch(Throwable throwable0) {
            goto label_122;
        }
    label_113:
        DynamiteModule.h.remove();
        goto label_116;
    label_115:
        DynamiteModule.h.set(long0);
    label_116:
        Cursor cursor2 = b1.a;
        if(cursor2 != null) {
            cursor2.close();
        }
        DynamiteModule.g.set(b0);
        return dynamiteModule2;
        try {
        label_122:
            if(v == 0L) {
                goto label_123;
            }
            else {
                goto label_125;
            }
            goto label_126;
        }
        catch(Throwable throwable0) {
            goto label_122;
        }
    label_123:
        DynamiteModule.h.remove();
        goto label_126;
    label_125:
        DynamiteModule.h.set(long0);
    label_126:
        Cursor cursor3 = b1.a;
        if(cursor3 != null) {
            cursor3.close();
        }
        DynamiteModule.g.set(b0);
        throw throwable0;
    label_131:
        if(v == 0L) {
            m00.remove();
        }
        else {
            m00.set(long0);
        }
        Cursor cursor4 = b1.a;
        if(cursor4 != null) {
            cursor4.close();
        }
        threadLocal0.set(b0);
        return dynamiteModule1;
    }

    public static int zza(@NonNull Context context0, @NonNull String s, boolean z) {
        int v4;
        RemoteException remoteException1;
        Cursor cursor2;
        ThreadLocal threadLocal0;
        zzq zzq0;
        int v2;
        Cursor cursor0;
        boolean z1;
        try {
            synchronized(DynamiteModule.class) {
                Boolean boolean0 = DynamiteModule.b;
                z1 = true;
                cursor0 = null;
                if(boolean0 == null) {
                    try {
                        Field field0 = context0.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader").getDeclaredField("sClassLoader");
                        Class class1 = field0.getDeclaringClass();
                        synchronized(class1) {
                            ClassLoader classLoader0 = (ClassLoader)field0.get(null);
                            if(classLoader0 == ClassLoader.getSystemClassLoader()) {
                                boolean0 = Boolean.FALSE;
                            }
                            else if(classLoader0 == null) {
                                if(!DynamiteModule.c(context0)) {
                                    return 0;
                                }
                                if(DynamiteModule.d || Boolean.TRUE.equals(null)) {
                                    field0.set(null, ClassLoader.getSystemClassLoader());
                                    boolean0 = Boolean.FALSE;
                                    goto label_53;
                                }
                                try {
                                    v2 = DynamiteModule.a(context0, s, z, true);
                                    if(DynamiteModule.c != null && !DynamiteModule.c.isEmpty()) {
                                        ClassLoader classLoader1 = zzb.zza();
                                        if(classLoader1 == null) {
                                            if(Build.VERSION.SDK_INT >= 29) {
                                                String s1 = DynamiteModule.c;
                                                Preconditions.checkNotNull(s1);
                                                classLoader1 = androidx.webkit.internal.e.d(ClassLoader.getSystemClassLoader(), s1);
                                            }
                                            else {
                                                String s2 = DynamiteModule.c;
                                                Preconditions.checkNotNull(s2);
                                                classLoader1 = new f7.a(s2, ClassLoader.getSystemClassLoader());  // 初始化器: Ldalvik/system/PathClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V
                                            }
                                        }
                                        DynamiteModule.b(classLoader1);
                                        field0.set(null, classLoader1);
                                        DynamiteModule.b = Boolean.TRUE;
                                        return v2;
                                    }
                                    return v2;
                                }
                                catch(LoadingException unused_ex) {
                                    field0.set(null, ClassLoader.getSystemClassLoader());
                                    boolean0 = Boolean.FALSE;
                                    goto label_53;
                                }
                                return v2;
                            }
                            else {
                                try {
                                    DynamiteModule.b(classLoader0);
                                }
                                catch(LoadingException unused_ex) {
                                }
                                boolean0 = Boolean.TRUE;
                            }
                        }
                    }
                    catch(ClassNotFoundException | IllegalAccessException | NoSuchFieldException classNotFoundException0) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + classNotFoundException0.toString());
                        boolean0 = Boolean.FALSE;
                    }
                label_53:
                    DynamiteModule.b = boolean0;
                }
            }
            if(!boolean0.booleanValue()) {
                zzq0 = DynamiteModule.d(context0);
                if(zzq0 != null) {
                    goto label_65;
                }
                return 0;
            }
            return DynamiteModule.a(context0, s, z, false);
        }
        catch(Throwable throwable0) {
            CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
            throw throwable0;
        }
        try {
        label_65:
            int v3 = zzq0.zze();
            if(v3 < 3) {
                if(v3 == 2) {
                    Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                    return zzq0.zzg(ObjectWrapper.wrap(context0), s, z);
                }
                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                return zzq0.zzf(ObjectWrapper.wrap(context0), s, z);
            }
            threadLocal0 = DynamiteModule.g;
            f7.b b0 = (f7.b)threadLocal0.get();
            if(b0 != null) {
                Cursor cursor1 = b0.a;
                if(cursor1 != null) {
                    return cursor1.getInt(0);
                }
            }
            cursor2 = (Cursor)ObjectWrapper.unwrap(zzq0.zzk(ObjectWrapper.wrap(context0), s, z, ((long)(((Long)DynamiteModule.h.get())))));
            if(cursor2 != null) {
                goto label_84;
            }
            goto label_99;
        }
        catch(RemoteException remoteException0) {
            remoteException1 = remoteException0;
            goto label_103;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            goto label_113;
        }
        try {
        label_84:
            if(cursor2.moveToFirst()) {
                v4 = cursor2.getInt(0);
                if(v4 > 0) {
                    f7.b b1 = (f7.b)threadLocal0.get();
                    if(b1 == null || b1.a != null) {
                        z1 = false;
                    }
                    else {
                        b1.a = cursor2;
                    }
                    if(!z1) {
                        cursor0 = cursor2;
                    }
                }
                else {
                    cursor0 = cursor2;
                }
                goto label_96;
            }
            goto label_99;
        }
        catch(RemoteException remoteException1) {
            goto label_102;
        }
        catch(Throwable throwable2) {
            goto label_112;
        }
    label_96:
        if(cursor0 != null) {
            try {
                cursor0.close();
            }
            catch(Throwable throwable0) {
                CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
                throw throwable0;
            }
        }
        return v4;
        try {
        label_99:
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            goto label_116;
        }
        catch(RemoteException remoteException1) {
        }
        catch(Throwable throwable2) {
            goto label_112;
        }
    label_102:
        cursor0 = cursor2;
        try {
        label_103:
            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException1.getMessage());
            if(cursor0 != null) {
                goto label_109;
            }
            return 0;
        }
        catch(Throwable throwable1) {
            try {
                throwable2 = throwable1;
                goto label_113;
            label_109:
                cursor0.close();
                return 0;
            label_112:
                cursor0 = cursor2;
            label_113:
                if(cursor0 != null) {
                    cursor0.close();
                }
                throw throwable2;
            label_116:
                if(cursor2 != null) {
                    cursor2.close();
                    return 0;
                }
                return 0;
            }
            catch(Throwable throwable0) {
            }
        }
        CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
        throw throwable0;
    }
}

