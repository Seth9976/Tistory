package x1;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import java.util.concurrent.CancellationException;

public final class a extends CancellationException {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/util/concurrent/CancellationException;-><init>()V
    }

    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(SuspendingPointerInputFilterKt.b);
        return this;
    }
}

