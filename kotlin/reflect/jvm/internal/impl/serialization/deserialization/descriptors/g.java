package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final DeserializedClassDescriptor w;

    public g(DeserializedClassDescriptor deserializedClassDescriptor0) {
        this.w = deserializedClassDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt___CollectionsKt.toList(this.w.getC().getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(this.w.getThisAsProtoContainer$deserialization()));
    }
}

