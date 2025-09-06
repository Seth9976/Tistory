package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class vj extends Lambda implements Function2 {
    public final int w;
    public final boolean x;

    public vj(boolean z, int v) {
        this.w = v;
        this.x = z;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x499D9180, v, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:215)");
            }
            SegmentedButtonDefaults.INSTANCE.Icon(this.x, null, null, ((Composer)object0), 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(970447394, v1, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:137)");
        }
        SegmentedButtonDefaults.INSTANCE.Icon(this.x, null, null, ((Composer)object0), 0xC00, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

