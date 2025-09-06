package u;

import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class u1 extends Lambda implements Function0 {
    public final ObjectRef w;
    public final v1 x;

    public u1(ObjectRef ref$ObjectRef0, v1 v10) {
        this.w = ref$ObjectRef0;
        this.x = v10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.element = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.x, PinnableContainerKt.getLocalPinnableContainer());
        return Unit.INSTANCE;
    }
}

