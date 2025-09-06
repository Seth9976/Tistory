package androidx.work.impl.utils;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BB!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/utils/StopWorkRunnable;", "Ljava/lang/Runnable;", "Landroidx/work/impl/Processor;", "processor", "Landroidx/work/impl/StartStopToken;", "token", "", "stopInForeground", "", "reason", "<init>", "(Landroidx/work/impl/Processor;Landroidx/work/impl/StartStopToken;ZI)V", "(Landroidx/work/impl/Processor;Landroidx/work/impl/StartStopToken;Z)V", "", "run", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StopWorkRunnable implements Runnable {
    public final Processor a;
    public final StartStopToken b;
    public final boolean c;
    public final int d;

    public StopWorkRunnable(@NotNull Processor processor0, @NotNull StartStopToken startStopToken0, boolean z) {
        Intrinsics.checkNotNullParameter(processor0, "processor");
        Intrinsics.checkNotNullParameter(startStopToken0, "token");
        this(processor0, startStopToken0, z, 0xFFFFFE00);
    }

    public StopWorkRunnable(@NotNull Processor processor0, @NotNull StartStopToken startStopToken0, boolean z, int v) {
        Intrinsics.checkNotNullParameter(processor0, "processor");
        Intrinsics.checkNotNullParameter(startStopToken0, "token");
        super();
        this.a = processor0;
        this.b = startStopToken0;
        this.c = z;
        this.d = v;
    }

    @Override
    public void run() {
        boolean z = this.c ? this.a.stopForegroundWork(this.b, this.d) : this.a.stopWork(this.b, this.d);
        Logger.get().debug("WM-StopWorkRunnable", "StopWorkRunnable for " + this.b.getId().getWorkSpecId() + "; Processor.stopWork = " + z);
    }
}

