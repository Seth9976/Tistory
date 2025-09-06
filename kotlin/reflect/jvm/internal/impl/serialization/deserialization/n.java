package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;

public final class n extends Lambda implements Function1 {
    public final TypeDeserializer w;

    public n(TypeDeserializer typeDeserializer0) {
        this.w = typeDeserializer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Type)object0), "it");
        return ProtoTypeTableUtilKt.outerType(((Type)object0), this.w.a.getTypeTable());
    }
}

