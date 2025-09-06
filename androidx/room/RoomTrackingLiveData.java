package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"RestrictedApi"})
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u000E\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\u0012\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001F\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010%\u001A\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0017\u0010+\u001A\u00020&8\u0006¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u0017\u0010.\u001A\u00020&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001A\u0004\b-\u0010*R\u0017\u00101\u001A\u00020&8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001A\u0004\b0\u0010*R\u0017\u00107\u001A\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u0017\u0010:\u001A\u0002028\u0006¢\u0006\f\n\u0004\b8\u00104\u001A\u0004\b9\u00106R\u0011\u0010>\u001A\u00020;8F¢\u0006\u0006\u001A\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/InvalidationLiveDataContainer;", "container", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "", "onActive", "()V", "onInactive", "o", "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", "q", "Z", "getInTransaction", "()Z", "r", "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "Landroidx/room/InvalidationTracker$Observer;", "s", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "t", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "u", "getComputing", "computing", "v", "getRegisteredObserver", "registeredObserver", "Ljava/lang/Runnable;", "w", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "refreshRunnable", "x", "getInvalidationRunnable", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RoomTrackingLiveData extends LiveData {
    public final RoomDatabase o;
    public final InvalidationLiveDataContainer p;
    public final boolean q;
    public final Callable r;
    public final androidx.room.RoomTrackingLiveData.observer.1 s;
    public final AtomicBoolean t;
    public final AtomicBoolean u;
    public final AtomicBoolean v;
    public final f1 w;
    public final f1 x;

    public RoomTrackingLiveData(@NotNull RoomDatabase roomDatabase0, @NotNull InvalidationLiveDataContainer invalidationLiveDataContainer0, boolean z, @NotNull Callable callable0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "database");
        Intrinsics.checkNotNullParameter(invalidationLiveDataContainer0, "container");
        Intrinsics.checkNotNullParameter(callable0, "computeFunction");
        Intrinsics.checkNotNullParameter(arr_s, "tableNames");
        super();
        this.o = roomDatabase0;
        this.p = invalidationLiveDataContainer0;
        this.q = z;
        this.r = callable0;
        this.s = new Observer(this) {
            @Override  // androidx.room.InvalidationTracker$Observer
            public void onInvalidated(@NotNull Set set0) {
                Intrinsics.checkNotNullParameter(set0, "tables");
                ArchTaskExecutor.getInstance().executeOnMainThread(this.b.getInvalidationRunnable());
            }
        };
        this.t = new AtomicBoolean(true);
        this.u = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.w = new f1(this, 0);
        this.x = new f1(this, 1);
    }

    @NotNull
    public final Callable getComputeFunction() {
        return this.r;
    }

    @NotNull
    public final AtomicBoolean getComputing() {
        return this.u;
    }

    @NotNull
    public final RoomDatabase getDatabase() {
        return this.o;
    }

    public final boolean getInTransaction() {
        return this.q;
    }

    @NotNull
    public final AtomicBoolean getInvalid() {
        return this.t;
    }

    @NotNull
    public final Runnable getInvalidationRunnable() {
        return this.x;
    }

    @NotNull
    public final Observer getObserver() {
        return this.s;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final Executor getQueryExecutor() {
        return this.q ? this.o.getTransactionExecutor() : this.o.getQueryExecutor();
    }

    @NotNull
    public final Runnable getRefreshRunnable() {
        return this.w;
    }

    @NotNull
    public final AtomicBoolean getRegisteredObserver() {
        return this.v;
    }

    @Override  // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        this.p.onActive(this);
        this.getQueryExecutor().execute(this.w);
    }

    @Override  // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        this.p.onInactive(this);
    }
}

