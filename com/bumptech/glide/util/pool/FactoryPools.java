package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import androidx.core.util.Pools.SynchronizedPool;

public final class FactoryPools {
    public interface Factory {
        Object create();
    }

    public interface Poolable {
        @NonNull
        StateVerifier getVerifier();
    }

    public interface Resetter {
        void reset(@NonNull Object arg1);
    }

    public static final a a;

    static {
        FactoryPools.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NonNull
    public static Pool simple(int v, @NonNull Factory factoryPools$Factory0) {
        return new d(new SimplePool(v), factoryPools$Factory0, FactoryPools.a);
    }

    @NonNull
    public static Pool threadSafe(int v, @NonNull Factory factoryPools$Factory0) {
        return new d(new SynchronizedPool(v), factoryPools$Factory0, FactoryPools.a);
    }

    @NonNull
    public static Pool threadSafeList() {
        return FactoryPools.threadSafeList(20);
    }

    @NonNull
    public static Pool threadSafeList(int v) {
        return new d(new SynchronizedPool(v), new b(), new c());  // 初始化器: Ljava/lang/Object;-><init>()V / 初始化器: Ljava/lang/Object;-><init>()V
    }
}

