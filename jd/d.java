package jd;

import io.reactivex.functions.Function3;

public final class d implements Function3 {
    public final c a;

    public d(c c0) {
        this.a = c0;
    }

    @Override  // io.reactivex.functions.Function3
    public final Object apply(Object object0, Object object1, Object object2) {
        return this.a.invoke(object0, object1, object2);
    }
}

