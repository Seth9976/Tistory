package com.google.android.play.core.install;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import j8.a;

public abstract class InstallState {
    public abstract long bytesDownloaded();

    @InstallErrorCode
    public abstract int installErrorCode();

    @InstallStatus
    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();

    public static InstallState zza(@InstallStatus int v, long v1, long v2, @InstallErrorCode int v3, @NonNull String s) {
        return new a(v, v1, v2, v3, s);
    }

    public static InstallState zzb(@NonNull Intent intent0, @NonNull zzm zzm0) {
        zzm0.zza("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        zzm0.zza("Key: %s; value: %s", new Object[]{"install.status", intent0.getIntExtra("install.status", 0)});
        zzm0.zza("Key: %s; value: %s", new Object[]{"error.code", intent0.getIntExtra("error.code", 0)});
        return new a(intent0.getIntExtra("install.status", 0), intent0.getLongExtra("bytes.downloaded", 0L), intent0.getLongExtra("total.bytes.to.download", 0L), intent0.getIntExtra("error.code", 0), intent0.getStringExtra("package.name"));
    }
}

