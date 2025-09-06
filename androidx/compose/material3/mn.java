package androidx.compose.material3;

import aa.w;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class mn extends Lambda implements Function3 {
    public final TabPosition w;

    public mn(TabPosition tabPosition0) {
        this.w = tabPosition0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(-1541271084);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541271084, v, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1265)");
        }
        State state0 = AnimateAsStateKt.animateDpAsState-AjpBEmI(this.w.getWidth-D9Ej5fM(), TabRowKt.c, null, null, ((Composer)object1), 0, 12);
        State state1 = AnimateAsStateKt.animateDpAsState-AjpBEmI(this.w.getLeft-D9Ej5fM(), TabRowKt.c, null, null, ((Composer)object1), 0, 12);
        Modifier modifier0 = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(((Modifier)object0), 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null);
        boolean z = ((Composer)object1).changed(state1);
        w w0 = ((Composer)object1).rememberedValue();
        if(z || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(state1, 3);
            ((Composer)object1).updateRememberedValue(w0);
        }
        Modifier modifier1 = SizeKt.width-3ABfNKs(OffsetKt.offset(modifier0, w0), ((Dp)state0.getValue()).unbox-impl());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

