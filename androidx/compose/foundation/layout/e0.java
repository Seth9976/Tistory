package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function2 {
    public final FlowLayoutOverflowState w;
    public final Function3 x;

    public e0(FlowLayoutOverflowState flowLayoutOverflowState0, Function3 function30) {
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
            ComposerKt.traceEventStart(0x81A84FF6, v, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:627)");
        }
        ContextualFlowColumnOverflowScopeImpl contextualFlowColumnOverflowScopeImpl0 = new ContextualFlowColumnOverflowScopeImpl(this.w);
        this.x.invoke(contextualFlowColumnOverflowScopeImpl0, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

