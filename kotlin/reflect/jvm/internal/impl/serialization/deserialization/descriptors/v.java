package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final DeserializedMemberScope w;

    public v(DeserializedMemberScope deserializedMemberScope0) {
        this.w = deserializedMemberScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set set0 = this.w.getNonDeclaredClassifierNames();
        return set0 == null ? null : g0.plus(g0.plus(this.w.getClassNames$deserialization(), this.w.b.getTypeAliasNames()), set0);
    }
}

