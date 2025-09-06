package androidx.work;

import a5.b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/work/ConfigurationKt$createDefaultExecutor$factory$1", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ConfigurationKt.createDefaultExecutor.factory.1 implements ThreadFactory {
    public final AtomicInteger a;
    public final boolean b;

    public ConfigurationKt.createDefaultExecutor.factory.1(boolean z) {
        this.b = z;
        this.a = new AtomicInteger(0);
    }

    @Override
    @NotNull
    public Thread newThread(@NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "runnable");
        StringBuilder stringBuilder0 = b.t((this.b ? "WM.task-" : "androidx.work-"));
        stringBuilder0.append(this.a.incrementAndGet());
        return new Thread(runnable0, stringBuilder0.toString());
    }
}

