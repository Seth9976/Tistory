package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class DefaultSimpleLock implements SimpleLock {
    public final Lock a;

    public DefaultSimpleLock() {
        this(null, 1, null);
    }

    public DefaultSimpleLock(@NotNull Lock lock0) {
        Intrinsics.checkNotNullParameter(lock0, "lock");
        super();
        this.a = lock0;
    }

    public DefaultSimpleLock(Lock lock0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            lock0 = new ReentrantLock();
        }
        this(lock0);
    }

    @NotNull
    public final Lock getLock() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.a.lock();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
        this.a.unlock();
    }
}

