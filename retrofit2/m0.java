package retrofit2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class m0 implements GenericArrayType {
    public final Type a;

    public m0(Type type0) {
        this.a = type0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof GenericArrayType && p0.c(this, ((GenericArrayType)object0));
    }

    @Override
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return p0.q(this.a) + "[]";
    }
}

