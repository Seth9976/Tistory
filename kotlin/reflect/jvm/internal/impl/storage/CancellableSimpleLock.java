package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class CancellableSimpleLock extends DefaultSimpleLock {
    public final Runnable b;
    public final Function1 c;

    public CancellableSimpleLock(@NotNull Runnable runnable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(runnable0, "checkCancelled");
        Intrinsics.checkNotNullParameter(function10, "interruptedExceptionHandler");
        this(new ReentrantLock(), runnable0, function10);
    }

    public CancellableSimpleLock(@NotNull Lock lock0, @NotNull Runnable runnable0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(lock0, "lock");
        Intrinsics.checkNotNullParameter(runnable0, "checkCancelled");
        Intrinsics.checkNotNullParameter(function10, "interruptedExceptionHandler");
        super(lock0);
        this.b = runnable0;
        this.c = function10;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock
    public void lock() {
        while(true) {
            try {
                if(this.getLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
                    break;
                }
                this.b.run();
            }
            catch(InterruptedException interruptedException0) {
                this.c.invoke(interruptedException0);
                break;
            }
        }
    }
}

