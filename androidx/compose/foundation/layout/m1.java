package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class m1 extends Lambda implements Function2 {
    public final FlowLayoutOverflowState w;
    public final Function3 x;

    public m1(FlowLayoutOverflowState flowLayoutOverflowState0, Function3 function30) {
        this.w = flowLayoutOverflowState0;
        this.x = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1004384103, v, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:323)");
        }
        FlowColumnOverflowScopeImpl flowColumnOverflowScopeImpl0 = new FlowColumnOverflowScopeImpl(this.w);
        this.x.invoke(flowColumnOverflowScopeImpl0, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

