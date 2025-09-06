package kotlin.reflect.jvm.internal;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final Data w;

    public e(Data kClassImpl$Data0) {
        this.w = kClassImpl$Data0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt___CollectionsKt.plus(Data.access$getDeclaredStaticMembers(this.w), Data.access$getInheritedStaticMembers(this.w));
    }
}

