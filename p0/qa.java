package p0;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class qa extends Lambda implements Function3 {
    public final TabPosition w;

    public qa(TabPosition tabPosition0) {
        this.w = tabPosition0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(0xE83B7019);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE83B7019, v, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:412)");
        }
        State state0 = AnimateAsStateKt.animateDpAsState-AjpBEmI(this.w.getWidth-D9Ej5fM(), AnimationSpecKt.tween$default(0xFA, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, ((Composer)object1), 0, 12);
        State state1 = AnimateAsStateKt.animateDpAsState-AjpBEmI(this.w.getLeft-D9Ej5fM(), AnimationSpecKt.tween$default(0xFA, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, ((Composer)object1), 0, 12);
        Modifier modifier0 = SizeKt.width-3ABfNKs(OffsetKt.offset-VpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(((Modifier)object0), 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null), ((Dp)state1.getValue()).unbox-impl(), 0.0f, 2, null), ((Dp)state0.getValue()).unbox-impl());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return modifier0;
    }
}

