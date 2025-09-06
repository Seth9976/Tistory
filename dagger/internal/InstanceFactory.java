package dagger.internal;

import dagger.Lazy;

public final class InstanceFactory implements Lazy, Factory {
    public final Object a;
    public static final InstanceFactory b;

    static {
        InstanceFactory.b = new InstanceFactory(null);
    }

    public InstanceFactory(Object object0) {
        this.a = object0;
    }

    public static Factory create(Object object0) {
        return new InstanceFactory(Preconditions.checkNotNull(object0, "instance cannot be null"));
    }

    public static Factory createNullable(Object object0) {
        return object0 == null ? InstanceFactory.b : new InstanceFactory(object0);
    }

    @Override  // dagger.Lazy, javax.inject.Provider
    public Object get() {
        return this.a;
    }
}

