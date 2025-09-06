package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

@KeepForSdk
public class ProcessUtils {
    public static String a;
    public static int b;

    @Nullable
    @KeepForSdk
    public static String getMyProcessName() {
        BufferedReader bufferedReader0;
        if(ProcessUtils.a == null) {
            int v = ProcessUtils.b;
            if(v == 0) {
                v = Process.myPid();
                ProcessUtils.b = v;
            }
            String s = null;
            if(v > 0) {
                try {
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader0 = new BufferedReader(new FileReader("/proc/" + v + "/cmdline"));
                    }
                    finally {
                        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                    }
                }
                catch(IOException unused_ex) {
                    bufferedReader0 = null;
                    IOUtils.closeQuietly(bufferedReader0);
                    ProcessUtils.a = s;
                    return ProcessUtils.a;
                }
                catch(Throwable throwable0) {
                    IOUtils.closeQuietly(((Closeable)s));
                    throw throwable0;
                }
                try {
                    String s1 = bufferedReader0.readLine();
                    Preconditions.checkNotNull(s1);
                    s = s1.trim();
                }
                catch(IOException throwable0) {
                    s = bufferedReader0;
                    IOUtils.closeQuietly(((Closeable)s));
                    throw throwable0;
                }
                catch(Throwable unused_ex) {
                }
                IOUtils.closeQuietly(bufferedReader0);
            }
            ProcessUtils.a = s;
        }
        return ProcessUtils.a;
    }
}

