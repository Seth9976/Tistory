package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class d extends f {
    public d() {
        super("START", 0);
    }

    @Override  // gf.f
    public final f a(UnwrappedType unwrappedType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "nextType");
        return f.b(unwrappedType0);
    }
}

