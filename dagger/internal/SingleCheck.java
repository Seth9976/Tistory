package dagger.internal;

public final class SingleCheck implements Provider {
    public volatile Provider a;
    public volatile Object b;
    public static final Object c;

    static {
        SingleCheck.c = new Object();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        Object object0 = this.b;
        if(object0 == SingleCheck.c) {
            Provider provider0 = this.a;
            if(provider0 == null) {
                return this.b;
            }
            object0 = provider0.get();
            this.b = object0;
            this.a = null;
        }
        return object0;
    }

    public static Provider provider(Provider provider0) {
        if(!(provider0 instanceof SingleCheck) && !(provider0 instanceof DoubleCheck)) {
            Provider provider1 = (Provider)Preconditions.checkNotNull(provider0);
            Provider provider2 = new SingleCheck();  // 初始化器: Ljava/lang/Object;-><init>()V
            provider2.b = SingleCheck.c;
            provider2.a = provider1;
            return provider2;
        }
        return provider0;
    }

    public static javax.inject.Provider provider(javax.inject.Provider provider0) {
        return SingleCheck.provider(Providers.asDaggerProvider(provider0));
    }
}

