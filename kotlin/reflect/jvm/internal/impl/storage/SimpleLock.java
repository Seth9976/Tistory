package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SimpleLock {
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final DefaultSimpleLock simpleLock(@Nullable Runnable runnable0, @Nullable Function1 function10) {
            return runnable0 != null && function10 != null ? new CancellableSimpleLock(runnable0, function10) : new DefaultSimpleLock(null, 1, null);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        SimpleLock.Companion = Companion.a;
    }

    void lock();

    void unlock();
}

