package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final DeserializedClassDescriptor w;

    public j(DeserializedClassDescriptor deserializedClassDescriptor0) {
        this.w = deserializedClassDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return DeserializedClassDescriptor.access$computeConstructors(this.w);
    }
}

