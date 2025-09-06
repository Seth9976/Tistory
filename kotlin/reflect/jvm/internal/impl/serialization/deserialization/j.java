package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;

public final class j extends Lambda implements Function0 {
    public final int A;
    public final ValueParameter B;
    public final MemberDeserializer w;
    public final ProtoContainer x;
    public final ExtendableMessage y;
    public final AnnotatedCallableKind z;

    public j(MemberDeserializer memberDeserializer0, ProtoContainer protoContainer0, ExtendableMessage generatedMessageLite$ExtendableMessage0, AnnotatedCallableKind annotatedCallableKind0, int v, ValueParameter protoBuf$ValueParameter0) {
        this.w = memberDeserializer0;
        this.x = protoContainer0;
        this.y = generatedMessageLite$ExtendableMessage0;
        this.z = annotatedCallableKind0;
        this.A = v;
        this.B = protoBuf$ValueParameter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt___CollectionsKt.toList(this.w.a.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.x, this.y, this.z, this.A, this.B));
    }
}

