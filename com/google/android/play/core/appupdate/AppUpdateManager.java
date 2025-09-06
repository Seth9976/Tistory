package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;

public interface AppUpdateManager {
    @NonNull
    Task completeUpdate();

    @NonNull
    Task getAppUpdateInfo();

    void registerListener(@NonNull InstallStateUpdatedListener arg1);

    Task startUpdateFlow(@NonNull AppUpdateInfo arg1, @NonNull Activity arg2, @NonNull AppUpdateOptions arg3);

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo arg1, @AppUpdateType int arg2, @NonNull Activity arg3, int arg4) throws IntentSender.SendIntentException;

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo arg1, @AppUpdateType int arg2, @NonNull IntentSenderForResultStarter arg3, int arg4) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo arg1, @NonNull Activity arg2, @NonNull AppUpdateOptions arg3, int arg4) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo arg1, @NonNull ActivityResultLauncher arg2, @NonNull AppUpdateOptions arg3);

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo arg1, @NonNull IntentSenderForResultStarter arg2, @NonNull AppUpdateOptions arg3, int arg4) throws IntentSender.SendIntentException;

    void unregisterListener(@NonNull InstallStateUpdatedListener arg1);
}

