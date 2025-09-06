package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import v4.e;
import v4.f;

public final class ProfileVerifier {
    public static class CompilationStatus {
        @RestrictTo({Scope.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 0x20000;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 0x30000;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 0x10000;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 0x40000;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        public final int a;
        public final boolean b;
        public final boolean c;

        public CompilationStatus(int v, boolean z, boolean z1) {
            this.a = v;
            this.c = z1;
            this.b = z;
        }

        public int getProfileInstallResultCode() {
            return this.a;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.c;
        }

        public boolean isCompiledWithProfile() {
            return this.b;
        }
    }

    public static final ResolvableFuture a;
    public static final Object b;
    public static CompilationStatus c;

    static {
        ProfileVerifier.a = ResolvableFuture.create();
        ProfileVerifier.b = new Object();
        ProfileVerifier.c = null;
    }

    public static long a(Context context0) {
        PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT < 33 ? packageManager0.getPackageInfo("net.daum.android.tistoryapp", 0).lastUpdateTime : e.a(packageManager0, context0).lastUpdateTime;
    }

    public static CompilationStatus b(int v, boolean z, boolean z1) {
        CompilationStatus profileVerifier$CompilationStatus0 = new CompilationStatus(v, z, z1);
        ProfileVerifier.c = profileVerifier$CompilationStatus0;
        ProfileVerifier.a.set(profileVerifier$CompilationStatus0);
        return ProfileVerifier.c;
    }

    public static CompilationStatus c(Context context0, boolean z) {
        f f0;
        long v4;
        if(!z) {
            CompilationStatus profileVerifier$CompilationStatus0 = ProfileVerifier.c;
            if(profileVerifier$CompilationStatus0 != null) {
                return profileVerifier$CompilationStatus0;
            }
        }
        synchronized(ProfileVerifier.b) {
            if(!z) {
                CompilationStatus profileVerifier$CompilationStatus1 = ProfileVerifier.c;
                if(profileVerifier$CompilationStatus1 != null) {
                    return profileVerifier$CompilationStatus1;
                }
            }
            int v1 = 0;
            if(Build.VERSION.SDK_INT >= 28 && Build.VERSION.SDK_INT != 30) {
                File file0 = new File(new File("/data/misc/profiles/ref/", "net.daum.android.tistoryapp"), "primary.prof");
                long v2 = file0.length();
                boolean z1 = file0.exists() && v2 > 0L;
                File file1 = new File(new File("/data/misc/profiles/cur/0/", "net.daum.android.tistoryapp"), "primary.prof");
                long v3 = file1.length();
                boolean z2 = file1.exists() && v3 > 0L;
                try {
                    v4 = ProfileVerifier.a(context0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    return ProfileVerifier.b(0x10000, z1, z2);
                }
                File file2 = new File(context0.getFilesDir(), "profileInstalled");
                if(file2.exists()) {
                    try {
                        f0 = f.a(file2);
                    }
                    catch(IOException unused_ex) {
                        return ProfileVerifier.b(0x20000, z1, z2);
                    }
                }
                else {
                    f0 = null;
                }
                if(f0 == null || f0.c != v4) {
                label_38:
                    if(z1) {
                        v1 = 1;
                    }
                    else if(z2) {
                        v1 = 2;
                    }
                }
                else {
                    int v5 = f0.b;
                    if(v5 != 2) {
                        v1 = v5;
                        goto label_43;
                    }
                    goto label_38;
                }
            label_43:
                if(z && z2 && v1 != 1) {
                    v1 = 2;
                }
                if(f0 != null && f0.b == 2 && v1 == 1 && v2 < f0.d) {
                    v1 = 3;
                }
                f f1 = new f(1, v4, v1, v3);
                if(f0 == null || !f0.equals(f1)) {
                    try {
                        f1.b(file2);
                    }
                    catch(IOException unused_ex) {
                        v1 = 0x30000;
                    }
                }
                return ProfileVerifier.b(v1, z1, z2);
            }
        }
        return ProfileVerifier.b(0x40000, false, false);
    }

    @NonNull
    public static ListenableFuture getCompilationStatusAsync() {
        return ProfileVerifier.a;
    }

    @NonNull
    @WorkerThread
    public static CompilationStatus writeProfileVerification(@NonNull Context context0) {
        return ProfileVerifier.c(context0, false);
    }
}

