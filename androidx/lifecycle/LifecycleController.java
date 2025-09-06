package androidx.lifecycle;

import androidx.activity.e;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@MainThread
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minState", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Lkotlinx/coroutines/Job;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;Lkotlinx/coroutines/Job;)V", "", "finish", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLifecycleController.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,71:1\n57#1,3:72\n57#1,3:75\n*S KotlinDebug\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:72,3\n36#1:75,3\n*E\n"})
public final class LifecycleController {
    public final Lifecycle a;
    public final State b;
    public final DispatchQueue c;
    public final e d;

    public LifecycleController(@NotNull Lifecycle lifecycle0, @NotNull State lifecycle$State0, @NotNull DispatchQueue dispatchQueue0, @NotNull Job job0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycle$State0, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue0, "dispatchQueue");
        Intrinsics.checkNotNullParameter(job0, "parentJob");
        super();
        this.a = lifecycle0;
        this.b = lifecycle$State0;
        this.c = dispatchQueue0;
        e e0 = new e(2, this, job0);
        this.d = e0;
        if(lifecycle0.getCurrentState() == State.DESTROYED) {
            DefaultImpls.cancel$default(job0, null, 1, null);
            this.finish();
            return;
        }
        lifecycle0.addObserver(e0);
    }

    @MainThread
    public final void finish() {
        this.a.removeObserver(this.d);
        this.c.finish();
    }
}

