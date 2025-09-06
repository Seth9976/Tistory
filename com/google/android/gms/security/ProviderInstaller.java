package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

public class ProviderInstaller {
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int arg1, @Nullable Intent arg2);

        void onProviderInstalled();
    }

    @NonNull
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    public static final GoogleApiAvailabilityLight a;
    public static final Object b;
    public static Method c;
    public static Method d;

    static {
        ProviderInstaller.a = GoogleApiAvailabilityLight.getInstance();
        ProviderInstaller.b = new Object();
        ProviderInstaller.c = null;
        ProviderInstaller.d = null;
    }

    public static void a(Context context0, String s) {
        try {
            if(ProviderInstaller.c == null) {
                ProviderInstaller.c = context0.getClassLoader().loadClass(s).getMethod("insertProvider", Context.class);
            }
            ProviderInstaller.c.invoke(null, context0);
            return;
        }
        catch(Exception exception0) {
        }
        Throwable throwable0 = exception0.getCause();
        if(Log.isLoggable("ProviderInstaller", 6)) {
            Log.e("ProviderInstaller", "Failed to install provider: " + (throwable0 == null ? exception0.getMessage() : throwable0.getMessage()));
        }
        throw new GooglePlayServicesNotAvailableException(8);
    }

    public static void installIfNeeded(@NonNull Context context0) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context1;
        Preconditions.checkNotNull(context0, "Context must not be null");
        ProviderInstaller.a.verifyGooglePlayServicesIsAvailable(context0, 11925000);
        synchronized(ProviderInstaller.b) {
            long v1 = SystemClock.elapsedRealtime();
            try {
                context1 = DynamiteModule.load(context0, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            }
            catch(LoadingException dynamiteModule$LoadingException0) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: " + dynamiteModule$LoadingException0.getMessage());
                context1 = null;
            }
            if(context1 == null) {
                long v2 = SystemClock.elapsedRealtime();
                Context context2 = GooglePlayServicesUtilLight.getRemoteContext(context0);
                if(context2 != null) {
                    try {
                        if(ProviderInstaller.d == null) {
                            Class[] arr_class = {Context.class, Long.TYPE, Long.TYPE};
                            ProviderInstaller.d = context2.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", arr_class);
                        }
                        ProviderInstaller.d.invoke(null, context0, v1, v2);
                        goto label_22;
                    }
                    catch(Exception exception0) {
                    }
                    Log.w("ProviderInstaller", "Failed to report request stats: " + exception0.getMessage());
                }
            label_22:
                if(context2 != null) {
                    ProviderInstaller.a(context2, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                }
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
            ProviderInstaller.a(context1, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    public static void installIfNeededAsync(@NonNull Context context0, @NonNull ProviderInstallListener providerInstaller$ProviderInstallListener0) {
        Preconditions.checkNotNull(context0, "Context must not be null");
        Preconditions.checkNotNull(providerInstaller$ProviderInstallListener0, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new a(context0, providerInstaller$ProviderInstallListener0).execute(new Void[0]);
    }
}

