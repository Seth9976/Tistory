package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class u1 extends Lambda implements Function1 {
    public final ObjectRef w;

    public u1(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.w.element = (Placeable)object0;
        return Unit.INSTANCE;
    }
}

