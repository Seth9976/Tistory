package jg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.serialization.json.JsonElement;

public final class k extends Lambda implements Function1 {
    public final ObjectRef w;

    public k(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((JsonElement)object0), "it");
        this.w.element = (JsonElement)object0;
        return Unit.INSTANCE;
    }
}

