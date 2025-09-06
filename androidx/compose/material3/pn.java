package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class pn extends Lambda implements Function3 {
    public final int w;

    public pn(int v) {
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
            ComposerKt.traceEventStart(-2021049253, v, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:157)");
        }
        Modifier modifier0 = ((TabIndicatorScope)object0).tabIndicatorOffset(Modifier.Companion, this.w, true);
        TabRowDefaults.INSTANCE.PrimaryIndicator-10LGxhE(modifier0, NaNf, 0.0f, 0L, null, ((Composer)object1), 0x30030, 28);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

