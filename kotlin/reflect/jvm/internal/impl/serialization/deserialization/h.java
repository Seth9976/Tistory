package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class h extends Lambda implements Function0 {
    public final MemberDeserializer w;
    public final Property x;
    public final DeserializedPropertyDescriptor y;

    public h(MemberDeserializer memberDeserializer0, Property protoBuf$Property0, DeserializedPropertyDescriptor deserializedPropertyDescriptor0) {
        this.w = memberDeserializer0;
        this.x = protoBuf$Property0;
        this.y = deserializedPropertyDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProtoContainer protoContainer0 = this.w.a(this.w.a.getContainingDeclaration());
        Intrinsics.checkNotNull(protoContainer0);
        AnnotationAndConstantLoader annotationAndConstantLoader0 = this.w.a.getComponents().getAnnotationAndConstantLoader();
        KotlinType kotlinType0 = this.y.getReturnType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "property.returnType");
        return (ConstantValue)annotationAndConstantLoader0.loadAnnotationDefaultValue(protoContainer0, this.x, kotlinType0);
    }
}

