package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final int w;
    public final TypeDeserializer x;

    public k(TypeDeserializer typeDeserializer0, int v) {
        this.w = v;
        this.x = typeDeserializer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.w == 0 ? TypeDeserializer.access$computeClassifierDescriptor(this.x, ((Number)object0).intValue()) : TypeDeserializer.access$computeTypeAliasDescriptor(this.x, ((Number)object0).intValue());
    }
}

