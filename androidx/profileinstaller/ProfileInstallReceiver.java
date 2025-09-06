package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import n.a;
import v4.d;

public class ProfileInstallReceiver extends BroadcastReceiver {
    @NonNull
    public static final String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    @NonNull
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @NonNull
    public static final String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    @NonNull
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context0, @Nullable Intent intent0) {
        PackageInfo packageInfo0;
        if(intent0 == null) {
            return;
        }
        String s = intent0.getAction();
        if("androidx.profileinstaller.action.INSTALL_PROFILE".equals(s)) {
            ProfileInstaller.b(context0, new a(2), new androidx.profileinstaller.a(this), true);
            return;
        }
        if("androidx.profileinstaller.action.SKIP_FILE".equals(s)) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s1 = bundle0.getString("EXTRA_SKIP_FILE_OPERATION");
                if("WRITE_SKIP_FILE".equals(s1)) {
                    androidx.profileinstaller.a a0 = new androidx.profileinstaller.a(this);
                    PackageManager packageManager0 = context0.getPackageManager();
                    try {
                        packageInfo0 = packageManager0.getPackageInfo("net.daum.android.tistoryapp", 0);
                    }
                    catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                        a0.onResultReceived(7, packageManager$NameNotFoundException0);
                        return;
                    }
                    ProfileInstaller.a(packageInfo0, context0.getFilesDir());
                    a0.onResultReceived(10, null);
                    return;
                }
                if("DELETE_SKIP_FILE".equals(s1)) {
                    new File(context0.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                    this.setResultCode(11);
                }
            }
        }
        else {
            if("androidx.profileinstaller.action.SAVE_PROFILE".equals(s)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                this.setResultCode(12);
                return;
            }
            if("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(s)) {
                Bundle bundle1 = intent0.getExtras();
                if(bundle1 != null) {
                    String s2 = bundle1.getString("EXTRA_BENCHMARK_OPERATION");
                    androidx.profileinstaller.a a1 = new androidx.profileinstaller.a(this);
                    if("DROP_SHADER_CACHE".equals(s2)) {
                        if(d.c(context0.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                            a1.onResultReceived(14, null);
                            return;
                        }
                        a1.onResultReceived(15, null);
                        return;
                    }
                    a1.onResultReceived(16, null);
                }
            }
        }
    }
}

