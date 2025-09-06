package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;

public final class e extends Lambda implements Function0 {
    public final MemberDeserializer w;
    public final boolean x;
    public final Property y;

    public e(MemberDeserializer memberDeserializer0, boolean z, Property protoBuf$Property0) {
        this.w = memberDeserializer0;
        this.x = z;
        this.y = protoBuf$Property0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0;
        MemberDeserializer memberDeserializer0 = this.w;
        ProtoContainer protoContainer0 = memberDeserializer0.a(memberDeserializer0.a.getContainingDeclaration());
        if(protoContainer0 != null) {
            Property protoBuf$Property0 = this.y;
            if(this.x) {
                list0 = CollectionsKt___CollectionsKt.toList(memberDeserializer0.a.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainer0, protoBuf$Property0));
                return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
            }
            list0 = CollectionsKt___CollectionsKt.toList(memberDeserializer0.a.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainer0, protoBuf$Property0));
            return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

