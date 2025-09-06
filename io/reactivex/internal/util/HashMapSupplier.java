package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public enum HashMapSupplier implements Callable {
    INSTANCE;

    public static Callable asCallable() {
        return HashMapSupplier.INSTANCE;
    }

    @Override
    public Object call() throws Exception {
        return this.call();
    }

    public Map call() throws Exception {
        return new HashMap();
    }
}

