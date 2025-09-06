package dagger.internal;

import dagger.Lazy;

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

    @Override  // dagger.Lazy, javax.inject.Provider
    public Object get() {
        Object object0 = this.b;
        Object object1 = DoubleCheck.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.b;
                if(object0 == object1) {
                    object0 = this.a.get();
                    Object object2 = this.b;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.b = object0;
                    this.a = null;
                }
            }
        }
        return object0;
    }

    public static Lazy lazy(Provider provider0) {
        return provider0 instanceof Lazy ? ((Lazy)provider0) : new DoubleCheck(((Provider)Preconditions.checkNotNull(provider0)));
    }

    @Deprecated
    public static Lazy lazy(javax.inject.Provider provider0) {
        return DoubleCheck.lazy(Providers.asDaggerProvider(provider0));
    }

    public static Provider provider(Provider provider0) {
        Preconditions.checkNotNull(provider0);
        return provider0 instanceof DoubleCheck ? provider0 : new DoubleCheck(provider0);
    }

    @Deprecated
    public static javax.inject.Provider provider(javax.inject.Provider provider0) {
        return DoubleCheck.provider(Providers.asDaggerProvider(provider0));
    }
}

