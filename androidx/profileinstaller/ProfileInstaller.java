package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import n.a;

public class ProfileInstaller {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int arg1, @Nullable Object arg2);

        void onResultReceived(int arg1, @Nullable Object arg2);
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;
    public static final b a;

    static {
        ProfileInstaller.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(PackageInfo packageInfo0, File file0) {
        File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file1))) {
            dataOutputStream0.writeLong(packageInfo0.lastUpdateTime);
        }
        catch(IOException unused_ex) {
        }
    }

    public static void b(Context context0, Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0, boolean z) {
        boolean z3;
        PackageInfo packageInfo0;
        Context context1 = context0.getApplicationContext();
        ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
        AssetManager assetManager0 = context1.getAssets();
        String s = new File(applicationInfo0.sourceDir).getName();
        PackageManager packageManager0 = context0.getPackageManager();
        boolean z1 = false;
        try {
            packageInfo0 = packageManager0.getPackageInfo("net.daum.android.tistoryapp", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            profileInstaller$DiagnosticsCallback0.onResultReceived(7, packageManager$NameNotFoundException0);
            ProfileVerifier.c(context0, false);
            return;
        }
        File file0 = context0.getFilesDir();
        if(!z) {
            File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
            boolean z2 = false;
            if(file1.exists()) {
                try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file1))) {
                    if(dataInputStream0.readLong() == packageInfo0.lastUpdateTime) {
                        goto label_21;
                    }
                }
                catch(IOException unused_ex) {
                }
                goto label_24;
            label_21:
                z2 = true;
                profileInstaller$DiagnosticsCallback0.onResultReceived(2, null);
            }
        label_24:
            if(z2) {
                Log.d("ProfileInstaller", "Skipping profile installation for net.daum.android.tistoryapp");
                ProfileVerifier.c(context0, false);
                return;
            }
        }
        Log.d("ProfileInstaller", "Installing profile for net.daum.android.tistoryapp");
        DeviceProfileWriter deviceProfileWriter0 = new DeviceProfileWriter(assetManager0, executor0, profileInstaller$DiagnosticsCallback0, s, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", "net.daum.android.tistoryapp"), "primary.prof"));
        if(deviceProfileWriter0.deviceAllowsProfileInstallerAotWrites()) {
            z3 = deviceProfileWriter0.read().transcodeIfNeeded().write();
            if(z3) {
                ProfileInstaller.a(packageInfo0, file0);
            }
        }
        else {
            z3 = false;
        }
        if(z3 && z) {
            z1 = true;
        }
        ProfileVerifier.c(context0, z1);
    }

    @WorkerThread
    public static void writeProfile(@NonNull Context context0) {
        ProfileInstaller.writeProfile(context0, new a(2), ProfileInstaller.a);
    }

    @WorkerThread
    public static void writeProfile(@NonNull Context context0, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        ProfileInstaller.b(context0, executor0, profileInstaller$DiagnosticsCallback0, false);
    }
}

