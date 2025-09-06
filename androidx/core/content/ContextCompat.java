package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.LocaleManagerCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.ExecutorCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ContextCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RegisterReceiverFlags {
    }

    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    public static final Object a;

    static {
    }

    public static int checkSelfPermission(@NonNull Context context0, @NonNull String s) {
        ObjectsCompat.requireNonNull(s, "permission must be non-null");
        if(Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", s)) {
            return NotificationManagerCompat.from(context0).areNotificationsEnabled() ? 0 : -1;
        }
        return context0.checkPermission(s, Process.myPid(), Process.myUid());
    }

    @NonNull
    public static Context createAttributionContext(@NonNull Context context0, @Nullable String s) {
        return Build.VERSION.SDK_INT < 30 ? context0 : f.a(context0, s);
    }

    @Nullable
    public static Context createDeviceProtectedStorageContext(@NonNull Context context0) {
        return c.a(context0);
    }

    @Nullable
    public static String getAttributionTag(@NonNull Context context0) {
        return Build.VERSION.SDK_INT < 30 ? null : f.b(context0);
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context0) {
        return a.a(context0);
    }

    @ColorInt
    public static int getColor(@NonNull Context context0, @ColorRes int v) {
        return b.a(context0, v);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context0, @ColorRes int v) {
        return ResourcesCompat.getColorStateList(context0.getResources(), v, context0.getTheme());
    }

    @NonNull
    public static Context getContextForLanguage(@NonNull Context context0) {
        LocaleListCompat localeListCompat0 = LocaleManagerCompat.getApplicationLocales(context0);
        if(Build.VERSION.SDK_INT <= 0x20 && !localeListCompat0.isEmpty()) {
            Configuration configuration0 = new Configuration(context0.getResources().getConfiguration());
            ConfigurationCompat.setLocales(configuration0, localeListCompat0);
            return context0.createConfigurationContext(configuration0);
        }
        return context0;
    }

    @Nullable
    public static File getDataDir(@NonNull Context context0) {
        return c.b(context0);
    }

    @NonNull
    public static Display getDisplayOrDefault(@NonNull Context context0) {
        return Build.VERSION.SDK_INT < 30 ? ((WindowManager)context0.getSystemService("window")).getDefaultDisplay() : f.c(context0);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context0, @DrawableRes int v) {
        return a.b(context0, v);
    }

    @NonNull
    public static File[] getExternalCacheDirs(@NonNull Context context0) {
        return context0.getExternalCacheDirs();
    }

    @NonNull
    public static File[] getExternalFilesDirs(@NonNull Context context0, @Nullable String s) {
        return context0.getExternalFilesDirs(s);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context0) {
        return Build.VERSION.SDK_INT < 28 ? ExecutorCompat.create(new Handler(context0.getMainLooper())) : e.a(context0);
    }

    @Nullable
    public static File getNoBackupFilesDir(@NonNull Context context0) {
        return a.c(context0);
    }

    @NonNull
    public static File[] getObbDirs(@NonNull Context context0) {
        return context0.getObbDirs();
    }

    @NonNull
    public static String getString(@NonNull Context context0, int v) {
        return ContextCompat.getContextForLanguage(context0).getString(v);
    }

    @Nullable
    public static Object getSystemService(@NonNull Context context0, @NonNull Class class0) {
        return b.b(context0, class0);
    }

    @Nullable
    public static String getSystemServiceName(@NonNull Context context0, @NonNull Class class0) {
        return b.c(context0, class0);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context0) {
        return c.c(context0);
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context0, @Nullable BroadcastReceiver broadcastReceiver0, @NonNull IntentFilter intentFilter0, int v) {
        return ContextCompat.registerReceiver(context0, broadcastReceiver0, intentFilter0, null, null, v);
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context0, @Nullable BroadcastReceiver broadcastReceiver0, @NonNull IntentFilter intentFilter0, @Nullable String s, @Nullable Handler handler0, int v) {
        if((v & 1) != 0 && (v & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if((v & 1) != 0) {
            v |= 2;
        }
        if((v & 2) == 0 && (v & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if((v & 2) != 0 && (v & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        return Build.VERSION.SDK_INT < 33 ? d.a(context0, broadcastReceiver0, intentFilter0, s, handler0, v) : g.a(context0, broadcastReceiver0, intentFilter0, s, handler0, v);
    }

    public static boolean startActivities(@NonNull Context context0, @NonNull Intent[] arr_intent) {
        return ContextCompat.startActivities(context0, arr_intent, null);
    }

    public static boolean startActivities(@NonNull Context context0, @NonNull Intent[] arr_intent, @Nullable Bundle bundle0) {
        context0.startActivities(arr_intent, bundle0);
        return true;
    }

    public static void startActivity(@NonNull Context context0, @NonNull Intent intent0, @Nullable Bundle bundle0) {
        context0.startActivity(intent0, bundle0);
    }

    public static void startForegroundService(@NonNull Context context0, @NonNull Intent intent0) {
        d.b(context0, intent0);
    }
}

