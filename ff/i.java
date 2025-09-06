package ff;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

public final class i extends DelegatingSimpleTypeImpl {
    public final TypeAttributes c;

    public i(SimpleType simpleType0, TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        super(simpleType0);
        this.c = typeAttributes0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final TypeAttributes getAttributes() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType replaceDelegate(SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        return new i(simpleType0, this.c);
    }
}

