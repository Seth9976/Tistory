package androidx.compose.foundation.text.selection;

import aa.m;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function3 {
    public final SelectionManager w;

    public k1(SelectionManager selectionManager0) {
        this.w = selectionManager0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(-1914520728);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1914520728, v, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:49)");
        }
        Density density0 = (Density)((Composer)object1).consume(CompositionLocalsKt.getLocalDensity());
        MutableState mutableState0 = ((Composer)object1).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(IntSize.box-impl(0L), null, 2, null);
            ((Composer)object1).updateRememberedValue(mutableState0);
        }
        SelectionManager selectionManager0 = this.w;
        boolean z = ((Composer)object1).changedInstance(selectionManager0);
        m m0 = ((Composer)object1).rememberedValue();
        if(z || m0 == composer$Companion0.getEmpty()) {
            m0 = new m(1, selectionManager0, mutableState0);
            ((Composer)object1).updateRememberedValue(m0);
        }
        boolean z1 = ((Composer)object1).changed(density0);
        j1 j10 = ((Composer)object1).rememberedValue();
        if(z1 || j10 == composer$Companion0.getEmpty()) {
            j10 = new j1(density0, mutableState0);
            ((Composer)object1).updateRememberedValue(j10);
        }
        Modifier modifier0 = SelectionMagnifierKt.animatedSelectionMagnifier(((Modifier)object0), m0, j10);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

