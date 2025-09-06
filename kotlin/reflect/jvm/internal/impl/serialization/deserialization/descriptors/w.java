package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final DeserializedTypeParameterDescriptor w;

    public w(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor0) {
        this.w = deserializedTypeParameterDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt___CollectionsKt.toList(this.w.k.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(this.w.getProto(), this.w.k.getNameResolver()));
    }
}

