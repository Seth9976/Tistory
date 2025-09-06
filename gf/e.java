package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class e extends f {
    public e() {
        super("UNKNOWN", 2);
    }

    @Override  // gf.f
    public final f a(UnwrappedType unwrappedType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "nextType");
        f f0 = f.b(unwrappedType0);
        return f0 == f.b ? this : f0;
    }
}

