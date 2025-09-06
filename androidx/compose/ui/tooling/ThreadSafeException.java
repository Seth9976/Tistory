package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Landroidx/compose/ui/tooling/ThreadSafeException;", "", "<init>", "()V", "", "throwable", "", "set", "(Ljava/lang/Throwable;)V", "throwIfPresent", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ThreadSafeException {
    public static final int $stable = 8;
    public Throwable a;
    public final Object b;

    public ThreadSafeException() {
        this.b = new Object();
    }

    public final void set(@NotNull Throwable throwable0) {
        synchronized(this.b) {
            this.a = throwable0;
        }
    }

    public final void throwIfPresent() {
        Throwable throwable0;
        synchronized(this.b) {
            throwable0 = this.a;
            if(throwable0 == null) {
                return;
            }
            this.a = null;
        }
        throw throwable0;
    }
}

