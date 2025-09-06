package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class c extends f {
    public c() {
        super("NOT_NULL", 3);
    }

    @Override  // gf.f
    public final f a(UnwrappedType unwrappedType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "nextType");
        return this;
    }
}

