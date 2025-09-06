package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class s1 extends Lambda implements Function0 {
    public final ObjectRef w;

    public s1(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((Function0)this.w.element).invoke();
        return Unit.INSTANCE;
    }
}

