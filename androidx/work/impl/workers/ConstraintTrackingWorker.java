package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.activity.h;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001B\u001A\u0004\u0018\u00010\u00012\b\u0010\u0016\u001A\u0004\u0018\u00010\u00018G@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/ListenableWorker;", "Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "", "onStopped", "()V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroidx/work/impl/constraints/ConstraintsState;", "state", "onConstraintsStateChanged", "(Landroidx/work/impl/model/WorkSpec;Landroidx/work/impl/constraints/ConstraintsState;)V", "<set-?>", "i", "Landroidx/work/ListenableWorker;", "getDelegate", "()Landroidx/work/ListenableWorker;", "delegate", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
public final class ConstraintTrackingWorker extends ListenableWorker implements OnConstraintsStateChangedListener {
    public final WorkerParameters e;
    public final Object f;
    public volatile boolean g;
    public final SettableFuture h;
    public ListenableWorker i;

    public ConstraintTrackingWorker(@NotNull Context context0, @NotNull WorkerParameters workerParameters0) {
        Intrinsics.checkNotNullParameter(context0, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters0, "workerParameters");
        super(context0, workerParameters0);
        this.e = workerParameters0;
        this.f = new Object();
        this.h = SettableFuture.create();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    @Nullable
    public final ListenableWorker getDelegate() {
        return this.i;
    }

    @Override  // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NotNull WorkSpec workSpec0, @NotNull ConstraintsState constraintsState0) {
        Intrinsics.checkNotNullParameter(workSpec0, "workSpec");
        Intrinsics.checkNotNullParameter(constraintsState0, "state");
        Logger.get().debug("WM-ConstraintTrkngWrkr", "Constraints changed for " + workSpec0);
        if(constraintsState0 instanceof ConstraintsNotMet) {
            synchronized(this.f) {
                this.g = true;
            }
        }
    }

    @Override  // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker0 = this.i;
        if(listenableWorker0 != null && !listenableWorker0.isStopped()) {
            listenableWorker0.stop((Build.VERSION.SDK_INT < 0x1F ? 0 : this.getStopReason()));
        }
    }

    @Override  // androidx.work.ListenableWorker
    @NotNull
    public ListenableFuture startWork() {
        this.getBackgroundExecutor().execute(new h(this, 29));
        Intrinsics.checkNotNullExpressionValue(this.h, "future");
        return this.h;
    }
}

