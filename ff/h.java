package ff;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class h extends DelegatingSimpleTypeImpl {
    public final int c;

    public h(int v, SimpleType simpleType0, boolean z) {
        this.c = v;
        super(simpleType0);
    }

    public h(SimpleType simpleType0, int v) {
        this.c = v;
        if(v != 1) {
            Intrinsics.checkNotNullParameter(simpleType0, "delegate");
            super(simpleType0);
            return;
        }
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        super(simpleType0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final boolean isMarkedNullable() {
        return this.c != 0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType replaceDelegate(SimpleType simpleType0) {
        if(this.c != 0) {
            Intrinsics.checkNotNullParameter(simpleType0, "delegate");
            return new h(simpleType0, 1);
        }
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        return new h(simpleType0, 0);
    }
}

