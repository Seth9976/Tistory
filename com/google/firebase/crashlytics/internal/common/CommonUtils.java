package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonUtils {
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 0x20;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    public static final String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    public static final String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";
    public static final char[] a;
    public static long b;

    static {
        CommonUtils.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        CommonUtils.b = -1L;
    }

    public static long calculateFreeRamInBytes(Context context0) {
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        ((ActivityManager)context0.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo0);
        return activityManager$MemoryInfo0.availMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String s) {
        StatFs statFs0 = new StatFs(s);
        long v = (long)statFs0.getBlockSize();
        return ((long)statFs0.getBlockCount()) * v - v * ((long)statFs0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean canTryConnection(Context context0) {
        if(CommonUtils.checkPermission(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            return networkInfo0 != null && networkInfo0.isConnectedOrConnecting();
        }
        return true;
    }

    public static boolean checkPermission(Context context0, String s) {
        return context0.checkCallingOrSelfPermission(s) == 0;
    }

    public static void closeOrLog(Closeable closeable0, String s) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException iOException0) {
                Logger.getLogger().e(s, iOException0);
            }
        }
    }

    public static void closeQuietly(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    public static String createInstanceIdFrom(String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(s != null) {
                    arrayList0.add(s.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList0);
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: arrayList0) {
                stringBuilder0.append(((String)object0));
            }
            String s1 = stringBuilder0.toString();
            return s1.length() <= 0 ? null : CommonUtils.sha1(s1);
        }
        return null;
    }

    public static String extractFieldFromSystemFile(File file0, String s) {
        String[] arr_s;
        BufferedReader bufferedReader0;
        String s1 = null;
        if(file0.exists()) {
            try {
                bufferedReader0 = null;
                bufferedReader0 = new BufferedReader(new FileReader(file0), 0x400);
                goto label_7;
            }
            catch(Exception exception0) {
                goto label_14;
            }
            catch(Throwable throwable0) {
            }
            CommonUtils.closeOrLog(((Closeable)s1), "Failed to close system file reader.");
            throw throwable0;
            try {
                try {
                    do {
                    label_7:
                        String s2 = bufferedReader0.readLine();
                        if(s2 == null) {
                            goto label_20;
                        }
                        arr_s = Pattern.compile("\\s*:\\s*").split(s2, 2);
                    }
                    while(arr_s.length <= 1 || !arr_s[0].equals(s));
                    s1 = arr_s[1];
                }
                catch(Exception exception0) {
                label_14:
                    Logger.getLogger().e("Error parsing " + file0, exception0);
                }
            }
            catch(Throwable throwable0) {
                s1 = bufferedReader0;
                CommonUtils.closeOrLog(((Closeable)s1), "Failed to close system file reader.");
                throw throwable0;
            }
        label_20:
            CommonUtils.closeOrLog(bufferedReader0, "Failed to close system file reader.");
            return s1;
        }
        return null;
    }

    public static ActivityManager.RunningAppProcessInfo getAppProcessInfo(String s, Context context0) {
        List list0 = ((ActivityManager)context0.getSystemService("activity")).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.processName.equals(s)) {
                    return activityManager$RunningAppProcessInfo0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static boolean getBooleanResourceValue(Context context0, String s, boolean z) {
        if(context0 != null) {
            Resources resources0 = context0.getResources();
            if(resources0 != null) {
                int v = CommonUtils.getResourcesIdentifier(context0, s, "bool");
                if(v > 0) {
                    return resources0.getBoolean(v);
                }
                int v1 = CommonUtils.getResourcesIdentifier(context0, s, "string");
                return v1 <= 0 ? z : Boolean.parseBoolean(context0.getString(v1));
            }
        }
        return z;
    }

    public static int getCpuArchitectureInt() {
        boolean z = TextUtils.isEmpty("arm64-v8a");
        d d0 = d.a;
        if(z) {
            Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
            return d0.ordinal();
        }
        d d1 = (d)d.b.get("arm64-v8a");
        if(d1 != null) {
            d0 = d1;
        }
        return d0.ordinal();
    }

    public static int getDeviceState() {
        int v = CommonUtils.isEmulator();
        if(CommonUtils.isRooted()) {
            v |= 2;
        }
        return CommonUtils.isDebuggerAttached() ? v | 4 : v;
    }

    public static SharedPreferences getLegacySharedPrefs(Context context0) {
        return context0.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String getMappingFileId(Context context0) {
        int v = CommonUtils.getResourcesIdentifier(context0, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if(v == 0) {
            v = CommonUtils.getResourcesIdentifier(context0, "com.crashlytics.android.build_id", "string");
        }
        return v == 0 ? null : context0.getResources().getString(v);
    }

    // 去混淆评级： 低(20)
    public static boolean getProximitySensorEnabled(Context context0) {
        return CommonUtils.isEmulator() ? false : ((SensorManager)context0.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static String getResourcePackageName(Context context0) {
        int v = context0.getApplicationContext().getApplicationInfo().icon;
        if(v > 0) {
            try {
                String s = context0.getResources().getResourcePackageName(v);
                return "android".equals(s) ? "net.daum.android.tistoryapp" : s;
            }
            catch(Resources.NotFoundException unused_ex) {
                return "net.daum.android.tistoryapp";
            }
        }
        return "net.daum.android.tistoryapp";
    }

    public static int getResourcesIdentifier(Context context0, String s, String s1) {
        return context0.getResources().getIdentifier(s, s1, CommonUtils.getResourcePackageName(context0));
    }

    public static SharedPreferences getSharedPrefs(Context context0) {
        return context0.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String getStringsFileValue(Context context0, String s) {
        int v = CommonUtils.getResourcesIdentifier(context0, s, "string");
        return v <= 0 ? "" : context0.getString(v);
    }

    public static long getTotalRamInBytes() {
        synchronized(CommonUtils.class) {
            if(CommonUtils.b == -1L) {
                String s = CommonUtils.extractFieldFromSystemFile(new File("/proc/meminfo"), "MemTotal");
                long v1 = 0L;
                if(!TextUtils.isEmpty(s)) {
                    String s1 = s.toUpperCase(Locale.US);
                    try {
                        if(s1.endsWith("KB")) {
                            v1 = Long.parseLong(s1.split("KB")[0].trim()) * 0x400L;
                        }
                        else if(s1.endsWith("MB")) {
                            v1 = Long.parseLong(s1.split("MB")[0].trim()) * 0x100000L;
                        }
                        else if(s1.endsWith("GB")) {
                            v1 = Long.parseLong(s1.split("GB")[0].trim()) * 0x40000000L;
                        }
                        else {
                            Logger.getLogger().w("Unexpected meminfo format while computing RAM: " + s1);
                        }
                        CommonUtils.b = v1;
                        return CommonUtils.b;
                    }
                    catch(NumberFormatException numberFormatException0) {
                    }
                    Logger.getLogger().e("Unexpected meminfo format while computing RAM: " + s1, numberFormatException0);
                }
                CommonUtils.b = v1;
            }
            return CommonUtils.b;
        }
    }

    public static String hexify(byte[] arr_b) {
        char[] arr_c = new char[arr_b.length * 2];
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            arr_c[v * 2] = CommonUtils.a[(v1 & 0xFF) >>> 4];
            arr_c[v * 2 + 1] = CommonUtils.a[v1 & 15];
        }
        return new String(arr_c);
    }

    public static boolean isAppDebuggable(Context context0) {
        return (context0.getApplicationInfo().flags & 2) != 0;
    }

    // 去混淆评级： 低(20)
    public static boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    // 去混淆评级： 低(30)
    public static boolean isEmulator() {
        return Build.PRODUCT.contains("sdk") || (Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu"));
    }

    @Deprecated
    public static boolean isLoggingEnabled(Context context0) {
        return false;
    }

    public static boolean isRooted() {
        boolean z = CommonUtils.isEmulator();
        if(!z && Build.TAGS != null && Build.TAGS.contains("test-keys")) {
            return true;
        }
        return new File("/system/app/Superuser.apk").exists() ? true : !z && new File("/system/xbin/su").exists();
    }

    public static boolean nullSafeEquals(@Nullable String s, @Nullable String s1) {
        return s == null ? s1 == null : s.equals(s1);
    }

    public static String padWithZerosToMaxIntWidth(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("value must be zero or greater");
        }
        return String.format(Locale.US, "%1$10s", v).replace(' ', '0');
    }

    public static String sha1(String s) {
        MessageDigest messageDigest0;
        byte[] arr_b = s.getBytes();
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-1");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            Logger.getLogger().e("Could not create hashing algorithm: SHA-1, returning empty string.", noSuchAlgorithmException0);
            return "";
        }
        messageDigest0.update(arr_b);
        return CommonUtils.hexify(messageDigest0.digest());
    }

    public static String streamToString(InputStream inputStream0) {
        Scanner scanner0 = new Scanner(inputStream0).useDelimiter("\\A");
        return scanner0.hasNext() ? scanner0.next() : "";
    }
}

