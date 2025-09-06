package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

public final class g extends Lambda implements Function0 {
    public final MemberDeserializer w;
    public final Property x;
    public final DeserializedPropertyDescriptor y;

    public g(MemberDeserializer memberDeserializer0, Property protoBuf$Property0, DeserializedPropertyDescriptor deserializedPropertyDescriptor0) {
        this.w = memberDeserializer0;
        this.x = protoBuf$Property0;
        this.y = deserializedPropertyDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.a.getStorageManager().createNullableLazyValue(new f(this.w, this.x, this.y));
    }
}

