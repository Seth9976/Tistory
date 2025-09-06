package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallErrorCode;
import java.util.ArrayList;
import java.util.HashMap;

public class FakeAppUpdateManager implements AppUpdateManager {
    public final zzc a;
    public final Context b;
    public final ArrayList c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public Integer h;
    public int i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Integer o;

    public FakeAppUpdateManager(Context context0) {
        this.c = new ArrayList();
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = 0;
        this.h = null;
        this.i = 0;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
        this.m = false;
        this.n = false;
        this.a = new zzc(context0);
        this.b = context0;
    }

    public final void a() {
        InstallState installState0 = InstallState.zza(this.d, this.j, this.k, this.e, "net.daum.android.tistoryapp");
        this.a.zzd(installState0);
    }

    public final boolean b(AppUpdateInfo appUpdateInfo0, AppUpdateOptions appUpdateOptions0) {
        if(!appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && (!AppUpdateOptions.defaultOptions(appUpdateOptions0.appUpdateType()).equals(appUpdateOptions0) || !appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0.appUpdateType()))) {
            return false;
        }
        if(appUpdateOptions0.appUpdateType() == 1) {
            this.m = true;
            this.o = 1;
            return true;
        }
        this.l = true;
        this.o = 0;
        return true;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public Task completeUpdate() {
        if(this.e != 0) {
            return Tasks.forException(new InstallException(this.e));
        }
        int v = this.d;
        if(v == 11) {
            this.d = 3;
            this.n = true;
            if(0.equals(this.o)) {
                this.a();
            }
            return Tasks.forResult(null);
        }
        return v == 3 ? Tasks.forException(new InstallException(-8)) : Tasks.forException(new InstallException(-7));
    }

    public void downloadCompletes() {
        if(this.d == 1 || this.d == 2) {
            this.d = 11;
            this.j = 0L;
            this.k = 0L;
            if(0.equals(this.o)) {
                this.a();
                return;
            }
            if(1.equals(this.o)) {
                this.completeUpdate();
            }
        }
    }

    public void downloadFails() {
        if(this.d != 1 && this.d != 2) {
            return;
        }
        this.d = 5;
        if(0.equals(this.o)) {
            this.a();
        }
        this.o = null;
        this.m = false;
        this.d = 0;
    }

