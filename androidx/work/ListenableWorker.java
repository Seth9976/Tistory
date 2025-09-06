package androidx.work;

import android.content.Context;
import android.net.Network;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    public static abstract class Result {
        @RestrictTo({Scope.LIBRARY_GROUP})
        public static final class Failure extends Result {
            public final Data a;

            public Failure() {
                this(Data.EMPTY);
            }

            public Failure(@NonNull Data data0) {
                this.a = data0;
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return Failure.class == class0 ? this.a.equals(((Failure)object0).a) : false;
                }
                return false;
            }

            @Override  // androidx.work.ListenableWorker$Result
            @NonNull
            public Data getOutputData() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a.hashCode() + 846803280;
            }

            @Override
            @NonNull
            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public static final class Retry extends Result {
            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return Retry.class == class0;
                }
                return false;
            }

            @Override  // androidx.work.ListenableWorker$Result
            @NonNull
            public Data getOutputData() {
                return Data.EMPTY;
            }

            @Override
            public int hashCode() {
                return 0x18BE74E;
            }

            @Override
            @NonNull
            public String toString() {
                return "Retry";
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public static final class Success extends Result {
            public final Data a;

            public Success() {
                this(Data.EMPTY);
            }

            public Success(@NonNull Data data0) {
                this.a = data0;
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return Success.class == class0 ? this.a.equals(((Success)object0).a) : false;
                }
                return false;
            }

            @Override  // androidx.work.ListenableWorker$Result
            @NonNull
            public Data getOutputData() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a.hashCode() - 0x6FDE0E09;
            }

            @Override
            @NonNull
            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }
        }

        @NonNull
        public static Result failure() {
            return new Failure();
        }

        @NonNull
        public static Result failure(@NonNull Data data0) {
            return new Failure(data0);
        }

        @NonNull
        public abstract Data getOutputData();

        @NonNull
        public static Result retry() {
            return new Retry();
        }

        @NonNull
        public static Result success() {
            return new Success();
        }

        @NonNull
        public static Result success(@NonNull Data data0) {
            return new Success(data0);
        }
    }

    public final Context a;
    public final WorkerParameters b;
    public volatile int c;
    public boolean d;

    public ListenableWorker(@NonNull Context context0, @NonNull WorkerParameters workerParameters0) {
        this.c = 0xFFFFFF00;
        if(context0 == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if(workerParameters0 == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context0;
        this.b = workerParameters0;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.a;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.b.getBackgroundExecutor();
    }

    @NonNull
    public ListenableFuture getForegroundInfoAsync() {
        ListenableFuture listenableFuture0 = SettableFuture.create();
        ((SettableFuture)listenableFuture0).setException(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return listenableFuture0;
    }

    @NonNull
    public final UUID getId() {
        return this.b.getId();
    }

    @NonNull
    public final Data getInputData() {
        return this.b.getInputData();
    }

    @Nullable
    @RequiresApi(28)
    public final Network getNetwork() {
        return this.b.getNetwork();
    }

    @IntRange(from = 0L)
    public final int getRunAttemptCount() {
        return this.b.getRunAttemptCount();
    }

    @RequiresApi(0x1F)
    public final int getStopReason() {
        return this.c;
    }

    @NonNull
    public final Set getTags() {
        return this.b.getTags();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public TaskExecutor getTaskExecutor() {
        return this.b.getTaskExecutor();
    }

    @NonNull
    @RequiresApi(24)
    public final List getTriggeredContentAuthorities() {
        return this.b.getTriggeredContentAuthorities();
    }

    @NonNull
    @RequiresApi(24)
    public final List getTriggeredContentUris() {
        return this.b.getTriggeredContentUris();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.b.getWorkerFactory();
    }

    public final boolean isStopped() {
        return this.c != 0xFFFFFF00;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.d;
    }

    public void onStopped() {
    }

    @NonNull
    public final ListenableFuture setForegroundAsync(@NonNull ForegroundInfo foregroundInfo0) {
        return this.b.getForegroundUpdater().setForegroundAsync(this.getApplicationContext(), this.getId(), foregroundInfo0);
    }

    @NonNull
    public ListenableFuture setProgressAsync(@NonNull Data data0) {
        return this.b.getProgressUpdater().updateProgress(this.getApplicationContext(), this.getId(), data0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setUsed() {
        this.d = true;
    }

    @MainThread
    @NonNull
    public abstract ListenableFuture startWork();

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void stop(int v) {
        this.c = v;
        this.onStopped();
    }
}

