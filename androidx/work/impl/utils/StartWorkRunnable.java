package androidx.work.impl.utils;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/work/impl/utils/StartWorkRunnable;", "Ljava/lang/Runnable;", "Landroidx/work/impl/Processor;", "processor", "Landroidx/work/impl/StartStopToken;", "startStopToken", "Landroidx/work/WorkerParameters$RuntimeExtras;", "runtimeExtras", "<init>", "(Landroidx/work/impl/Processor;Landroidx/work/impl/StartStopToken;Landroidx/work/WorkerParameters$RuntimeExtras;)V", "", "run", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StartWorkRunnable implements Runnable {
    public final Processor a;
    public final StartStopToken b;
    public final RuntimeExtras c;

    public StartWorkRunnable(@NotNull Processor processor0, @NotNull StartStopToken startStopToken0, @Nullable RuntimeExtras workerParameters$RuntimeExtras0) {
        Intrinsics.checkNotNullParameter(processor0, "processor");
        Intrinsics.checkNotNullParameter(startStopToken0, "startStopToken");
        super();
        this.a = processor0;
        this.b = startStopToken0;
        this.c = workerParameters$RuntimeExtras0;
    }

    @Override
    public void run() {
        this.a.startWork(this.b, this.c);
    }
}

