package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;

public final class a extends Lambda implements Function1 {
    public final KSerializer w;

    public a(KSerializer kSerializer0) {
        this.w = kSerializer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "it");
        return this.w;
    }
}

