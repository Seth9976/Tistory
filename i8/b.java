package i8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest.Builder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;

public final class b implements AppUpdateManager {
    public final h a;
    public final zzc b;
    public final Context c;
    public final Handler d;

    public b(h h0, zzc zzc0, Context context0) {
        this.d = new Handler(Looper.getMainLooper());
        this.a = h0;
        this.b = zzc0;
        this.c = context0;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task completeUpdate() {
        h h0 = this.a;
        zzx zzx0 = h0.a;
        if(zzx0 == null) {
            h.e.zzb("onError(%d)", new Object[]{-9});
            return Tasks.forException(new InstallException(-9));
        }
        h.e.zzd("completeUpdate(%s)", new Object[]{"net.daum.android.tistoryapp"});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        zzx0.zzs(new d(h0, taskCompletionSource0, taskCompletionSource0, "net.daum.android.tistoryapp", 1), taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task getAppUpdateInfo() {
        h h0 = this.a;
        zzx zzx0 = h0.a;
        if(zzx0 == null) {
            h.e.zzb("onError(%d)", new Object[]{-9});
            return Tasks.forException(new InstallException(-9));
        }
        h.e.zzd("requestUpdateInfo(%s)", new Object[]{"net.daum.android.tistoryapp"});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        zzx0.zzs(new d(h0, taskCompletionSource0, "net.daum.android.tistoryapp", taskCompletionSource0), taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final void registerListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        synchronized(this) {
            this.b.zzb(installStateUpdatedListener0);
        }
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task startUpdateFlow(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0) {
        if(appUpdateInfo0 != null && activity0 != null && appUpdateOptions0 != null && !appUpdateInfo0.p) {
            if(!appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0)) {
                return Tasks.forException(new InstallException(-6));
            }
            appUpdateInfo0.p = true;
            Intent intent0 = new Intent(activity0, PlayCoreDialogWrapperActivity.class);
            intent0.putExtra("confirmation_intent", appUpdateInfo0.a(appUpdateOptions0));
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
            intent0.putExtra("result_receiver", new a(this.d, taskCompletionSource0));
            activity0.startActivity(intent0);
            return taskCompletionSource0.getTask();
        }
        return Tasks.forException(new InstallException(-4));
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, int v, Activity activity0, int v1) {
        AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.defaultOptions(v);
        boolean z = false;
        if(activity0 == null) {
            return false;
        }
        if(appUpdateInfo0 != null && appUpdateOptions0 != null && appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && !appUpdateInfo0.p) {
            z = true;
            appUpdateInfo0.p = true;
            activity0.startIntentSenderForResult(appUpdateInfo0.a(appUpdateOptions0).getIntentSender(), v1, null, 0, 0, 0, null);
        }
        return z;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, int v, IntentSenderForResultStarter intentSenderForResultStarter0, int v1) {
        return this.startUpdateFlowForResult(appUpdateInfo0, intentSenderForResultStarter0, AppUpdateOptions.defaultOptions(v), v1);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0, int v) {
        boolean z = false;
        if(activity0 == null) {
            return false;
        }
        if(appUpdateInfo0 != null && appUpdateOptions0 != null && appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && !appUpdateInfo0.p) {
            z = true;
            appUpdateInfo0.p = true;
            activity0.startIntentSenderForResult(appUpdateInfo0.a(appUpdateOptions0).getIntentSender(), v, null, 0, 0, 0, null);
        }
        return z;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, ActivityResultLauncher activityResultLauncher0, AppUpdateOptions appUpdateOptions0) {
        if(appUpdateInfo0 != null && activityResultLauncher0 != null && appUpdateOptions0 != null && appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && !appUpdateInfo0.p) {
            appUpdateInfo0.p = true;
            activityResultLauncher0.launch(new Builder(appUpdateInfo0.a(appUpdateOptions0).getIntentSender()).build());
            return true;
        }
        return false;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, IntentSenderForResultStarter intentSenderForResultStarter0, AppUpdateOptions appUpdateOptions0, int v) {
        if(appUpdateInfo0 != null && intentSenderForResultStarter0 != null && appUpdateOptions0 != null && appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && !appUpdateInfo0.p) {
            appUpdateInfo0.p = true;
            intentSenderForResultStarter0.startIntentSenderForResult(appUpdateInfo0.a(appUpdateOptions0).getIntentSender(), v, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        synchronized(this) {
            this.b.zzc(installStateUpdatedListener0);
        }
    }
}

