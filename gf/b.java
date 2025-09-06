package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class b extends f {
    public b() {
        super("ACCEPT_NULL", 1);
    }

    @Override  // gf.f
    public final f a(UnwrappedType unwrappedType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "nextType");
        return f.b(unwrappedType0);
    }
}

