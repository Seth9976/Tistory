package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public enum ArrayListSupplier implements Function, Callable {
    INSTANCE;

    @Override  // io.reactivex.functions.Function
    public Object apply(Object object0) throws Exception {
        return this.apply(object0);
    }

    public List apply(Object object0) throws Exception {
        return new ArrayList();
    }

    public static Callable asCallable() {
        return ArrayListSupplier.INSTANCE;
    }

    public static Function asFunction() {
        return ArrayListSupplier.INSTANCE;
    }

    @Override
    public Object call() throws Exception {
        return this.call();
    }

    public List call() throws Exception {
        return new ArrayList();
    }
}

