package u;

import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class c1 extends Lambda implements Function1 {
    public final BooleanRef w;

    public c1(BooleanRef ref$BooleanRef0) {
        this.w = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z;
        BooleanRef ref$BooleanRef0 = this.w;
        if(ref$BooleanRef0.element) {
            z = true;
        }
        else {
            Intrinsics.checkNotNull(((TraversableNode)object0), "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            z = ((ScrollableContainerNode)(((TraversableNode)object0))).getEnabled();
        }
        ref$BooleanRef0.element = z;
        return Boolean.valueOf(!z);
    }
}

