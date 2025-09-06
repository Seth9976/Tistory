package cd;

import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

public final class k implements Function, Callable {
    public final Object a;

    public k(Object object0) {
        this.a = object0;
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        return this.a;
    }

    @Override
    public final Object call() {
        return this.a;
    }
}

