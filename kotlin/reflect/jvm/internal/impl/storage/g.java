package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;

public final class g {
    public final Object a;
    public final Function0 b;

    public g(Object object0, Function0 function00) {
        this.a = object0;
        this.b = function00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return g.class == class0 && this.a.equals(((g)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