    public void downloadStarts() {
        if(this.d == 1) {
            this.d = 2;
            if(0.equals(this.o)) {
                this.a();
            }
        }
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public Task getAppUpdateInfo() {
        PendingIntent pendingIntent6;
        PendingIntent pendingIntent5;
        PendingIntent pendingIntent4;
        PendingIntent pendingIntent3;
        PendingIntent pendingIntent1;
        PendingIntent pendingIntent0;
        int v;
        if(this.e != 0) {
            return Tasks.forException(new InstallException(this.e));
        }
        if(!this.f) {
            v = 1;
        }
        else if(this.d != 0 && this.d != 4 && this.d != 5 && this.d != 6) {
            v = 3;
        }
        else {
            v = 2;
        }
        Context context0 = this.b;
        if(v == 2) {
            ArrayList arrayList0 = this.c;
            if(arrayList0.contains(0)) {
                pendingIntent0 = PendingIntent.getBroadcast(context0, 0, new Intent(), 0x4000000);
                pendingIntent1 = PendingIntent.getBroadcast(context0, 0, new Intent(), 0x4000000);
            }
            else {
                pendingIntent0 = null;
                pendingIntent1 = null;
            }
            if(arrayList0.contains(1)) {
                PendingIntent pendingIntent2 = PendingIntent.getBroadcast(context0, 0, new Intent(), 0x4000000);
                pendingIntent3 = PendingIntent.getBroadcast(context0, 0, new Intent(), 0x4000000);
                pendingIntent4 = pendingIntent2;
            }
            else {
                pendingIntent4 = null;
                pendingIntent3 = null;
            }
            pendingIntent5 = pendingIntent0;
            pendingIntent6 = pendingIntent1;
        }
        else {
            pendingIntent4 = null;
            pendingIntent5 = null;
            pendingIntent3 = null;
            pendingIntent6 = null;
        }
        int v1 = this.g;
        if(this.f) {
            return this.d == 0 || this.d == 4 || this.d == 5 || this.d == 6 ? Tasks.forResult(AppUpdateInfo.zzb("net.daum.android.tistoryapp", v1, 2, this.d, this.h, this.i, this.j, this.k, 0L, 0L, pendingIntent4, pendingIntent5, pendingIntent3, pendingIntent6, new HashMap())) : Tasks.forResult(AppUpdateInfo.zzb("net.daum.android.tistoryapp", v1, 3, this.d, this.h, this.i, this.j, this.k, 0L, 0L, pendingIntent4, pendingIntent5, pendingIntent3, pendingIntent6, new HashMap()));
        }
        return Tasks.forResult(AppUpdateInfo.zzb("net.daum.android.tistoryapp", v1, 1, this.d, this.h, this.i, this.j, this.k, 0L, 0L, pendingIntent4, pendingIntent5, pendingIntent3, pendingIntent6, new HashMap()));
    }

    @Nullable
    @AppUpdateType
    public Integer getTypeForUpdateInProgress() {
        return this.o;
    }

    public void installCompletes() {
        if(this.d == 3) {
            this.d = 4;
            this.f = false;
            this.g = 0;
            this.h = null;
            this.i = 0;
            this.j = 0L;
            this.k = 0L;
            this.m = false;
            this.n = false;
            if(0.equals(this.o)) {
                this.a();
            }
            this.o = null;
            this.d = 0;
        }
    }

    public void installFails() {
        if(this.d == 3) {
            this.d = 5;
            if(0.equals(this.o)) {
                this.a();
            }
            this.o = null;
            this.n = false;
            this.m = false;
            this.d = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.l;
    }

    public boolean isImmediateFlowVisible() {
        return this.m;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.n;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public void registerListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        this.a.zzb(installStateUpdatedListener0);
    }

    public void setBytesDownloaded(long v) {
        if(this.d == 2 && v <= this.k) {
            this.j = v;
            if(0.equals(this.o)) {
                this.a();
            }
        }
    }

    public void setClientVersionStalenessDays(@Nullable Integer integer0) {
        if(this.f) {
            this.h = integer0;
        }
    }

    public void setInstallErrorCode(@InstallErrorCode int v) {
        this.e = v;
    }

    public void setTotalBytesToDownload(long v) {
        if(this.d == 2) {
            this.k = v;
            if(0.equals(this.o)) {
                this.a();
            }
        }
    }

    public void setUpdateAvailable(int v) {
        this.f = true;
        this.c.clear();
        this.c.add(0);
        this.c.add(1);
        this.g = v;
    }

    public void setUpdateAvailable(int v, @AppUpdateType int v1) {
        this.f = true;
        this.c.clear();
        this.c.add(v1);
        this.g = v;
    }

    public void setUpdateNotAvailable() {
        this.f = false;
        this.h = null;
    }

    public void setUpdatePriority(int v) {
        if(this.f) {
            this.i = v;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task startUpdateFlow(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0) {
        return this.b(appUpdateInfo0, appUpdateOptions0) ? Tasks.forResult(-1) : Tasks.forException(new InstallException(-6));
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, @AppUpdateType int v, Activity activity0, int v1) {
        return this.b(appUpdateInfo0, AppUpdateOptions.newBuilder(v).build());
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, @AppUpdateType int v, IntentSenderForResultStarter intentSenderForResultStarter0, int v1) {
        return this.b(appUpdateInfo0, AppUpdateOptions.newBuilder(v).build());
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0, int v) {
        return this.b(appUpdateInfo0, appUpdateOptions0);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, ActivityResultLauncher activityResultLauncher0, AppUpdateOptions appUpdateOptions0) {
        return this.b(appUpdateInfo0, appUpdateOptions0);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, IntentSenderForResultStarter intentSenderForResultStarter0, AppUpdateOptions appUpdateOptions0, int v) {
        return this.b(appUpdateInfo0, appUpdateOptions0);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        this.a.zzc(installStateUpdatedListener0);
    }

    public void userAcceptsUpdate() {
        if(this.l || this.m) {
            this.l = false;
            this.d = 1;
            if(0.equals(this.o)) {
                this.a();
            }
        }
    }

    public void userCancelsDownload() {
        if(this.d != 1 && this.d != 2) {
            return;
        }
        this.d = 6;
        if(0.equals(this.o)) {
            this.a();
        }
        this.o = null;
        this.m = false;
        this.d = 0;
    }

    public void userRejectsUpdate() {
        if(!this.l && !this.m) {
            return;
        }
        this.l = false;
        this.m = false;
        this.o = null;
        this.d = 0;
    }
}

