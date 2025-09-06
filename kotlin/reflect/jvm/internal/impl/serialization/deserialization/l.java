package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

public final class l extends Lambda implements Function0 {
    public final TypeDeserializer w;
    public final Type x;

    public l(Type protoBuf$Type0, TypeDeserializer typeDeserializer0) {
        this.w = typeDeserializer0;
        this.x = protoBuf$Type0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AnnotationAndConstantLoader annotationAndConstantLoader0 = this.w.a.getComponents().getAnnotationAndConstantLoader();
        NameResolver nameResolver0 = this.w.a.getNameResolver();
        return annotationAndConstantLoader0.loadTypeAnnotations(this.x, nameResolver0);
    }
}

