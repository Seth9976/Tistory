package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function4 {
    public final Function4 w;

    public l0(Function4 function40) {
        this.w = function40;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object0).intValue();
        int v1 = ((Number)object3).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-8464804, v1, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:91)");
        }
        ContextualFlowRowScopeImpl contextualFlowRowScopeImpl0 = new ContextualFlowRowScopeImpl(((FlowLineInfo)object1).getLineIndex$foundation_layout_release(), ((FlowLineInfo)object1).getPositionInLine$foundation_layout_release(), ((FlowLineInfo)object1).getMaxMainAxisSize-D9Ej5fM$foundation_layout_release(), ((FlowLineInfo)object1).getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release(), null);
        this.w.invoke(contextualFlowRowScopeImpl0, v, ((Composer)object2), ((int)(v1 << 3 & 0x70)));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

