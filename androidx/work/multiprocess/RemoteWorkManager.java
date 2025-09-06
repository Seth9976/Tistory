package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class RemoteWorkManager {
    @NonNull
    public final RemoteWorkContinuation beginUniqueWork(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.beginUniqueWork(s, existingWorkPolicy0, Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract RemoteWorkContinuation beginUniqueWork(@NonNull String arg1, @NonNull ExistingWorkPolicy arg2, @NonNull List arg3);

    @NonNull
    public final RemoteWorkContinuation beginWith(@NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.beginWith(Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract RemoteWorkContinuation beginWith(@NonNull List arg1);

    @NonNull
    public abstract ListenableFuture cancelAllWork();

    @NonNull
    public abstract ListenableFuture cancelAllWorkByTag(@NonNull String arg1);

    @NonNull
    public abstract ListenableFuture cancelUniqueWork(@NonNull String arg1);

    @NonNull
    public abstract ListenableFuture cancelWorkById(@NonNull UUID arg1);

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract ListenableFuture enqueue(@NonNull WorkContinuation arg1);

    @NonNull
    public abstract ListenableFuture enqueue(@NonNull WorkRequest arg1);

    @NonNull
    public abstract ListenableFuture enqueue(@NonNull List arg1);

    @NonNull
    public abstract ListenableFuture enqueueUniquePeriodicWork(@NonNull String arg1, @NonNull ExistingPeriodicWorkPolicy arg2, @NonNull PeriodicWorkRequest arg3);

    @NonNull
    public final ListenableFuture enqueueUniqueWork(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.enqueueUniqueWork(s, existingWorkPolicy0, Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract ListenableFuture enqueueUniqueWork(@NonNull String arg1, @NonNull ExistingWorkPolicy arg2, @NonNull List arg3);

    @NonNull
    public static RemoteWorkManager getInstance(@NonNull Context context0) {
        RemoteWorkManager remoteWorkManager0 = WorkManagerImpl.getInstance(context0).getRemoteWorkManager();
        if(remoteWorkManager0 == null) {
            throw new IllegalStateException("Unable to initialize RemoteWorkManager");
        }
        return remoteWorkManager0;
    }

    @NonNull
    public abstract ListenableFuture getWorkInfos(@NonNull WorkQuery arg1);

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract ListenableFuture setForegroundAsync(@NonNull String arg1, @NonNull ForegroundInfo arg2);

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract ListenableFuture setProgress(@NonNull UUID arg1, @NonNull Data arg2);
}

