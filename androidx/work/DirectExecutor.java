package androidx.work;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002J\u0017\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Landroidx/work/DirectExecutor;", "", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "INSTANCE", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum DirectExecutor implements Executor {
    INSTANCE;

    @Override
    public void execute(@NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "command");
        runnable0.run();
    }

    @Override
    @NotNull
    public String toString() {
        return "DirectExecutor";
    }
}

