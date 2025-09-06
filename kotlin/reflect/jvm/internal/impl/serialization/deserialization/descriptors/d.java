package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;

public final class d extends Lambda implements Function0 {
    public final DeserializedClassDescriptor w;
    public final EnumEntry x;

    public d(DeserializedClassDescriptor deserializedClassDescriptor0, EnumEntry protoBuf$EnumEntry0) {
        this.w = deserializedClassDescriptor0;
        this.x = protoBuf$EnumEntry0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt___CollectionsKt.toList(this.w.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(this.w.getThisAsProtoContainer$deserialization(), this.x));
    }
}

