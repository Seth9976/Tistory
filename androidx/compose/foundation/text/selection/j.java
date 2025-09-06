package androidx.compose.foundation.text.selection;

import androidx.compose.material3.bk;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function3 {
    public final int w;
    public final boolean x;
    public final Object y;

    public j(Object object0, boolean z, int v) {
        this.w = v;
        this.y = object0;
        this.x = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
            return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight(), null, new bk(((MutableIntState)this.y), this.x, placeable0), 4, null);
        }
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0xF44568FA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF44568FA, v, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
        }
        long v1 = ((TextSelectionColors)((Composer)object1).consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getHandleColor-0d7_KjU();
        boolean z = ((Composer)object1).changed(v1);
        Function0 function00 = (Function0)this.y;
        boolean z1 = ((Composer)object1).changed(function00);
        boolean z2 = this.x;
        boolean z3 = ((Composer)object1).changed(z2);
        i i0 = ((Composer)object1).rememberedValue();
        if((z | z1 | z3) != 0 || i0 == Composer.Companion.getEmpty()) {
            i0 = new i(v1, function00, z2);
            ((Composer)object1).updateRememberedValue(i0);
        }
        Modifier modifier0 = DrawModifierKt.drawWithCache(((Modifier)object0), i0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

