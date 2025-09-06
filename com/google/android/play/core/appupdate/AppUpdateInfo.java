package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppUpdateInfo {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final PendingIntent k;
    public final PendingIntent l;
    public final PendingIntent m;
    public final PendingIntent n;
    public final Map o;
    public boolean p;

    public AppUpdateInfo(String s, int v, int v1, int v2, Integer integer0, int v3, long v4, long v5, long v6, long v7, PendingIntent pendingIntent0, PendingIntent pendingIntent1, PendingIntent pendingIntent2, PendingIntent pendingIntent3, Map map0) {
        this.p = false;
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = integer0;
        this.f = v3;
        this.g = v4;
        this.h = v5;
        this.i = v6;
        this.j = v7;
        this.k = pendingIntent0;
        this.l = pendingIntent1;
        this.m = pendingIntent2;
        this.n = pendingIntent3;
        this.o = map0;
    }

    public final PendingIntent a(AppUpdateOptions appUpdateOptions0) {
        int v = appUpdateOptions0.appUpdateType();
        long v1 = this.j;
        long v2 = this.i;
        if(v == 0) {
            PendingIntent pendingIntent0 = this.l;
            if(pendingIntent0 != null) {
                return pendingIntent0;
            }
            return !appUpdateOptions0.allowAssetPackDeletion() || v2 > v1 ? null : this.n;
        }
        if(appUpdateOptions0.appUpdateType() == 1) {
            PendingIntent pendingIntent1 = this.k;
            if(pendingIntent1 != null) {
                return pendingIntent1;
            }
            return !appUpdateOptions0.allowAssetPackDeletion() || v2 > v1 ? null : this.m;
        }
        return null;
    }

    public int availableVersionCode() {
        return this.b;
    }

    public long bytesDownloaded() {
        return this.g;
    }

    @Nullable
    public Integer clientVersionStalenessDays() {
        return this.e;
    }

    public Set getFailedUpdatePreconditions(AppUpdateOptions appUpdateOptions0) {
        boolean z = appUpdateOptions0.allowAssetPackDeletion();
        Map map0 = this.o;
        if(z) {
            if(appUpdateOptions0.appUpdateType() == 0) {
                Set set0 = (Set)map0.get("nonblocking.destructive.intent");
                return set0 == null ? new HashSet() : set0;
            }
            Set set1 = (Set)map0.get("blocking.destructive.intent");
            return set1 == null ? new HashSet() : set1;
        }
        if(appUpdateOptions0.appUpdateType() == 0) {
            Set set2 = (Set)map0.get("nonblocking.intent");
            return set2 == null ? new HashSet() : set2;
        }
        Set set3 = (Set)map0.get("blocking.intent");
        return set3 == null ? new HashSet() : set3;
    }

    @InstallStatus
    public int installStatus() {
        return this.d;
    }

    public boolean isUpdateTypeAllowed(@AppUpdateType int v) {
        return this.a(AppUpdateOptions.defaultOptions(v)) != null;
    }

    public boolean isUpdateTypeAllowed(@NonNull AppUpdateOptions appUpdateOptions0) {
        return this.a(appUpdateOptions0) != null;
    }

    @NonNull
    public String packageName() {
        return this.a;
    }

    public long totalBytesToDownload() {
        return this.h;
    }

    @UpdateAvailability
    public int updateAvailability() {
        return this.c;
    }

    public int updatePriority() {
        return this.f;
    }

    public static AppUpdateInfo zzb(@NonNull String s, int v, @UpdateAvailability int v1, @InstallStatus int v2, @Nullable Integer integer0, int v3, long v4, long v5, long v6, long v7, @Nullable PendingIntent pendingIntent0, @Nullable PendingIntent pendingIntent1, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, Map map0) {
        return new AppUpdateInfo(s, v, v1, v2, integer0, v3, v4, v5, v6, v7, pendingIntent0, pendingIntent1, pendingIntent2, pendingIntent3, map0);
    }
}

