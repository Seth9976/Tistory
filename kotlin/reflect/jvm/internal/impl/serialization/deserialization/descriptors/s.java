package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final int w;
    public final u x;
    public final DeserializedMemberScope y;

    public s(u u0, DeserializedMemberScope deserializedMemberScope0, int v) {
        this.w = v;
        this.x = u0;
        this.y = deserializedMemberScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w == 0 ? g0.plus(this.x.a.keySet(), this.y.getNonDeclaredFunctionNames()) : g0.plus(this.x.b.keySet(), this.y.getNonDeclaredVariableNames());
    }
}

