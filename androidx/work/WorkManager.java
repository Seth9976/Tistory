package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.Flow;

@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {
    public static enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN;

    }

    @NonNull
    public final WorkContinuation beginUniqueWork(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.beginUniqueWork(s, existingWorkPolicy0, Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract WorkContinuation beginUniqueWork(@NonNull String arg1, @NonNull ExistingWorkPolicy arg2, @NonNull List arg3);

    @NonNull
    public final WorkContinuation beginWith(@NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.beginWith(Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract WorkContinuation beginWith(@NonNull List arg1);

    @NonNull
    public abstract Operation cancelAllWork();

    @NonNull
    public abstract Operation cancelAllWorkByTag(@NonNull String arg1);

    @NonNull
    public abstract Operation cancelUniqueWork(@NonNull String arg1);

    @NonNull
    public abstract Operation cancelWorkById(@NonNull UUID arg1);

    @NonNull
    public abstract PendingIntent createCancelPendingIntent(@NonNull UUID arg1);

    @NonNull
    public final Operation enqueue(@NonNull WorkRequest workRequest0) {
        return this.enqueue(Collections.singletonList(workRequest0));
    }

    @NonNull
    public abstract Operation enqueue(@NonNull List arg1);

    @NonNull
    public abstract Operation enqueueUniquePeriodicWork(@NonNull String arg1, @NonNull ExistingPeriodicWorkPolicy arg2, @NonNull PeriodicWorkRequest arg3);

    @NonNull
    public Operation enqueueUniqueWork(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.enqueueUniqueWork(s, existingWorkPolicy0, Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract Operation enqueueUniqueWork(@NonNull String arg1, @NonNull ExistingWorkPolicy arg2, @NonNull List arg3);

    @NonNull
    public abstract Configuration getConfiguration();

    @NonNull
    @Deprecated
    public static WorkManager getInstance() {
        WorkManager workManager0 = WorkManagerImpl.getInstance();
        if(workManager0 == null) {
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }
        return workManager0;
    }

    @NonNull
    public static WorkManager getInstance(@NonNull Context context0) {
        return WorkManagerImpl.getInstance(context0);
    }

    @NonNull
    public abstract ListenableFuture getLastCancelAllTimeMillis();

    @NonNull
    public abstract LiveData getLastCancelAllTimeMillisLiveData();

    @NonNull
    public abstract ListenableFuture getWorkInfoById(@NonNull UUID arg1);

    @NonNull
    public abstract Flow getWorkInfoByIdFlow(@NonNull UUID arg1);

    @NonNull
    public abstract LiveData getWorkInfoByIdLiveData(@NonNull UUID arg1);

    @NonNull
    public abstract ListenableFuture getWorkInfos(@NonNull WorkQuery arg1);

    @NonNull
    public abstract ListenableFuture getWorkInfosByTag(@NonNull String arg1);

    @NonNull
    public abstract Flow getWorkInfosByTagFlow(@NonNull String arg1);

    @NonNull
    public abstract LiveData getWorkInfosByTagLiveData(@NonNull String arg1);

    @NonNull
    public abstract Flow getWorkInfosFlow(@NonNull WorkQuery arg1);

    @NonNull
    public abstract ListenableFuture getWorkInfosForUniqueWork(@NonNull String arg1);

    @NonNull
    public abstract Flow getWorkInfosForUniqueWorkFlow(@NonNull String arg1);

    @NonNull
    public abstract LiveData getWorkInfosForUniqueWorkLiveData(@NonNull String arg1);

    @NonNull
    public abstract LiveData getWorkInfosLiveData(@NonNull WorkQuery arg1);

    public static void initialize(@NonNull Context context0, @NonNull Configuration configuration0) {
        WorkManagerImpl.initialize(context0, configuration0);
    }

    public static boolean isInitialized() {
        return WorkManagerImpl.isInitialized();
    }

    @NonNull
    public abstract Operation pruneWork();

    @NonNull
    public abstract ListenableFuture updateWork(@NonNull WorkRequest arg1);
}

