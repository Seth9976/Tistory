package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

public final class DoubleCheck implements Lazy, Provider {
    public volatile Provider a;
    public volatile Object b;
    public static final Object c;

    static {
        DoubleCheck.c = new Object();
    }

    public DoubleCheck(Provider provider0) {
        this.b = DoubleCheck.c;
        this.a = provider0;
    }

    @Override  // javax.inject.Provider, com.google.android.datatransport.runtime.dagger.Lazy
    public Object get() {
        Object object0 = this.b;
        Object object1 = DoubleCheck.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.b;
                if(object0 == object1) {
                    object0 = this.a.get();
                    this.b = DoubleCheck.reentrantCheck(this.b, object0);
                    this.a = null;
                }
            }
        }
        return object0;
    }

    public static Lazy lazy(Provider provider0) {
        return provider0 instanceof Lazy ? ((Lazy)provider0) : new DoubleCheck(((Provider)Preconditions.checkNotNull(provider0)));
    }

    public static Provider provider(Provider provider0) {
        Preconditions.checkNotNull(provider0);
        return provider0 instanceof DoubleCheck ? provider0 : new DoubleCheck(provider0);
    }

    public static Object reentrantCheck(Object object0, Object object1) {
        if(object0 != DoubleCheck.c && !(object0 instanceof MemoizedSentinel) && object0 != object1) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object0 + " & " + object1 + ". This is likely due to a circular dependency.");
        }
        return object1;
    }
}

