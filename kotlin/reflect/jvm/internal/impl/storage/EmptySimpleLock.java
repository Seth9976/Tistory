package kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;

public final class EmptySimpleLock implements SimpleLock {
    @NotNull
    public static final EmptySimpleLock INSTANCE;

    static {
        EmptySimpleLock.INSTANCE = new EmptySimpleLock();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }
}

