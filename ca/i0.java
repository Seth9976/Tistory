package ca;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.room.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function3 {
    public final BoxScopeInstance w;

    public i0(BoxScopeInstance boxScopeInstance0) {
        this.w = boxScopeInstance0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = a.c(((Number)object2), ((Modifier)object0), "$this$byOrientation", ((Composer)object1), 0xD4402922);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD4402922, v, -1, "com.kakao.kandinsky.designsystem.common.FeatureBottomBar.<anonymous>.<anonymous> (FeatureBottomBar.kt:89)");
        }
        Modifier modifier0 = this.w.align(((Modifier)object0), Alignment.Companion.getBottomCenter());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

