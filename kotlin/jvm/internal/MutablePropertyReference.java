package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KMutableProperty;

public abstract class MutablePropertyReference extends PropertyReference implements KMutableProperty {
    public MutablePropertyReference() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference(Object object0) {
        super(object0);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference(Object object0, Class class0, String s, String s1, int v) {
        super(object0, class0, s, s1, v);
    }
}

