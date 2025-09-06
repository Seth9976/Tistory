package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.LinkedHashSet;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;

public final class q extends Lambda implements Function0 {
    public final r w;
    public final DeserializedMemberScope x;

    public q(r r0, DeserializedMemberScope deserializedMemberScope0) {
        this.w = r0;
        this.x = deserializedMemberScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r r0 = this.w;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: r0.b) {
            linkedHashSet0.add(NameResolverUtilKt.getName(r0.n.getC().getNameResolver(), ((Property)(((MessageLite)object0))).getName()));
        }
        return g0.plus(linkedHashSet0, this.x.getNonDeclaredVariableNames());
    }
}

