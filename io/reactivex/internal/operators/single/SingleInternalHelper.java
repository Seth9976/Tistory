package io.reactivex.internal.operators.single;

import com.bumptech.glide.load.engine.w;
import gd.u;
import gd.v;
import gd.x;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

public final class SingleInternalHelper {
    public static Callable emptyThrower() {
        return u.a;
    }

    public static Iterable iterableToFlowable(Iterable iterable0) {
        return new w(iterable0, 1);
    }

    public static Function toFlowable() {
        return v.a;
    }

    public static Function toObservable() {
        return x.a;
    }
}

