package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class cg extends Lambda implements Function3 {
    public final int w;
    public final Function2 x;

    public cg(Function2 function20, int v) {
        this.w = v;
        this.x = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                BoxScope boxScope0 = (BoxScope)object0;
                int v1 = ((Number)object2).intValue();
                if((v1 & 17) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(870803363, v1, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                }
                this.x.invoke(((Composer)object1), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                AnimatedVisibilityScope animatedVisibilityScope0 = (AnimatedVisibilityScope)object0;
                int v2 = ((Number)object2).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-750750819, v2, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:579)");
                }
                this.x.invoke(((Composer)object1), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                Unit unit0 = (Unit)object0;
                int v = ((Number)object2).intValue();
                if((v & 17) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1079330685, v, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                this.x.invoke(((Composer)object1), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

