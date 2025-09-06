package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class ao extends Lambda implements Function3 {
    public final int w;

    public ao(int v) {
        this.w = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((v & 8) == 0 ? ((Composer)object1).changed(((TabIndicatorScope)object0)) : ((Composer)object1).changedInstance(((TabIndicatorScope)object0))) ? 4 : 2);
        }
        if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1116978D, v, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:212)");
        }
        Modifier modifier0 = ((TabIndicatorScope)object0).tabIndicatorOffset(Modifier.Companion, this.w, false);
        TabRowDefaults.INSTANCE.SecondaryIndicator-9IZ8Weo(modifier0, 0.0f, 0L, ((Composer)object1), 0xC00, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

