package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;

public final class d extends Lambda implements Function0 {
    public final int w;
    public final MemberDeserializer x;
    public final ExtendableMessage y;
    public final AnnotatedCallableKind z;

    public d(MemberDeserializer memberDeserializer0, ExtendableMessage generatedMessageLite$ExtendableMessage0, AnnotatedCallableKind annotatedCallableKind0, int v) {
        this.w = v;
        this.x = memberDeserializer0;
        this.y = generatedMessageLite$ExtendableMessage0;
        this.z = annotatedCallableKind0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            MemberDeserializer memberDeserializer0 = this.x;
            ProtoContainer protoContainer0 = memberDeserializer0.a(memberDeserializer0.a.getContainingDeclaration());
            if(protoContainer0 != null) {
                List list0 = memberDeserializer0.a.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainer0, this.y, this.z);
                return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        MemberDeserializer memberDeserializer1 = this.x;
        ProtoContainer protoContainer1 = memberDeserializer1.a(memberDeserializer1.a.getContainingDeclaration());
        if(protoContainer1 != null) {
            List list1 = CollectionsKt___CollectionsKt.toList(memberDeserializer1.a.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainer1, this.y, this.z));
            return list1 == null ? CollectionsKt__CollectionsKt.emptyList() : list1;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

