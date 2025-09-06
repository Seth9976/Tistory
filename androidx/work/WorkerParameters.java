package androidx.work;

import android.net.Network;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class RuntimeExtras {
        @Nullable
        @RequiresApi(28)
        public Network network;
        @NonNull
        public List triggeredContentAuthorities;
        @NonNull
        public List triggeredContentUris;

        public RuntimeExtras() {
            this.triggeredContentAuthorities = Collections.emptyList();
            this.triggeredContentUris = Collections.emptyList();
        }
    }

    public final UUID a;
    public final Data b;
    public final HashSet c;
    public final RuntimeExtras d;
    public final int e;
    public final Executor f;
    public final TaskExecutor g;
    public final WorkerFactory h;
    public final ProgressUpdater i;
    public final ForegroundUpdater j;
    public final int k;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uUID0, @NonNull Data data0, @NonNull Collection collection0, @NonNull RuntimeExtras workerParameters$RuntimeExtras0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @NonNull Executor executor0, @NonNull TaskExecutor taskExecutor0, @NonNull WorkerFactory workerFactory0, @NonNull ProgressUpdater progressUpdater0, @NonNull ForegroundUpdater foregroundUpdater0) {
        this.a = uUID0;
        this.b = data0;
        this.c = new HashSet(collection0);
        this.d = workerParameters$RuntimeExtras0;
        this.e = v;
        this.k = v1;
        this.f = executor0;
        this.g = taskExecutor0;
        this.h = workerFactory0;
        this.i = progressUpdater0;
        this.j = foregroundUpdater0;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.f;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public ForegroundUpdater getForegroundUpdater() {
        return this.j;
    }

    @IntRange(from = 0L)
    public int getGeneration() {
        return this.k;
    }

    @NonNull
    public UUID getId() {
        return this.a;
    }

    @NonNull
    public Data getInputData() {
        return this.b;
    }

    @Nullable
    @RequiresApi(28)
    public Network getNetwork() {
        return this.d.network;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public ProgressUpdater getProgressUpdater() {
        return this.i;
    }

    @IntRange(from = 0L)
    public int getRunAttemptCount() {
        return this.e;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public RuntimeExtras getRuntimeExtras() {
        return this.d;
    }

    @NonNull
    public Set getTags() {
        return this.c;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public TaskExecutor getTaskExecutor() {
        return this.g;
    }

    @NonNull
    @RequiresApi(24)
    public List getTriggeredContentAuthorities() {
        return this.d.triggeredContentAuthorities;
    }

    @NonNull
    @RequiresApi(24)
    public List getTriggeredContentUris() {
        return this.d.triggeredContentUris;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.h;
    }
}

