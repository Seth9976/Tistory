package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00028\u0000H%¢\u0006\u0004\b\n\u0010\u000BR\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\"\u0010\u0015\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u001B\u001A\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u001E\u001A\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u0018\u001A\u0004\b\u001D\u0010\u001AR\u001A\u0010 \u001A\u00020\u001F8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\tR\u001A\u0010#\u001A\u00020\u001F8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010!\u0012\u0004\b$\u0010\t¨\u0006%"}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "invalidate", "()V", "compute", "()Ljava/lang/Object;", "a", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "liveData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "d", "getComputing$lifecycle_livedata_release", "computing", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ComputableLiveData {
    public final Executor a;
    public final androidx.lifecycle.ComputableLiveData._liveData.1 b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    @JvmField
    @NotNull
    public final Runnable invalidationRunnable;
    @JvmField
    @NotNull
    public final Runnable refreshRunnable;

    @JvmOverloads
    public ComputableLiveData() {
        this(null, 1, null);
    }

    @JvmOverloads
    public ComputableLiveData(@NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(executor0, "executor");
        super();
        this.a = executor0;
        this.b = new LiveData() {
            @Override  // androidx.lifecycle.LiveData
            public void onActive() {
                this.o.getExecutor$lifecycle_livedata_release().execute(this.o.refreshRunnable);
            }
        };
        this.c = new AtomicBoolean(true);
        this.d = new AtomicBoolean(false);
        this.refreshRunnable = new f(this, 0);
        this.invalidationRunnable = new f(this, 1);
    }

    public ComputableLiveData(Executor executor0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            executor0 = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor0, "getIOThreadExecutor()");
        }
        this(executor0);
    }

    @WorkerThread
    public abstract Object compute();

    @NotNull
    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.d;
    }

    @NotNull
    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.a;
    }

    @NotNull
    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.c;
    }

    @VisibleForTesting
    public static void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @NotNull
    public LiveData getLiveData() {
        return this.b;
    }

    @VisibleForTesting
    public static void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }
}

